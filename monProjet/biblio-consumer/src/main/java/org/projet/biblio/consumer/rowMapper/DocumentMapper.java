/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Document;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Ben Gourion
 */
public class DocumentMapper implements RowMapper<Document> {
    
      	public Document mapRow(ResultSet rs, int rowNum) throws SQLException {
            
		Document document = new Document();
                                     
                                     document.setRefOuvrage(rs.getInt("refouvrage"));
                                     
                                     document.setRefBibliotheque(rs.getInt("refbibliotheque"));
                                     
                                     document.setNomOuvrage(rs.getString("nomouvrage"));
                                     
                                     document.setQuantiteTotal(rs.getString("quantitetotal"));
                                     
                                     document.setNbrEmprunte(rs.getString("nbremprunte"));
                                     
                                     document.setQuantiteRestante(rs.getString("quantiterestante"));
                                     
                                     
                                       return document;



    
      
        }
}
