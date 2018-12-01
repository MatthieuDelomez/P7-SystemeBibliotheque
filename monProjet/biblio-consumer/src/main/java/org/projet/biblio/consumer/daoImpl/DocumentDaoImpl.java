/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.daoImpl;

import java.util.List;
import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.DocumentDao;
import org.projet.biblio.consumer.rowMapper.DocumentMapper;
import org.projet.biblio.model.Document;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class DocumentDaoImpl extends AbstractDaoImpl implements DocumentDao {
    
  /* Variable DataSource*/

	private DataSource dataSource;

        

                   /* Méthode pour ajouter un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

                  @Override
	public void addDocument(Document document) {



		JdbcTemplate jdbcTemplate =  getJdbcTemplate();

                                      /* Nom des colonnes se situant dans table de la base de données*/

		String sql = "INSERT INTO document (refouvrage, nomouvrage, quantitetotal, nbremprunte, quantiterestante) VALUES (?,?,?,?,?);";

		

	Object[] args = new Object[] {document.getRefOuvrage(),document.getNomOuvrage(),document.getQuantiteTotal(), document.getNbrEmprunte(), document.getQuantiteRestante() };

		

        

                                       try {

                                             jdbcTemplate.update(sql, args);

                                       } catch (DuplicateKeyException exception) {

                                            System.out.println(exception.getMessage());

                             }
         }




                   /* Méthode pour récupérer un Utilisateur*/

                   /*Classe hérité de la classe Parente AbstractDaoImpl*/

	@Override
	public Document getDocument(Document document) {



		String sql = "SELECT * FROM document WHERE  refouvrage = ? AND nomouvrage = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		

		Object[] args = new Object[] {

				 document.getRefOuvrage(), document.getNomOuvrage()

		};



                

        

        try {

            RowMapper<Document> rowMapper = new DocumentMapper();

            /*Appel de la méthode QueryForObject*/

            Document userQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);

            return userQuery;



        } catch (EmptyResultDataAccessException exception) {

            System.out.println("Incorrect");

            return null;

        }

		

		

	}



	@Override
	public void deleteDocumentPicture(Document document) {

		// TODO Auto-generated method stub



	}



	@Override
	public void updateDocument(Document document) {

		// TODO Auto-generated method stub



	}



	@Override
	public void deleteDocument(Document document) {

		// TODO Auto-generated method stub



	}

        /*Classe hérité de la classe Parente AbstractDaoImpl*/
                   @Override
        	public List<Document> getAllDocument() {

            

                                                         /* Log console*/

			System.out.println("Entree4Doc");



                                     String sql = "SELECT * FROM document";



		JdbcTemplate jdbcTemplate = getJdbcTemplate();



		try {

			List<Document> publicationQuery = jdbcTemplate.query(sql,

			new BeanPropertyRowMapper(Document.class));

			return publicationQuery;



		} catch (EmptyResultDataAccessException exception) {

			System.out.println("Incorrect");

			return null;

		}

            



	}


}
