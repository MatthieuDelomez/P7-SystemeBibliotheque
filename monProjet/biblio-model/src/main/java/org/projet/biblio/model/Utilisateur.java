
package org.projet.biblio.model;

/**
 * Implementation pour définir le mapping entre les lignes de 
 * résultats d'une requête Sql et les objets java à créer.
 * 
 *
 * @author Delomez Matthieu
 */

public class Utilisateur {
    
    //=========Attributs=============
    
    private int idUtilisateur;
    private int refBibliotheque;
    
    private String pseudo;
    private String motPasse;
    private String email ;
    private String nom ;
    private String prenom ;
    
     //=========Getters & Setters=============

    /**
     *
     * @return
     */
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    /**
     *
     * @return
     */
    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    /**
     *
     * @return
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     *
     * @return
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }
    
    /**
     *
     * @param idUtilisateur
     */
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    /**
     *
     * @param refBibliotheque
     */
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    /**
     *
     * @param pseudo
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     *
     * @param motPasse
     */
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
}
