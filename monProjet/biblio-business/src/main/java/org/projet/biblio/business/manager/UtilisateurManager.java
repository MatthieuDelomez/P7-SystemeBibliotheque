
package org.projet.biblio.business.manager;

import org.projet.biblio.model.Utilisateur;


/**
 * Creation de l'interface qui servira à implémenter les méthodes: 
 * Ajouter | Recuperer | Supp | MAJ un Employé.
 * 
 *
 * @author Delomez Matthieu
 */

public interface UtilisateurManager {
    

    /**
     * Création des méthodes qui seront implémentées dans UtilisateurManagerImpl
     *
     * @param utilisateur
     */ 
    void addUtilisateur(Utilisateur utilisateur); // Ajouter un employé
    
    /**
     *
     * @param utilisateur
     * @return
     */
    Utilisateur getUtilisateur (Utilisateur utilisateur); // Login employé
    
    /**
     *
     * @param utilisateur
     */
    void deleteUtilisateurPicture(Utilisateur utilisateur);
    
    /**
     *
     * @param utilisateur
     */
    void updateUtilisateur(Utilisateur utilisateur);
    
    /**
     *
     * @param utilisateur
     */
    void deleteUtilisateur (Utilisateur utilisateur); // Supprimer un employé
    
}
