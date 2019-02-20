package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.model.InfoPret;
import org.projet.biblio.model.Pret;

/**
 * Classe PretFactoryImpl servant à implementer les methodes se trouvant dans l'interface PretManager.
 * 
 *
 * @author Delomez Matthieu
 */
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
   
   @Override
   public List<InfoPret> getInfoPret() {
         return getDaoFactory().getPretDao().getInfoPret();

                   }
    
}
