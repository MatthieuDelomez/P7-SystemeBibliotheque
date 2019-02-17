
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addPret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addPret">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refpret" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refclient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refouvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dureepret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrexemplaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prolonger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addPret", propOrder = {
    "refpret",
    "refclient",
    "refouvrage",
    "dureepret",
    "nbrexemplaire",
    "prolonger"
})
public class AddPret {

    protected int refpret;
    protected int refclient;
    protected int refouvrage;
    protected String dureepret;
    protected String nbrexemplaire;
    protected boolean prolonger;

    /**
     * Obtient la valeur de la propriété refpret.
     * 
     */
    public int getRefpret() {
        return refpret;
    }

    /**
     * Définit la valeur de la propriété refpret.
     * 
     */
    public void setRefpret(int value) {
        this.refpret = value;
    }

    /**
     * Obtient la valeur de la propriété refclient.
     * 
     */
    public int getRefclient() {
        return refclient;
    }

    /**
     * Définit la valeur de la propriété refclient.
     * 
     */
    public void setRefclient(int value) {
        this.refclient = value;
    }

    /**
     * Obtient la valeur de la propriété refouvrage.
     * 
     */
    public int getRefouvrage() {
        return refouvrage;
    }

    /**
     * Définit la valeur de la propriété refouvrage.
     * 
     */
    public void setRefouvrage(int value) {
        this.refouvrage = value;
    }

    /**
     * Obtient la valeur de la propriété dureepret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDureepret() {
        return dureepret;
    }

    /**
     * Définit la valeur de la propriété dureepret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDureepret(String value) {
        this.dureepret = value;
    }

    /**
     * Obtient la valeur de la propriété nbrexemplaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbrexemplaire() {
        return nbrexemplaire;
    }

    /**
     * Définit la valeur de la propriété nbrexemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbrexemplaire(String value) {
        this.nbrexemplaire = value;
    }

    /**
     * Obtient la valeur de la propriété prolonger.
     * 
     */
    public boolean isProlonger() {
        return prolonger;
    }

    /**
     * Définit la valeur de la propriété prolonger.
     * 
     */
    public void setProlonger(boolean value) {
        this.prolonger = value;
    }

}
