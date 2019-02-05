
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Pret;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Pret
*/

public interface PretManager {
    
      /*
    Création des méthodes qui seront implémentées dans PretManagerImpl
    */
    
    void addPret(Pret pret);
    
    Pret getPret(Pret pret);
    
    void deletePretPicture(Pret pret);
    
    void updatePret(Pret pret);
    
    void deletePret(Pret pret);
    
    /*
    Création d'une liste de pret
    */
    List<Pret> getAllPret();
    
    
}
