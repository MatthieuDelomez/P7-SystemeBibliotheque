
package com.biblio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour deleteClient complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="deleteClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refclient" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteClient", propOrder = {
    "refclient"
})
public class DeleteClient {

    protected int refclient;

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

}
