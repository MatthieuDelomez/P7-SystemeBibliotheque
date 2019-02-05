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
    

                      @Override
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