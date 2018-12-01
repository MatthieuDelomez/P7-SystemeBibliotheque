/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class UtilisateurMapper implements RowMapper<Utilisateur> {

  	public Utilisateur mapRow(ResultSet rs, int rowNum) throws SQLException {

		Utilisateur utilisateur = new Utilisateur();
                
                		utilisateur.setRefClient(rs.getInt("refclient"));
                                
                                	utilisateur.setNom(rs.getString("nom"));
                                        
		utilisateur.setPrenom(rs.getString("prenom"));
                
                		utilisateur.setSexe(rs.getString("sexe"));

		utilisateur.setPseudo(rs.getString("pseudo"));
                
                                       utilisateur.setMotPasse(rs.getString("motpasse"));
                                       
                                       utilisateur.setAdresse(rs.getString("adresse"));

		utilisateur.setEmail(rs.getString("email"));
                
                                      utilisateur.setCodePostal(rs.getString("codepostal"));



		return utilisateur; 
        }
    
}
