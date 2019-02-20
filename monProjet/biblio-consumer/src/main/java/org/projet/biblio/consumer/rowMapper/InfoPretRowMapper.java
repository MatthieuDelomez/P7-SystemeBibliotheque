
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.InfoPret;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */
public class InfoPretRowMapper {
    
    /**
     *
     * @param rs
     * @param rowNum
     * @return
     * @throws SQLException
     */
    public InfoPret mapRow(ResultSet rs, int rowNum) throws SQLException {
            
                      InfoPret infoPret = new InfoPret();
                      
                      infoPret.setEmail(rs.getString("email"));
                      
                      infoPret.setNomOuvrage(rs.getString("nomouvrage"));
                      
                      infoPret.setDateFinPret(rs.getDate("dateFinPret"));
                      
                      return infoPret;
                      
        }
        
    
    
}
