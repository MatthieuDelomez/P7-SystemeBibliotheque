/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.dao;

import java.util.List;
import org.projet.biblio.model.Pret;

/*
Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
*/

public interface PretDao {
    
    /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/
    
    
    void addPret( Pret pret);
    
    Pret getPret(Pret pret);
    
    void deletePretPicture(Pret pret);
    
    List<Pret> getAllPret();
    
    void updatePret(Pret pret);
    
    void deletePret(Pret pret);
    
}
