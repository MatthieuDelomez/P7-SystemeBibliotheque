
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DocumentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomouvrage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantitetotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refbibliotheque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refouvrage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentResponse", propOrder = {
    "nomouvrage",
    "quantitetotal",
    "refbibliotheque",
    "refouvrage"
})
public class DocumentResponse {

    protected String nomouvrage;
    protected String quantitetotal;
    protected int refbibliotheque;
    protected int refouvrage;

    /**
     * Obtient la valeur de la propriété nomouvrage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomouvrage() {
        return nomouvrage;
    }

    /**
     * Définit la valeur de la propriété nomouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomouvrage(String value) {
        this.nomouvrage = value;
    }

    /**
     * Obtient la valeur de la propriété quantitetotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantitetotal() {
        return quantitetotal;
    }

    /**
     * Définit la valeur de la propriété quantitetotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantitetotal(String value) {
        this.quantitetotal = value;
    }

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

}
