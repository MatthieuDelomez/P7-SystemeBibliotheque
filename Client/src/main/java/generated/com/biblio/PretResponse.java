
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour PretResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PretResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datefinpret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="datepret" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dureePret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nbrexemplaire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prolonger" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refclient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refouvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refpret" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PretResponse", propOrder = {
    "datefinpret",
    "datepret",
    "dureePret",
    "nbrexemplaire",
    "prolonger",
    "refclient",
    "refouvrage",
    "refpret"
})
public class PretResponse {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datefinpret;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datepret;
    protected String dureePret;
    protected String nbrexemplaire;
    protected boolean prolonger;
    protected int refclient;
    protected int refouvrage;
    protected int refpret;

    /**
     * Obtient la valeur de la propriété datefinpret.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatefinpret() {
        return datefinpret;
    }

    /**
     * Définit la valeur de la propriété datefinpret.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatefinpret(XMLGregorianCalendar value) {
        this.datefinpret = value;
    }

    /**
     * Obtient la valeur de la propriété datepret.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatepret() {
        return datepret;
    }

    /**
     * Définit la valeur de la propriété datepret.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatepret(XMLGregorianCalendar value) {
        this.datepret = value;
    }

    /**
     * Obtient la valeur de la propriété dureePret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDureePret() {
        return dureePret;
    }

    /**
     * Définit la valeur de la propriété dureePret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDureePret(String value) {
        this.dureePret = value;
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

}
