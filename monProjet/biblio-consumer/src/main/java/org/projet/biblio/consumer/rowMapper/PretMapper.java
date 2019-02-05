/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Pret;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class PretMapper implements RowMapper<Pret> {
    
                      @Override
          	public Pret mapRow(ResultSet rs, int rowNum) throws SQLException {
            
		Pret pret = new Pret();
                 
                                       pret.setRefPret(rs.getInt("refpret"));
                                       
                                       pret.setRefClient(rs.getInt("refclient"));
                                       
                                       pret.setRefOuvrage(rs.getInt("refouvrage"));
                                       
                                       pret.setDatePret(rs.getString("datepret"));
                                       
                                       pret.setDureePret(rs.getString("dureepret"));
                                       
                                       pret.setDateFinPret(rs.getString("datefinpret"));
                                       
                                       pret.setNbrExemplaire(rs.getString("nbrexemplaire"));
                                       
                                       pret.setProlonger(rs.getBoolean("prolonger"));
                                       
                                       return pret;
                
    
}

}
