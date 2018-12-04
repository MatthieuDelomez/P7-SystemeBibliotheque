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
    Création des méthodes qui seront implémentées dans UtilisateurManagerImpl
    */
        
    void addUtilisateur(Utilisateur utilisateur);
    
    Utilisateur getUtilisateur (Utilisateur utilisateur);
    
    void deleteUtilisateurPicture(Utilisateur utilisateur);
    
    void updateUtilisateur(Utilisateur utilisateur);
    
    void deleteUtilisateur (Utilisateur utilisateur);
    
}
