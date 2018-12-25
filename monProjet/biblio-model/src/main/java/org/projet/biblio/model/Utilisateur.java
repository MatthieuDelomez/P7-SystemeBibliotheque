
package org.projet.biblio.model;


public class Utilisateur {
    
    private int idUtilisateur;
    private int refBibliotheque;
    
    private String pseudo = "pseudo";
    private String motPasse = "motPasse";
    private String email = "email";
    private String nom = "nom";
    private String prenom = "prenom";

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
}
