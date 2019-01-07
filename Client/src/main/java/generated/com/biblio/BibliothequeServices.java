package com.biblio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2019-01-02T20:12:08.974+01:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://biblio.com/", name = "BibliothequeServices")
@XmlSeeAlso({ObjectFactory.class})
public interface BibliothequeServices {

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/searchBiblioRequest", output = "http://biblio.com/BibliothequeServices/searchBiblioResponse")
    @RequestWrapper(localName = "searchBiblio", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBiblio")
    @ResponseWrapper(localName = "searchBiblioResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBiblioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.BibliothequeResponse searchBiblio(
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/addPretRequest", output = "http://biblio.com/BibliothequeServices/addPretResponse")
    @RequestWrapper(localName = "addPret", targetNamespace = "http://biblio.com/", className = "com.biblio.AddPret")
    @ResponseWrapper(localName = "addPretResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.AddPretResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.PretResponse addPret(
        @WebParam(name = "refouvrage", targetNamespace = "")
        int refouvrage,
        @WebParam(name = "refclient", targetNamespace = "")
        int refclient,
        @WebParam(name = "refpret", targetNamespace = "")
        int refpret,
        @WebParam(name = "datepret", targetNamespace = "")
        java.lang.String datepret,
        @WebParam(name = "dureepret", targetNamespace = "")
        java.lang.String dureepret,
        @WebParam(name = "datefinpret", targetNamespace = "")
        java.lang.String datefinpret,
        @WebParam(name = "nbrexemplaire", targetNamespace = "")
        java.lang.String nbrexemplaire,
        @WebParam(name = "prolonger", targetNamespace = "")
        boolean prolonger
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/searchPretRequest", output = "http://biblio.com/BibliothequeServices/searchPretResponse")
    @RequestWrapper(localName = "searchPret", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchPret")
    @ResponseWrapper(localName = "searchPretResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchPretResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.PretResponse searchPret(
        @WebParam(name = "refpret", targetNamespace = "")
        int refpret
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/searchBookRequest", output = "http://biblio.com/BibliothequeServices/searchBookResponse")
    @RequestWrapper(localName = "searchBook", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBook")
    @ResponseWrapper(localName = "searchBookResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.SearchBookResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.DocumentResponse searchBook(
        @WebParam(name = "nomouvrage", targetNamespace = "")
        java.lang.String nomouvrage
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/addBiblioRequest", output = "http://biblio.com/BibliothequeServices/addBiblioResponse")
    @RequestWrapper(localName = "addBiblio", targetNamespace = "http://biblio.com/", className = "com.biblio.AddBiblio")
    @ResponseWrapper(localName = "addBiblioResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.AddBiblioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.BibliothequeResponse addBiblio(
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "adresse", targetNamespace = "")
        java.lang.String adresse,
        @WebParam(name = "ville", targetNamespace = "")
        java.lang.String ville,
        @WebParam(name = "codepostal", targetNamespace = "")
        java.lang.String codepostal,
        @WebParam(name = "description", targetNamespace = "")
        java.lang.String description
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/doLoginClientRequest", output = "http://biblio.com/BibliothequeServices/doLoginClientResponse")
    @RequestWrapper(localName = "doLoginClient", targetNamespace = "http://biblio.com/", className = "com.biblio.DoLoginClient")
    @ResponseWrapper(localName = "doLoginClientResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.DoLoginClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.ClientResponse doLoginClient(
        @WebParam(name = "pseudo", targetNamespace = "")
        java.lang.String pseudo,
        @WebParam(name = "motpasse", targetNamespace = "")
        java.lang.String motpasse
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/doLoginRequest", output = "http://biblio.com/BibliothequeServices/doLoginResponse")
    @RequestWrapper(localName = "doLogin", targetNamespace = "http://biblio.com/", className = "com.biblio.DoLogin")
    @ResponseWrapper(localName = "doLoginResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.DoLoginResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.UtilisateurResponse doLogin(
        @WebParam(name = "pseudo", targetNamespace = "")
        java.lang.String pseudo,
        @WebParam(name = "motPasse", targetNamespace = "")
        java.lang.String motPasse
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/addDocumentRequest", output = "http://biblio.com/BibliothequeServices/addDocumentResponse")
    @RequestWrapper(localName = "addDocument", targetNamespace = "http://biblio.com/", className = "com.biblio.AddDocument")
    @ResponseWrapper(localName = "addDocumentResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.AddDocumentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.DocumentResponse addDocument(
        @WebParam(name = "refouvrage", targetNamespace = "")
        int refouvrage,
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque,
        @WebParam(name = "nomouvrage", targetNamespace = "")
        java.lang.String nomouvrage,
        @WebParam(name = "quantitetotal", targetNamespace = "")
        java.lang.String quantitetotal
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/addUserRequest", output = "http://biblio.com/BibliothequeServices/addUserResponse")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://biblio.com/", className = "com.biblio.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.AddUserResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.UtilisateurResponse addUser(
        @WebParam(name = "pseudo", targetNamespace = "")
        java.lang.String pseudo,
        @WebParam(name = "motPasse", targetNamespace = "")
        java.lang.String motPasse,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque,
        @WebParam(name = "idutilisateur", targetNamespace = "")
        int idutilisateur
    );

    @WebMethod
    @Action(input = "http://biblio.com/BibliothequeServices/addClientRequest", output = "http://biblio.com/BibliothequeServices/addClientResponse")
    @RequestWrapper(localName = "addClient", targetNamespace = "http://biblio.com/", className = "com.biblio.AddClient")
    @ResponseWrapper(localName = "addClientResponse", targetNamespace = "http://biblio.com/", className = "com.biblio.AddClientResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.biblio.ClientResponse addClient(
        @WebParam(name = "pseudo", targetNamespace = "")
        java.lang.String pseudo,
        @WebParam(name = "motPasse", targetNamespace = "")
        java.lang.String motPasse,
        @WebParam(name = "nom", targetNamespace = "")
        java.lang.String nom,
        @WebParam(name = "prenom", targetNamespace = "")
        java.lang.String prenom,
        @WebParam(name = "sexe", targetNamespace = "")
        java.lang.String sexe,
        @WebParam(name = "adresse", targetNamespace = "")
        java.lang.String adresse,
        @WebParam(name = "codepostal", targetNamespace = "")
        java.lang.String codepostal,
        @WebParam(name = "email", targetNamespace = "")
        java.lang.String email,
        @WebParam(name = "refbibliotheque", targetNamespace = "")
        int refbibliotheque,
        @WebParam(name = "refclient", targetNamespace = "")
        int refclient
    );
}