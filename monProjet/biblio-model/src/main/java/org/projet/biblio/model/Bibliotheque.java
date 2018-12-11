/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.model;



public class Bibliotheque {
    
    private int refBibliotheque;
    private String nom = "nom";
    private String adresse = "adresse";
    private String ville = "ville";
    private String codePostal = "codePostal";
    private String description = "description";
    
    

    public int getRefBibliotheque() {
        return refBibliotheque;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getDescription() {
        return description;
    }

    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
