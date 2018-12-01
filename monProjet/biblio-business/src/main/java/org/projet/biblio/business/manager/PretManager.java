/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.Pret;

/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ un Utilisateur
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
    Création d'une liste de pret au cous ou nous voulions l'afficher dans une jsp
    */
    List<Pret> getAllPret();
    
    
}
