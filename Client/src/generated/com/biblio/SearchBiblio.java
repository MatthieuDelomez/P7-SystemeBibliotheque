
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour searchBiblio complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="searchBiblio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refbibliotheque" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchBiblio", propOrder = {
    "refbibliotheque"
})
public class SearchBiblio {

    protected int refbibliotheque;

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

}
