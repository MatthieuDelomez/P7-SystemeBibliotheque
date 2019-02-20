
package org.projet.biblio.consumer.daoImpl;

import java.util.List;
import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.ClientDao;
import static org.projet.biblio.consumer.daoImpl.AbstractDaoImpl.getJdbcTemplate;
import org.projet.biblio.consumer.rowMapper.ClientMapper;
import org.projet.biblio.model.Client;
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

public class ClientDaoImpl extends AbstractDaoImpl implements ClientDao {

                      /* Variable DataSource*/

	private DataSource dataSource;

        

                   /* Méthode pour ajouter un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

                     @Override
	public void addClient(Client client) {

            
	JdbcTemplate jdbcTemplate =  getJdbcTemplate();
        
                      if (client.getPseudo() == null ) {
                          
                      }

                      /* Nom des colonnes se situant dans table de la base de données*/

	String sql = "INSERT INTO client ( refbibliotheque, nom, prenom, sexe, pseudo,  motpasse, adresse, email, codepostal) VALUES (?,?,?,?,?,?,?,?,?);";

		

	Object[] args = new Object[] {client.getRefBibliotheque(), client.getNom(),client.getPrenom(), client.getSexe(), client.getPseudo(), client.getMotPasse(), 
            
                                                                             client.getAdresse(), client.getEmail(), client.getCodePostal() };
 

                       try {

                       jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                       }

	 }


                       /* Méthode pour Log un Client*/

                      /*Classe hérité de la classe Parente AbstractDaoImpl*/

	 @Override
                        public Client getClient(Client client) {


	String sql = "SELECT * FROM client WHERE  pseudo = ? AND motpasse = ?";

	JdbcTemplate jdbcTemplate = getJdbcTemplate();

	Object[] args = new Object[] {   client.getPseudo(), client.getMotPasse() };


                       try {

                      RowMapper<Client> rowMapper = new ClientMapper();

                       /*Appel de la méthode QueryForObject*/

                       Client userQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);

                       return userQuery;



                       } catch (EmptyResultDataAccessException exception) {

                      System.out.println("Incorrect");

                      return null;

                      }

	}
                        
                        
                      /*Méthode pour afficher une liste de tout les clients*/
                     @Override
        	public List<Client> getAllClient() {


                      String sql = "SELECT * FROM client";

                      JdbcTemplate jdbcTemplate = getJdbcTemplate();


                      try {

	List<Client> publicationQuery = jdbcTemplate.query(sql,

	new BeanPropertyRowMapper(Client.class));

	return publicationQuery;


	} catch (EmptyResultDataAccessException exception) {

	System.out.println("Incorrect");

	return null;

	}

	}
                
                      /*Méthode pour récupérer une liste d'email client*/
                      @Override
                      public List<Client> getEmailClient() {
                          
                      String sql = "SELECT * FROM client ";
                      
                      
                      JdbcTemplate jdbcTemplate = getJdbcTemplate();
                      
                      
                      try {

	List<Client> publicationQuery = jdbcTemplate.query(sql,

	new BeanPropertyRowMapper(Client.class));

	return publicationQuery;


	} catch (EmptyResultDataAccessException exception) {

	System.out.println("Incorrect");

	return null;

	}

	
                          
                      }



	@Override
	public void deleteClientPicture(Client client) {

	}


	@Override
	public void updateClient(Client client) {


	}


                      /*
                      Méthode pour supprimer un Client.
                      */
	@Override
	public void deleteClient(Client client) {
            
                      JdbcTemplate jdbcTemplate = getJdbcTemplate();
                     
                     String sql = "DELETE FROM client WHERE refclient = ?";
                     
                     System.out.println(sql);
                     
                     Object[] args = new Object[] { client.getRefClient() };
                     
                     
                     try {

                      jdbcTemplate.update(sql, args);

                      } catch (DuplicateKeyException exception) {

                      System.out.println(exception.getMessage());

                      }

	}



	}

                      