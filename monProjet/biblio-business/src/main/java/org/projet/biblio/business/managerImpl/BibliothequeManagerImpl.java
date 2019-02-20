package org.projet.biblio.business.managerImpl;

import org.projet.biblio.business.manager.BibliothequeManager;
import org.projet.biblio.model.Bibliotheque;


/**
 * Creation de la classe BibliothequeManagerImpl qui implemente l'interface BibliothequeManager.
 * 
 *
 * @author Ben Gourion
 */

public class BibliothequeManagerImpl extends AbstractManager implements BibliothequeManager {

    @Override
    public void addBibliotheque(Bibliotheque bibliotheque) {
        
        getDaoFactory().getBibliothequeDao().addBibliotheque(bibliotheque);   
    }

    
    @Override
    public Bibliotheque getBibliotheque(Bibliotheque bibliotheque) {
        return getDaoFactory().getBibliothequeDao().getBibliotheque(bibliotheque);   
    }

    
    @Override
    public void deleteBibliothequePicture(Bibliotheque bibliotheque) {
       getDaoFactory().getBibliothequeDao().deleteBibliothequePicture(bibliotheque);  
    }

    
    @Override
    public void updateBibliotheque(Bibliotheque bibliotheque) {
       getDaoFactory().getBibliothequeDao().updateBibliotheque(bibliotheque);  
    }

    
    @Override
    public void deleteBibliotheque(Bibliotheque bibliotheque) {
       getDaoFactory().getBibliothequeDao().deleteBibliotheque(bibliotheque);   
    }

    
}
