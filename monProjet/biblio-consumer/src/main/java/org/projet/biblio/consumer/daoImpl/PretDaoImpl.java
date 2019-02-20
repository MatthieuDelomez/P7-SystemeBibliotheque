
package org.projet.biblio.consumer.daoImpl;

import java.util.List;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.rowMapper.PretMapper;
import org.projet.biblio.model.InfoPret;
import org.projet.biblio.model.Pret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC.
 * 
 *
 * @author Delomez Matthieu
 */
public class PretDaoImpl extends AbstractDaoImpl implements PretDao {




                   /*Classe hérité de la classe Parente AbstractDaoImpl*/    
                     @Override
	public void addPret(Pret pret) {

		

	JdbcTemplate jdbcTemplate = getJdbcTemplate();

                      /*
                      Méthode INSERT qui a pour objectif de créer un nouveau pret.
                      */

	String sql = "INSERT INTO pret ( refclient, refouvrage, datepret, dureepret, datefinpret, nbrexemplaire, prolonger) VALUES (?,?,?,?,?,?,?);";


	 Object[] args = new Object[] { pret.getRefClient(), pret.getRefOuvrage(), pret.getDatePret(), pret.getDureePret(), pret.getDateFinPret(),
                                   
                                                                              pret.getNbrExemplaire(), pret.isProlonger() };

                      try {

                      jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                      }

	}


                      /*
                      Méthode SELECT  pour pouvoir récupérer un prêt en fonction de sa référence.
                      */
                     @Override
	public Pret getPret(Pret pret) {

	String sql = "SELECT * FROM pret WHERE refpret = ? ";

	JdbcTemplate jdbcTemplate = getJdbcTemplate();

	Object[] args = new Object[] { pret.getRefPret() };



	try {

	RowMapper<Pret> rowMapper = new PretMapper();

                      /* Appel à la méthodes QueryForObject*/

	Pret pretQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);

	return pretQuery;


	} catch (EmptyResultDataAccessException exception) {

	return null;

	}

	}


                     /*Méthode pour afficher une liste de  tout les prets*/
                     @Override
        	public List<Pret> getAllPret() {

                      String sql = "SELECT * FROM pret";

                      JdbcTemplate jdbcTemplate = getJdbcTemplate();


	try {

	List<Pret> publicationQuery = jdbcTemplate.query(sql,

	new BeanPropertyRowMapper(Pret.class));

	return publicationQuery;


	} catch (EmptyResultDataAccessException exception) {

	return null;

	}

	}
                
                /*
                Méthode pour le Batch :
                Récupérer le nom de l'ouvrage + email du client + date de fin du pret.
                
                Si la date du jour est supérieur à la date de fin du pret alors recupérer les email client.
                */
                @Override
                 public List<InfoPret> getInfoPret() {
                
                String sql = "SELECT c.email AS email, d.nomouvrage AS nomouvrage, p.datefinpret AS datefinpret FROM pret p, client c, document d WHERE datefinpret < CURRENT_DATE and c.refClient = p.refClient and d.refouvrage = p.refouvrage;";
                
                
                 JdbcTemplate jdbcTemplate = getJdbcTemplate();


	try {

	List<InfoPret> publicationQuery = jdbcTemplate.query(sql,

	new BeanPropertyRowMapper(InfoPret.class));

	return publicationQuery;


	} catch (EmptyResultDataAccessException exception) {

	return null;

	}

	}
                
                
                 
                
                
                
                    @Override
	public void deletePretPicture(Pret pret) {

	}

                    @Override
	public void updatePret(Pret pret) {

	}
        
        
                      /*
                     Supprimer un pret par la référence et sa durée
                      */
                    @Override
	public void deletePret(Pret pret) {
            
                     JdbcTemplate jdbcTemplate = getJdbcTemplate();
                     
                     String sql = "DELETE FROM pret WHERE refpret = ? AND dureepret = ?";
                     
                     System.out.println(sql);
                     
                     Object[] args = new Object[] { pret.getRefPret(), pret.getDureePret() };
                     
                     
                     try {

                      jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                      }

	}
            

	}




