
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deletePret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deletePret">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dureepret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "deletePret", propOrder = {
    "dureepret",
    "refpret"
})
public class DeletePret {

    protected String dureepret;
    protected int refpret;

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
