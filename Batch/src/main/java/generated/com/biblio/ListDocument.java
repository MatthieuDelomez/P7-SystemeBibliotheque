
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listDocument complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomOuvrage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listDocument", propOrder = {
    "nomOuvrage"
})
public class ListDocument {

    protected String nomOuvrage;

    /**
     * Obtient la valeur de la propriété nomOuvrage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomOuvrage() {
        return nomOuvrage;
    }

    /**
     * Définit la valeur de la propriété nomOuvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomOuvrage(String value) {
        this.nomOuvrage = value;
    }

}
