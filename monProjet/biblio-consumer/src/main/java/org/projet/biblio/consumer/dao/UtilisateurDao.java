package org.projet.biblio.consumer.dao;

import org.projet.biblio.model.Utilisateur;


/**
 * Creation du pattern Dao (Data Access Objet) pour communiquer 
 * avec la base de données via l'interface UtilisateurDao.
 * 
 *
 * @author Ben Gourion
 */

public interface UtilisateurDao {
    
      /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    /**
     *
     * @param utilisateur
     */
     void addUtilisateur(Utilisateur utilisateur);
    
    /**
     *
     * @param utilisateur
     * @return
     */
    Utilisateur getUtilisateur(Utilisateur utilisateur);
    
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
    void deleteUtilisateur(Utilisateur utilisateur);
    
}
