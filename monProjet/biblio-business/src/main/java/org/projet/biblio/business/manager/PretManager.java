
package org.projet.biblio.business.manager;

import java.util.List;
import org.projet.biblio.model.InfoPret;
import org.projet.biblio.model.Pret;


/**
 * Creation de l'interface qui servira à implémenter les méthodes: 
 * Ajouter | Recuperer | Supp | MAJ un Pret.
 * 
 *
 * @author Delomez Matthieu
 */
public interface PretManager {


    /**
     * Création des méthodes qui seront implémentées dans PretManagerImpl
     *
     * @param pret
     */
    void addPret(Pret pret);
    
    /**
     *
     * @param pret
     * @return
     */
    Pret getPret(Pret pret);
    
    /**
     *
     * @param pret
     */
    void deletePretPicture(Pret pret);
    
    /**
     *
     * @param pret
     */
    void updatePret(Pret pret);
    
    /**
     *
     * @param pret
     */
    void deletePret(Pret pret);

    
    /**
     *  Création d'une liste de pret qui va retourner tout les prêts
     *
     * @return
     */
    List<Pret> getAllPret();
    

    /**
     * Liste qui servira à retourner le infomations necessaire pour la configuration du batch
     *
     * @return
     */
    List<InfoPret> getInfoPret();
    
    
}
