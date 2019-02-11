
package com.biblio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.biblio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchBiblio_QNAME = new QName("http://biblio.com/", "searchBiblio");
    private final static QName _UtilisateurResponse_QNAME = new QName("http://biblio.com/", "UtilisateurResponse");
    private final static QName _AddPret_QNAME = new QName("http://biblio.com/", "addPret");
    private final static QName _ListInfoDocument_QNAME = new QName("http://biblio.com/", "listInfoDocument");
    private final static QName _DoLoginClient_QNAME = new QName("http://biblio.com/", "doLoginClient");
    private final static QName _AddClientResponse_QNAME = new QName("http://biblio.com/", "addClientResponse");
    private final static QName _SearchPretResponse_QNAME = new QName("http://biblio.com/", "searchPretResponse");
    private final static QName _InfoPretResponse_QNAME = new QName("http://biblio.com/", "InfoPretResponse");
    private final static QName _ListClient_QNAME = new QName("http://biblio.com/", "listClient");
    private final static QName _DeletePretResponse_QNAME = new QName("http://biblio.com/", "deletePretResponse");
    private final static QName _DoLoginClientResponse_QNAME = new QName("http://biblio.com/", "doLoginClientResponse");
    private final static QName _ListDocument_QNAME = new QName("http://biblio.com/", "listDocument");
    private final static QName _ListPretResponse_QNAME = new QName("http://biblio.com/", "listPretResponse");
    private final static QName _DoLogin_QNAME = new QName("http://biblio.com/", "doLogin");
    private final static QName _DeleteClient_QNAME = new QName("http://biblio.com/", "deleteClient");
    private final static QName _PretResponse_QNAME = new QName("http://biblio.com/", "PretResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://biblio.com/", "addUserResponse");
    private final static QName _ListClientResponse_QNAME = new QName("http://biblio.com/", "listClientResponse");
    private final static QName _ListPret_QNAME = new QName("http://biblio.com/", "listPret");
    private final static QName _SearchPret_QNAME = new QName("http://biblio.com/", "searchPret");
    private final static QName _AddBiblio_QNAME = new QName("http://biblio.com/", "addBiblio");
    private final static QName _BibliothequeResponse_QNAME = new QName("http://biblio.com/", "BibliothequeResponse");
    private final static QName _AddDocumentResponse_QNAME = new QName("http://biblio.com/", "addDocumentResponse");
    private final static QName _DocumentResponse_QNAME = new QName("http://biblio.com/", "DocumentResponse");
    private final static QName _AddDocument_QNAME = new QName("http://biblio.com/", "addDocument");
    private final static QName _DoLoginResponse_QNAME = new QName("http://biblio.com/", "doLoginResponse");
    private final static QName _DeletePret_QNAME = new QName("http://biblio.com/", "deletePret");
    private final static QName _ListDocumentResponse_QNAME = new QName("http://biblio.com/", "listDocumentResponse");
    private final static QName _SearchBiblioResponse_QNAME = new QName("http://biblio.com/", "searchBiblioResponse");
    private final static QName _AddBiblioResponse_QNAME = new QName("http://biblio.com/", "addBiblioResponse");
    private final static QName _AddPretResponse_QNAME = new QName("http://biblio.com/", "addPretResponse");
    private final static QName _ClientResponse_QNAME = new QName("http://biblio.com/", "ClientResponse");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://biblio.com/", "deleteClientResponse");
    private final static QName _AddClient_QNAME = new QName("http://biblio.com/", "addClient");
    private final static QName _AddUser_QNAME = new QName("http://biblio.com/", "addUser");
    private final static QName _ListInfoDocumentResponse_QNAME = new QName("http://biblio.com/", "listInfoDocumentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.biblio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientResponse }
     * 
     */
    public ClientResponse createClientResponse() {
        return new ClientResponse();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link AddClient }
     * 
     */
    public AddClient createAddClient() {
        return new AddClient();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ListInfoDocumentResponse }
     * 
     */
    public ListInfoDocumentResponse createListInfoDocumentResponse() {
        return new ListInfoDocumentResponse();
    }

    /**
     * Create an instance of {@link ListDocumentResponse }
     * 
     */
    public ListDocumentResponse createListDocumentResponse() {
        return new ListDocumentResponse();
    }

    /**
     * Create an instance of {@link SearchBiblioResponse }
     * 
     */
    public SearchBiblioResponse createSearchBiblioResponse() {
        return new SearchBiblioResponse();
    }

    /**
     * Create an instance of {@link AddBiblioResponse }
     * 
     */
    public AddBiblioResponse createAddBiblioResponse() {
        return new AddBiblioResponse();
    }

    /**
     * Create an instance of {@link AddPretResponse }
     * 
     */
    public AddPretResponse createAddPretResponse() {
        return new AddPretResponse();
    }

    /**
     * Create an instance of {@link AddBiblio }
     * 
     */
    public AddBiblio createAddBiblio() {
        return new AddBiblio();
    }

    /**
     * Create an instance of {@link BibliothequeResponse }
     * 
     */
    public BibliothequeResponse createBibliothequeResponse() {
        return new BibliothequeResponse();
    }

    /**
     * Create an instance of {@link AddDocumentResponse }
     * 
     */
    public AddDocumentResponse createAddDocumentResponse() {
        return new AddDocumentResponse();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link AddDocument }
     * 
     */
    public AddDocument createAddDocument() {
        return new AddDocument();
    }

    /**
     * Create an instance of {@link DoLoginResponse }
     * 
     */
    public DoLoginResponse createDoLoginResponse() {
        return new DoLoginResponse();
    }

    /**
     * Create an instance of {@link DeletePret }
     * 
     */
    public DeletePret createDeletePret() {
        return new DeletePret();
    }

    /**
     * Create an instance of {@link PretResponse }
     * 
     */
    public PretResponse createPretResponse() {
        return new PretResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link ListClientResponse }
     * 
     */
    public ListClientResponse createListClientResponse() {
        return new ListClientResponse();
    }

    /**
     * Create an instance of {@link ListPret }
     * 
     */
    public ListPret createListPret() {
        return new ListPret();
    }

    /**
     * Create an instance of {@link SearchPret }
     * 
     */
    public SearchPret createSearchPret() {
        return new SearchPret();
    }

    /**
     * Create an instance of {@link ListPretResponse }
     * 
     */
    public ListPretResponse createListPretResponse() {
        return new ListPretResponse();
    }

    /**
     * Create an instance of {@link DoLogin }
     * 
     */
    public DoLogin createDoLogin() {
        return new DoLogin();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link DeletePretResponse }
     * 
     */
    public DeletePretResponse createDeletePretResponse() {
        return new DeletePretResponse();
    }

    /**
     * Create an instance of {@link DoLoginClientResponse }
     * 
     */
    public DoLoginClientResponse createDoLoginClientResponse() {
        return new DoLoginClientResponse();
    }

    /**
     * Create an instance of {@link ListDocument }
     * 
     */
    public ListDocument createListDocument() {
        return new ListDocument();
    }

    /**
     * Create an instance of {@link DoLoginClient }
     * 
     */
    public DoLoginClient createDoLoginClient() {
        return new DoLoginClient();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link SearchPretResponse }
     * 
     */
    public SearchPretResponse createSearchPretResponse() {
        return new SearchPretResponse();
    }

    /**
     * Create an instance of {@link InfoPretResponse }
     * 
     */
    public InfoPretResponse createInfoPretResponse() {
        return new InfoPretResponse();
    }

    /**
     * Create an instance of {@link ListClient }
     * 
     */
    public ListClient createListClient() {
        return new ListClient();
    }

    /**
     * Create an instance of {@link SearchBiblio }
     * 
     */
    public SearchBiblio createSearchBiblio() {
        return new SearchBiblio();
    }

    /**
     * Create an instance of {@link UtilisateurResponse }
     * 
     */
    public UtilisateurResponse createUtilisateurResponse() {
        return new UtilisateurResponse();
    }

    /**
     * Create an instance of {@link AddPret }
     * 
     */
    public AddPret createAddPret() {
        return new AddPret();
    }

    /**
     * Create an instance of {@link ListInfoDocument }
     * 
     */
    public ListInfoDocument createListInfoDocument() {
        return new ListInfoDocument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblio")
    public JAXBElement<SearchBiblio> createSearchBiblio(SearchBiblio value) {
        return new JAXBElement<SearchBiblio>(_SearchBiblio_QNAME, SearchBiblio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "UtilisateurResponse")
    public JAXBElement<UtilisateurResponse> createUtilisateurResponse(UtilisateurResponse value) {
        return new JAXBElement<UtilisateurResponse>(_UtilisateurResponse_QNAME, UtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addPret")
    public JAXBElement<AddPret> createAddPret(AddPret value) {
        return new JAXBElement<AddPret>(_AddPret_QNAME, AddPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInfoDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listInfoDocument")
    public JAXBElement<ListInfoDocument> createListInfoDocument(ListInfoDocument value) {
        return new JAXBElement<ListInfoDocument>(_ListInfoDocument_QNAME, ListInfoDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLoginClient")
    public JAXBElement<DoLoginClient> createDoLoginClient(DoLoginClient value) {
        return new JAXBElement<DoLoginClient>(_DoLoginClient_QNAME, DoLoginClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addClientResponse")
    public JAXBElement<AddClientResponse> createAddClientResponse(AddClientResponse value) {
        return new JAXBElement<AddClientResponse>(_AddClientResponse_QNAME, AddClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchPretResponse")
    public JAXBElement<SearchPretResponse> createSearchPretResponse(SearchPretResponse value) {
        return new JAXBElement<SearchPretResponse>(_SearchPretResponse_QNAME, SearchPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "InfoPretResponse")
    public JAXBElement<InfoPretResponse> createInfoPretResponse(InfoPretResponse value) {
        return new JAXBElement<InfoPretResponse>(_InfoPretResponse_QNAME, InfoPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listClient")
    public JAXBElement<ListClient> createListClient(ListClient value) {
        return new JAXBElement<ListClient>(_ListClient_QNAME, ListClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "deletePretResponse")
    public JAXBElement<DeletePretResponse> createDeletePretResponse(DeletePretResponse value) {
        return new JAXBElement<DeletePretResponse>(_DeletePretResponse_QNAME, DeletePretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLoginClientResponse")
    public JAXBElement<DoLoginClientResponse> createDoLoginClientResponse(DoLoginClientResponse value) {
        return new JAXBElement<DoLoginClientResponse>(_DoLoginClientResponse_QNAME, DoLoginClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listDocument")
    public JAXBElement<ListDocument> createListDocument(ListDocument value) {
        return new JAXBElement<ListDocument>(_ListDocument_QNAME, ListDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listPretResponse")
    public JAXBElement<ListPretResponse> createListPretResponse(ListPretResponse value) {
        return new JAXBElement<ListPretResponse>(_ListPretResponse_QNAME, ListPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLogin")
    public JAXBElement<DoLogin> createDoLogin(DoLogin value) {
        return new JAXBElement<DoLogin>(_DoLogin_QNAME, DoLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "PretResponse")
    public JAXBElement<PretResponse> createPretResponse(PretResponse value) {
        return new JAXBElement<PretResponse>(_PretResponse_QNAME, PretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listClientResponse")
    public JAXBElement<ListClientResponse> createListClientResponse(ListClientResponse value) {
        return new JAXBElement<ListClientResponse>(_ListClientResponse_QNAME, ListClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listPret")
    public JAXBElement<ListPret> createListPret(ListPret value) {
        return new JAXBElement<ListPret>(_ListPret_QNAME, ListPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchPret")
    public JAXBElement<SearchPret> createSearchPret(SearchPret value) {
        return new JAXBElement<SearchPret>(_SearchPret_QNAME, SearchPret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiblio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addBiblio")
    public JAXBElement<AddBiblio> createAddBiblio(AddBiblio value) {
        return new JAXBElement<AddBiblio>(_AddBiblio_QNAME, AddBiblio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliothequeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "BibliothequeResponse")
    public JAXBElement<BibliothequeResponse> createBibliothequeResponse(BibliothequeResponse value) {
        return new JAXBElement<BibliothequeResponse>(_BibliothequeResponse_QNAME, BibliothequeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addDocumentResponse")
    public JAXBElement<AddDocumentResponse> createAddDocumentResponse(AddDocumentResponse value) {
        return new JAXBElement<AddDocumentResponse>(_AddDocumentResponse_QNAME, AddDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addDocument")
    public JAXBElement<AddDocument> createAddDocument(AddDocument value) {
        return new JAXBElement<AddDocument>(_AddDocument_QNAME, AddDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "doLoginResponse")
    public JAXBElement<DoLoginResponse> createDoLoginResponse(DoLoginResponse value) {
        return new JAXBElement<DoLoginResponse>(_DoLoginResponse_QNAME, DoLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePret }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "deletePret")
    public JAXBElement<DeletePret> createDeletePret(DeletePret value) {
        return new JAXBElement<DeletePret>(_DeletePret_QNAME, DeletePret.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listDocumentResponse")
    public JAXBElement<ListDocumentResponse> createListDocumentResponse(ListDocumentResponse value) {
        return new JAXBElement<ListDocumentResponse>(_ListDocumentResponse_QNAME, ListDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchBiblioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "searchBiblioResponse")
    public JAXBElement<SearchBiblioResponse> createSearchBiblioResponse(SearchBiblioResponse value) {
        return new JAXBElement<SearchBiblioResponse>(_SearchBiblioResponse_QNAME, SearchBiblioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiblioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addBiblioResponse")
    public JAXBElement<AddBiblioResponse> createAddBiblioResponse(AddBiblioResponse value) {
        return new JAXBElement<AddBiblioResponse>(_AddBiblioResponse_QNAME, AddBiblioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPretResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addPretResponse")
    public JAXBElement<AddPretResponse> createAddPretResponse(AddPretResponse value) {
        return new JAXBElement<AddPretResponse>(_AddPretResponse_QNAME, AddPretResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "ClientResponse")
    public JAXBElement<ClientResponse> createClientResponse(ClientResponse value) {
        return new JAXBElement<ClientResponse>(_ClientResponse_QNAME, ClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addClient")
    public JAXBElement<AddClient> createAddClient(AddClient value) {
        return new JAXBElement<AddClient>(_AddClient_QNAME, AddClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInfoDocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://biblio.com/", name = "listInfoDocumentResponse")
    public JAXBElement<ListInfoDocumentResponse> createListInfoDocumentResponse(ListInfoDocumentResponse value) {
        return new JAXBElement<ListInfoDocumentResponse>(_ListInfoDocumentResponse_QNAME, ListInfoDocumentResponse.class, null, value);
    }

}
