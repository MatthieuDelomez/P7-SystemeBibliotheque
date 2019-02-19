
package org.projet.biblio.business.manager;

import org.projet.biblio.model.Utilisateur;


/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur (Employé)
*/
public interface UtilisateurManager {
    
     /*
    Création des méthodes qui seront implémentées dans UtilisateurManagerImpl
    */
        
    void addUtilisateur(Utilisateur utilisateur); // Ajouter un employé
    
    Utilisateur getUtilisateur (Utilisateur utilisateur); // Login employé
    
    void deleteUtilisateurPicture(Utilisateur utilisateur);
    
    void updateUtilisateur(Utilisateur utilisateur);
    
    void deleteUtilisateur (Utilisateur utilisateur); // Supprimer un employé
    
}
