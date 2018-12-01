/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.daoImpl;

import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.UtilisateurDao;
import org.projet.biblio.consumer.rowMapper.UtilisateurMapper;
import org.projet.biblio.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

     /* Variable DataSource*/

	private DataSource dataSource;

        

                   /* Méthode pour ajouter un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

                  @Override

	public void addUser(Utilisateur user) {



		JdbcTemplate jdbcTemplate =  getJdbcTemplate();

                                      /* Nom des colonnes se situant dans table de la base de données*/

		String sql = "INSERT INTO utilisateur (refclient, nom, prenom, sexe, pseudo,  motpasse, adresse, email, codepostal) VALUES (?,?,?,?,?,?,?,?,?);";

		

	Object[] args = new Object[] {user.getRefClient(),user.getNom(),user.getPrenom(), user.getSexe(), user.getPseudo(), user.getMotPasse(), 
            
                                                                                         user.getAdresse(), user.getEmail(), user.getCodePostal() };

		

        

                                       try {

                                             jdbcTemplate.update(sql, args);

                                       } catch (DuplicateKeyException exception) {

                                            System.out.println(exception.getMessage());

                             }





	          }

 



	



                   /* Méthode pour récupérer un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

	@Override

	public Utilisateur getUser(Utilisateur user) {



		String sql = "SELECT * FROM utilisateur WHERE  email = ? AND motpasse = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		

		Object[] args = new Object[] {

				 user.getEmail(), user.getMotPasse()

		};



                

        

        try {

            RowMapper<Utilisateur> rowMapper = new UtilisateurMapper();

            /*Appel de la méthode QueryForObject*/

            Utilisateur userQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);

            return userQuery;



        } catch (EmptyResultDataAccessException exception) {

            System.out.println("Incorrect");

            return null;

        }

		

		

	}



	@Override

	public void deleteUserPicture(Utilisateur user) {

		// TODO Auto-generated method stub



	}



	@Override

	public void updateUser(Utilisateur user) {

		// TODO Auto-generated method stub



	}



	@Override

	public void deleteUser(Utilisateur user) {

		// TODO Auto-generated method stub



	}



}