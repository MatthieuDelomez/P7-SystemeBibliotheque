/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.manager;


import org.projet.biblio.model.Utilisateur;


/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur
*/

public interface UtilisateurManager {
    
    /*
    Création des méthodes qui seront implémentées dans UserManagerImpl
    */
    
    void addUser(Utilisateur user);
    
    Utilisateur getUser(Utilisateur user);
    
    void deleteUserPicture(Utilisateur user);
    
    void updateUser(Utilisateur user);
    
    void deleteUser(Utilisateur user);
    
    
}
