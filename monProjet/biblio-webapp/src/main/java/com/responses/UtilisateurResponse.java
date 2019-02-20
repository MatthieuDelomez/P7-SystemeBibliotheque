
package com.responses;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response
 *
 * @author Delomez Matthieu
 */

@XmlRootElement(name = "UtilisateurResponse")
@XmlType(name = "UtilisateurResponse")
public class UtilisateurResponse {
    
    //=========Attributs=============
    
    private int refBibliotheque;
    private int idUtilisateur;
    private String pseudo ;
    private String motPasse;    
    private String nom;    
    private String prenom;   
    private String email;
    
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
     * @param idUtilisateur
     */
    @XmlElement(name = "idutilisateur")
    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
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
     * @param refBibliotheque
     */
    @XmlElement(name = "refbibliotheque")
    public void setRefBibliotheque(int refBibliotheque) {
        this.refBibliotheque = refBibliotheque;
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
     * @param motPasse
     */
    @XmlElement(name = "motpasse")
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
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
     * @param email
     */
    @XmlElement(name = "email")
    public void setEmail(String email) {
        this.email = email;
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
     * @param pseudo
     */
    @XmlElement(name = "pseudo")
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
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
     * @param nom
     */
    @XmlElement(name = "nom")
    public void setNom(String nom) {
        this.nom = nom;
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
     * @param prenom
     */
    @XmlElement(name = "prenom")
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
    
    
    
    
}
