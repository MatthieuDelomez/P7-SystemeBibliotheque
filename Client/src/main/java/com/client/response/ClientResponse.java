
package com.client.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Classe Response
 *
 * @author Delomez Matthieu
 */

@XmlRootElement(name = "ClientResponse")
@XmlType(name = "ClientResponse")
public class ClientResponse {
    
    //=========Attributs=============
    
    private int refClient;
    private int refBibliotheque;
    
    private String nom;
    private String prenom;
    private String sexe;
    private String pseudo;
    private String motPasse;
    private String adresse;
    private String email;
    private String codePostal;
    
    
    //=========Getters & Setters=============
    
        
    /**
     *
     * @return
     */
    public int getRefClient() {
        return refClient;
    }
    
    /**
     *
     * @param refClient
     */
    @XmlElement(name = "refclient")
    public void setRefClient(int refClient) {
        this.refClient = refClient;
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

    /**
     *
     * @return
     */
    public String getSexe() {
        return sexe;
    }
    
    /**
     *
     * @param sexe
     */
    @XmlElement(name = "sexe")
    public void setSexe(String sexe) {
        this.sexe = sexe;
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
    public String getAdresse() {
        return adresse;
    }
    
    /**
     *
     * @param adresse
     */
    @XmlElement(name = "adresse")
    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
    public String getCodePostal() {
        return codePostal;
    }
    
    /**
     *
     * @param codePostal
     */
    @XmlElement(name = "codepostal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
    
    
    
    
}
