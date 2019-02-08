
package org.projet.biblio.consumer.daoImpl;

import java.util.List;
import org.projet.biblio.consumer.dao.PretDao;
import org.projet.biblio.consumer.rowMapper.PretMapper;
import org.projet.biblio.model.Pret;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class PretDaoImpl extends AbstractDaoImpl implements PretDao {




                   /*Classe hérité de la classe Parente AbstractDaoImpl*/    
                     @Override
	public void addPret(Pret pret) {

		

	JdbcTemplate jdbcTemplate = getJdbcTemplate();

                      /* Nom des colonnes se situant dans table de la base de données*/

	String sql = "INSERT INTO pret ( refpret, refclient, refouvrage, datepret, dureepret, datefinpret, nbrexemplaire, prolonger) VALUES (?,?,?,?,?,?,?,?);";


	 Object[] args = new Object[] {pret.getRefPret(), pret.getRefClient(), pret.getRefOuvrage(), pret.getDatePret(), pret.getDureePret(), pret.getDateFinPret(),
                                   
                                                                              pret.getNbrExemplaire(), pret.isProlonger() };

                      try {

                      jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                      }

	}



                     /*Classe hérité de la classe Parente AbstractDaoImpl*/
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


                     /*Méthode pour afficher une liste de pret*/
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
                
                
                
                    @Override
	public void deletePretPicture(Pret pret) {

	}

                    @Override
	public void updatePret(Pret pret) {

	}
        
        

                    @Override
	public void deletePret(Pret pret) {
            
                     JdbcTemplate jdbcTemplate = getJdbcTemplate();
                     
                     String sql = "DELETE FROM pret WHERE refpret = ? AND datefinpret = ?";
                     
                     System.out.println(sql);
                     
                     Object[] args = new Object[] { pret.getRefPret(), pret.getDateFinPret() };
                     
                     
                     try {

                      jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                      }

	}
            

	}




