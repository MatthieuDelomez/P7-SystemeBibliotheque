package org.projet.biblio.business.manager;


import org.projet.biblio.model.Bibliotheque;


/*
Creation de l'interface qui servira à implémenter les méthodes: Ajouter | Recuperer | Supp | MAJ une Bibliotheque
*/
public interface BibliothequeManager {
    
     /*
    Création des méthodes qui seront implémentées dans BibliothequeManagerImpl
    */
    void addBibliotheque(Bibliotheque bibliotheque); // Ajouter une bibliothèque
    
    Bibliotheque getBibliotheque(Bibliotheque bibliotheque); // Récupérer une bibliothèque
    
    void deleteBibliothequePicture(Bibliotheque bibliotheque); 
    
    void updateBibliotheque (Bibliotheque bibliotheque); // Mise à jour des bibliothèques
    
    void deleteBibliotheque (Bibliotheque bibliotheque); // Supprimer une bibliothèque
    
}
