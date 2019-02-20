package org.projet.biblio.consumer.dao;

import java.util.List;
import org.projet.biblio.model.InfoPret;
import org.projet.biblio.model.Pret;


/**
 * Pattern Dao pour éxécuter les requêtes Sql avec Spring JDBC
 *
 * @author Ben Gourion
 */

public interface PretDao {
    
    /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    /**
     *
     * @param pret
     */    
    void addPret( Pret pret);
    
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
     * @return
     */
    List<Pret> getAllPret();
    
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
     *
     * @return
     */
    List<InfoPret> getInfoPret();
}
