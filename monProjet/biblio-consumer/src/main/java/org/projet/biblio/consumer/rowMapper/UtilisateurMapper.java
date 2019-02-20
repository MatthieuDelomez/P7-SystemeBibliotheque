
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class UtilisateurMapper implements RowMapper<Utilisateur>{
    
    
                     @Override
               	public  Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {
                    
                     Utilisateur  utilisateur = new  Utilisateur();
                     
                      utilisateur.setIdUtilisateur(rs.getInt("idutilisateur"));
                    
                      utilisateur.setRefBibliotheque(rs.getInt("refbibliotheque"));
                                      
                      utilisateur.setPseudo(rs.getString("pseudo"));
                                                                        
	utilisateur.setMotPasse(rs.getString("motpasse"));
                
                	utilisateur.setEmail(rs.getString("email"));
                
                      utilisateur.setNom(rs.getString("nom"));

                      utilisateur.setPrenom(rs.getString("prenom"));
                                       
                                       
                       return utilisateur;

                }
}
