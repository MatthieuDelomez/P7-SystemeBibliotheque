/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.InfoPret;

/**
 *
 * @author Ben Gourion
 */
public class InfoPretRowMapper {
    
  	public InfoPret mapRow(ResultSet rs, int rowNum) throws SQLException {
            
                      InfoPret infoPret = new InfoPret();
                      
                      infoPret.setEmail(rs.getString("email"));
                      
                      infoPret.setNomOuvrage(rs.getString("nomouvrage"));
                      
                      infoPret.setDateFinPret(rs.getString("dateFinPret"));
                      
                      return infoPret;
                      
        }
        
    
    
}
