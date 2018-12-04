/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.dao;

import org.projet.biblio.model.Bibliotheque;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface UtilisateurDao
*/
public interface BibliothequeDao {
    
      /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    void addBibliotheque(Bibliotheque bibliotheque);
    
    Bibliotheque getBibliotheque (Bibliotheque bibliotheque);
    
    void deleteBibliothequePicture(Bibliotheque bibliotheque);
    
    void updateBibliotheque(Bibliotheque bibliotheque);
    
    void deleteBibliotheque(Bibliotheque bibliotheque);
    
    
}
