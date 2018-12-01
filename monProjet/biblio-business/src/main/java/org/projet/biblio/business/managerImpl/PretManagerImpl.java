/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.managerImpl;

import java.util.List;
import org.projet.biblio.business.manager.PretManager;
import org.projet.biblio.model.Pret;

/**
 *
 * @author Ben Gourion
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

    
    
   /* Implementation de la methode liste des publications /*/
                   public List<Pret> getAllPret() {

                                      System.out.println("---->>> manager getAllPret");
                                      return getDaoFactory().getPretDao().getAllPret();

                   }
    
}
