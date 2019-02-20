package org.projet.biblio.business.manager;


import org.projet.biblio.model.Bibliotheque;


/**
 * Creation de l'interface qui servira à implémenter les méthodes: 
 * Ajouter | Recuperer | Supp | MAJ une Bibliotheque
 *
 * 
 * @author Delomez Matthieu
 */

public interface BibliothequeManager {

    
    /**
     * Création des méthodes qui seront implémentées dans BibliothequeManagerImpl.
     * 
     *
     * @param bibliotheque
     */
    void addBibliotheque(Bibliotheque bibliotheque); // Ajouter une bibliothèque
    
    /**
     *
     * @param bibliotheque
     */
    Bibliotheque getBibliotheque(Bibliotheque bibliotheque); // Récupérer une bibliothèque
    
    /**
     *
     * @param bibliotheque
     */
    void deleteBibliothequePicture(Bibliotheque bibliotheque); 
    
    /**
     *
     * @param bibliotheque
     */
    void updateBibliotheque (Bibliotheque bibliotheque); // Mise à jour des bibliothèques
    
    /**
     *
     * @param bibliotheque
     */
    void deleteBibliotheque (Bibliotheque bibliotheque); // Supprimer une bibliothèque
    
}
