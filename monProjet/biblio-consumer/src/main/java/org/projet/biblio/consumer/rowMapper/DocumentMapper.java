
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Document;
import org.springframework.jdbc.core.RowMapper;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class DocumentMapper implements RowMapper<Document> {
    
                                   @Override
      	              public Document mapRow(ResultSet rs, int rowNum) throws SQLException {
            
                                    Document document = new Document();
                                     
                                     document.setRefOuvrage(rs.getInt("refouvrage"));
                                     
                                     document.setRefBibliotheque(rs.getInt("refbibliotheque"));
                                     
                                     document.setNomOuvrage(rs.getString("nomouvrage"));
                                     
                                     document.setQuantiteTotal(rs.getString("quantitetotal"));
                                     

                                     
                                       return document;



    
      
        }
}
