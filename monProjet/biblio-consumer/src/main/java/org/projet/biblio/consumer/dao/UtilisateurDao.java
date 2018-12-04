/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.dao;

import org.projet.biblio.model.Utilisateur;

/*
Creation du pattern Dao (Data Access Objet) pour communiquer avec la base de données via l'interface UtilisateurDao
*/
public interface UtilisateurDao {
    
      /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

     void addUtilisateur(Utilisateur utilisateur);
    
    Utilisateur getUtilisateur(Utilisateur utilisateur);
    
    void deleteUtilisateurPicture(Utilisateur utilisateur);
    
    void updateUtilisateur(Utilisateur utilisateur);
    
    void deleteUtilisateur(Utilisateur utilisateur);
    
}
