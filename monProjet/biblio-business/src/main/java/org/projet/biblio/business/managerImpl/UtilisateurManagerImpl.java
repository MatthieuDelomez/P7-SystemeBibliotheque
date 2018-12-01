/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.UtilisateurManager;
import org.projet.biblio.model.Utilisateur;


/*
Creation de la classe UtilisateurManagerImpl qui implemente l'interface UtilisateurManager
*/

public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager{

    @Override
    public void addUser(Utilisateur user) {
        
        getDaoFactory().getUtilisateurDao().addUser(user);   
    }

    
    @Override
    public Utilisateur getUser(Utilisateur user) {
        return getDaoFactory().getUtilisateurDao().getUser(user);   
    }

    
    @Override
    public void deleteUserPicture(Utilisateur user) {
       getDaoFactory().getUtilisateurDao().deleteUserPicture(user);  
    }

    
    @Override
    public void updateUser(Utilisateur user) {
       getDaoFactory().getUtilisateurDao().updateUser(user);  
    }

    
    @Override
    public void deleteUser(Utilisateur user) {
       getDaoFactory().getUtilisateurDao().deleteUser(user);   
    }
    
}
