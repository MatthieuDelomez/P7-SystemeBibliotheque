
package org.projet.biblio.consumer.daoImpl;

import javax.sql.DataSource;
import org.projet.biblio.consumer.dao.UtilisateurDao;
import org.projet.biblio.consumer.rowMapper.UtilisateurMapper;
import org.projet.biblio.model.Utilisateur;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {
    
                                       /*
                                      Variable de la DataSource
                                     */
                                       private DataSource dataSource;
    
                                       
                                       /* Méthode pour ajouter un Utilisateur*/
                                      /*Classe hérité de la classe Parente AbstractDaoImpl*/
                                      @Override
                                       public void addUtilisateur(Utilisateur utilisateur) {
        
                                       JdbcTemplate jdbcTemplate =  getJdbcTemplate();

                                       /* Nom des colonnes se situant dans table de la base de données*/

                                      String sql = "INSERT INTO utilisateur (idutilisateur,refbibliotheque, pseudo, motpasse, email, nom,  prenom) VALUES (?,?,?,?,?,?,?);";

		

	               Object[] args = new Object[] { utilisateur.getIdUtilisateur(),utilisateur.getRefBibliotheque(), utilisateur.getPseudo(), utilisateur.getMotPasse(), 
            
                                                                                             utilisateur.getEmail(),utilisateur.getNom(), utilisateur.getPrenom() };


                                       try {

                                       jdbcTemplate.update(sql, args);

                                       } catch (DuplicateKeyException exception) {

                                       System.out.println(exception.getMessage());

                             }

                             }

    
                                       @Override
                                       public Utilisateur getUtilisateur(Utilisateur utilisateur) {


		String sql = "SELECT * FROM utilisateur WHERE pseudo  = ? AND motpasse = ?";
                
                                           System.out.println(sql);

		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		Object[] args = new Object[] {

		          utilisateur.getPseudo(), utilisateur.getMotPasse()

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
    public void deleteUtilisateurPicture(Utilisateur utilisateur) {
    }

    @Override
    public void updateUtilisateur(Utilisateur utilisateur) {
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
    }

                                       
}
