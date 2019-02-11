
package com.biblio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour listInfoDocumentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="listInfoDocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listInfoDocument" type="{http://biblio.com/}InfoPretResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listInfoDocumentResponse", propOrder = {
    "listInfoDocument"
})
public class ListInfoDocumentResponse {

    protected List<InfoPretResponse> listInfoDocument;

    /**
     * Gets the value of the listInfoDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listInfoDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListInfoDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoPretResponse }
     * 
     * 
     */
    public List<InfoPretResponse> getListInfoDocument() {
        if (listInfoDocument == null) {
            listInfoDocument = new ArrayList<InfoPretResponse>();
        }
        return this.listInfoDocument;
    }

}
