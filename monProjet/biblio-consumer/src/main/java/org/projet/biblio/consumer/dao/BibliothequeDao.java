package org.projet.biblio.consumer.dao;

import org.projet.biblio.model.Bibliotheque;


/**
 * Creation du pattern Dao (Data Access Objet) pour communiquer avec
 * la base de données via l'interface BibliothequeDao.
 * 
 *
 * @author Delomez Matthieu
 */

public interface BibliothequeDao {
    
   /* Methodes Ajouter | Recupérer | Supprimer | MAJ  qui seront présentent dans les requetes Sql*/

    /**
     *
     * @param bibliotheque
     */
    void addBibliotheque(Bibliotheque bibliotheque);
    
    /**
     *
     * @param bibliotheque
     * @return
     */
    Bibliotheque getBibliotheque (Bibliotheque bibliotheque);
    
    /**
     *
     * @param bibliotheque
     */
    void deleteBibliothequePicture(Bibliotheque bibliotheque);
    
    /**
     *
     * @param bibliotheque
     */
    void updateBibliotheque(Bibliotheque bibliotheque);
    
    /**
     *
     * @param bibliotheque
     */
    void deleteBibliotheque(Bibliotheque bibliotheque);
    
    
}
