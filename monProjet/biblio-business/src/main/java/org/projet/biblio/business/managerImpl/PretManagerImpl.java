package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.model.Pret;


public class PretManagerImpl extends AbstractManager implements PretManager {

    @Override
    public void addPret(Pret pret) {
        getDaoFactory().getPretDao().addPret(pret);   
    }

    @Override
    public Pret getPret(Pret pret) {
         return getDaoFactory().getPretDao().getPret(pret);  
    }

    @Override
    public void deletePretPicture(Pret pret) {
          getDaoFactory().getPretDao().deletePretPicture(pret);  
    }

    @Override
    public void updatePret(Pret pret) {
          getDaoFactory().getPretDao().updatePret(pret);   
    }

    @Override
    public void deletePret(Pret pret) {
          getDaoFactory().getPretDao().deletePret(pret);  
    }

    
    
   /* Implementation de la methode liste des prets /*/
    @Override
   public List<Pret> getAllPret() {
         return getDaoFactory().getPretDao().getAllPret();

                   }
    
}
