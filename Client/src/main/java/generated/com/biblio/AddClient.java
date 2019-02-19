
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addClient complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refbibliotheque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pseudo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motPasse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codepostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addClient", propOrder = {
    "refbibliotheque",
    "nom",
    "prenom",
    "sexe",
    "pseudo",
    "motPasse",
    "adresse",
    "email",
    "codepostal"
})
public class AddClient {

    protected int refbibliotheque;
    protected String nom;
    protected String prenom;
    protected String sexe;
    protected String pseudo;
    protected String motPasse;
    protected String adresse;
    protected String email;
    protected String codepostal;

    /**
     * Obtient la valeur de la propriété refbibliotheque.
     * 
     */
    public int getRefbibliotheque() {
        return refbibliotheque;
    }

    /**
     * Définit la valeur de la propriété refbibliotheque.
     * 
     */
    public void setRefbibliotheque(int value) {
        this.refbibliotheque = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propriété sexe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Définit la valeur de la propriété sexe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexe(String value) {
        this.sexe = value;
    }

    /**
     * Obtient la valeur de la propriété pseudo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * Définit la valeur de la propriété pseudo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPseudo(String value) {
        this.pseudo = value;
    }

    /**
     * Obtient la valeur de la propriété motPasse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotPasse() {
        return motPasse;
    }

    /**
     * Définit la valeur de la propriété motPasse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotPasse(String value) {
        this.motPasse = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété codepostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodepostal() {
        return codepostal;
    }

    /**
     * Définit la valeur de la propriété codepostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodepostal(String value) {
        this.codepostal = value;
    }

}
