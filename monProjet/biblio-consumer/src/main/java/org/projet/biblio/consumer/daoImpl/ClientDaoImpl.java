/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.daoImpl;

import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.ClientDao;
import org.projet.biblio.consumer.rowMapper.ClientMapper;
import org.projet.biblio.model.Client;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class ClientDaoImpl extends AbstractDaoImpl implements ClientDao {

     /* Variable DataSource*/

	private DataSource dataSource;

        

                   /* Méthode pour ajouter un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

                  @Override
	public void addClient(Client client) {



		JdbcTemplate jdbcTemplate =  getJdbcTemplate();

                                      /* Nom des colonnes se situant dans table de la base de données*/

		String sql = "INSERT INTO client (refclient, refbibliotheque, nom, prenom, sexe, pseudo,  motpasse, adresse, email, codepostal) VALUES (?,?,?,?,?,?,?,?,?,?);";

		

	Object[] args = new Object[] {client.getRefClient(), client.getRefBibliotheque(), client.getNom(),client.getPrenom(), client.getSexe(), client.getPseudo(), client.getMotPasse(), 
            
                                                                                         client.getAdresse(), client.getEmail(), client.getCodePostal() };

		

        

		

        

                                       try {

                                             jdbcTemplate.update(sql, args);

                                       } catch (DuplicateKeyException exception) {

                                            System.out.println(exception.getMessage());

                             }






	          }

 



	



                   /* Méthode pour récupérer un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

	                     @Override
                                        public Client getClient(Client client) {



		String sql = "SELECT * FROM utilisateur WHERE  email = ? AND motpasse = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		

		Object[] args = new Object[] {

				 client.getEmail(), client.getMotPasse()

		};



                

        

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



	@Override

	public void deleteClientPicture(Client client) {

		// TODO Auto-generated method stub



	}



	@Override

	public void updateClient(Client client) {

		// TODO Auto-generated method stub



	}



	@Override

	public void deleteClient(Client client) {

		// TODO Auto-generated method stub



	}



}