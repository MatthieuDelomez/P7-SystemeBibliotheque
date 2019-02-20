
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addDocument complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refbibliotheque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomouvrage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantitetotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDocument", propOrder = {
    "refbibliotheque",
    "nomouvrage",
    "quantitetotal"
})
public class AddDocument {

    protected int refbibliotheque;
    protected String nomouvrage;
    protected String quantitetotal;

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

}
