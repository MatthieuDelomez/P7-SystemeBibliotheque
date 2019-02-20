package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.UtilisateurManager;
import org.projet.biblio.model.Utilisateur;



/**
 * Creation de la classe UtilisateurManagerImpl qui implemente l'interface UtilisateurManager.
 * 
 *
 * @author Ben Gourion
 */

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager{

    @Override
    public void addUtilisateur(Utilisateur utilisateur) {
        getDaoFactory().getUtilisateurDao().addUtilisateur(utilisateur);   
    }

    @Override
    public Utilisateur getUtilisateur(Utilisateur utilisateur) {
        return getDaoFactory().getUtilisateurDao().getUtilisateur(utilisateur);   
    }

    @Override
    public void deleteUtilisateurPicture(Utilisateur utilisateur) {
       getDaoFactory().getUtilisateurDao().deleteUtilisateurPicture(utilisateur);  
    }

    @Override
    public void updateUtilisateur(Utilisateur utilisateur) {
       getDaoFactory().getUtilisateurDao().updateUtilisateur(utilisateur);  
    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
       getDaoFactory().getUtilisateurDao().deleteUtilisateur(utilisateur);   
    }
    
}
