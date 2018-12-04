/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Bibliotheque;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class BibliothequeMapper implements RowMapper<Bibliotheque> {
    

           	public Bibliotheque mapRow(ResultSet rs, int rowNum) throws SQLException {
                    
                    Bibliotheque bibliotheque = new Bibliotheque();
                    
                                      bibliotheque.setRefBibliotheque(rs.getInt("refbibliotheque"));
                                
                                	bibliotheque.setNom(rs.getString("nom"));
                                        
		bibliotheque.setAdresse(rs.getString("adresse"));
                
                		bibliotheque.setVille(rs.getString("ville"));

		bibliotheque.setCodePostal(rs.getString("codepostal"));
                
                                       bibliotheque.setDescription(rs.getString("description"));
                                       
                                       
                                       return bibliotheque;

   }
}