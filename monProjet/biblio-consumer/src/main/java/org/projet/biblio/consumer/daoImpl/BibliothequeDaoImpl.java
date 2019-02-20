package org.projet.biblio.consumer.daoImpl;

import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.BibliothequeDao;
import org.projet.biblio.consumer.rowMapper.BibliothequeMapper;
import org.projet.biblio.model.Bibliotheque;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Classe Dao implémentation pour paramétrer les requetes Sql.
 * 
 *
 * @author Delomez Mattheiu
 */
public class BibliothequeDaoImpl extends AbstractDaoImpl implements BibliothequeDao {
    
                                       /*
                                      Variable de la DataSource
                                       */
                                       private DataSource dataSource;
    

                                      /*Classe hérité de la classe Parente AbstractDaoImpl
                                       * Méthode pour ajouter une Bibliotheque.
                                       *
                                       *
                                       */
                                      @Override
                                       public void addBibliotheque(Bibliotheque bibliotheque) {
        
                                       JdbcTemplate jdbcTemplate =  getJdbcTemplate();


                                       String sql = "INSERT INTO bibliotheque ( nom, adresse, ville, codepostal, description) VALUES (?,?,?,?,?);";

		

	                 Object[] args = new Object[] {  bibliotheque.getNom(), bibliotheque.getAdresse(), 
            
                                                                                               bibliotheque.getVille(),bibliotheque.getCodePostal(), bibliotheque.getDescription() };


                                       try {

                                             jdbcTemplate.update(sql, args);

                                             } catch (DuplicateKeyException exception) {

                                            System.out.println(exception.getMessage());

                                             }

                                             }

    

 
                                       @Override
                                       public Bibliotheque getBibliotheque(Bibliotheque bibliotheque) {


		String sql = "SELECT * FROM bibliotheque WHERE   refbibliotheque = ?";

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		Object[] args = new Object[] { bibliotheque.getRefBibliotheque()

		};


                
                                        try {

                                       RowMapper<Bibliotheque> rowMapper = new BibliothequeMapper();

                                        /*Appel de la méthode QueryForObject*/

                                       Bibliotheque userQuery = jdbcTemplate.queryForObject(sql, args, rowMapper);

                                                         return userQuery;



                                       } catch (EmptyResultDataAccessException exception) {

                                        System.out.println("Incorrect");

                                                         return null;

                                       }
                                       }

                                       
                                       
                                       
    @Override
    public void deleteBibliothequePicture(Bibliotheque bibliotheque) {
    }

    @Override
    public void updateBibliotheque(Bibliotheque bibliotheque) {
    }

    @Override
    public void deleteBibliotheque(Bibliotheque bibliotheque) {
    }
    
}
