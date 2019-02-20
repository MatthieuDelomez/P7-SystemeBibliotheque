
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Pret;
import org.springframework.jdbc.core.RowMapper;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class PretMapper implements RowMapper<Pret> {
    
    
                                     @Override
          	                public Pret mapRow(ResultSet rs, int rowNum) throws SQLException {
            
	                Pret pret = new Pret();
                 
                                       pret.setRefPret(rs.getInt("refpret"));
                                       
                                       pret.setRefClient(rs.getInt("refclient"));
                                       
                                       pret.setRefOuvrage(rs.getInt("refouvrage"));
                                       
                                       pret.setDatePret(rs.getDate("datepret"));
                                       
                                       pret.setDureePret(rs.getString("dureepret"));
                                       
                                       pret.setDateFinPret(rs.getDate("datefinpret"));
                                       
                                       pret.setNbrExemplaire(rs.getString("nbrexemplaire"));
                                       
                                       pret.setProlonger(rs.getBoolean("prolonger"));
                                       
                                       return pret;
                
    
}

}
