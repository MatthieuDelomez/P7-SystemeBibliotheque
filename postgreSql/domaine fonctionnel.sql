
CREATE SEQUENCE public.bibliotheque_refbibliotheque_seq;

CREATE TABLE public.bibliotheque (
                refBibliotheque INTEGER NOT NULL DEFAULT nextval('public.bibliotheque_refbibliotheque_seq'),
                nom VARCHAR(255) NOT NULL,
                adresse VARCHAR(255) NOT NULL,
                ville VARCHAR NOT NULL,
                codePostal VARCHAR(50) NOT NULL,
                description VARCHAR(255) NOT NULL,
                CONSTRAINT bibliotheque_pk PRIMARY KEY (refBibliotheque)
);


ALTER SEQUENCE public.bibliotheque_refbibliotheque_seq OWNED BY public.bibliotheque.refBibliotheque;

CREATE SEQUENCE public.utilisateur_idutilisateur_seq;

CREATE TABLE public.utilisateur (
                idUtilisateur INTEGER NOT NULL DEFAULT nextval('public.utilisateur_idutilisateur_seq'),
                refBibliotheque INTEGER NOT NULL,
                pseudo VARCHAR(255) NOT NULL,
                motPasse VARCHAR(255) NOT NULL,
                email VARCHAR(255) NOT NULL,
                nom VARCHAR(255) NOT NULL,
                prenom VARCHAR(255) NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (idUtilisateur)
);


ALTER SEQUENCE public.utilisateur_idutilisateur_seq OWNED BY public.utilisateur.idUtilisateur;

CREATE SEQUENCE public.document_refouvrage_seq;

CREATE TABLE public.document (
                refOuvrage INTEGER NOT NULL DEFAULT nextval('public.document_refouvrage_seq'),
                refBibliotheque INTEGER NOT NULL,
                nomOuvrage VARCHAR(255) NOT NULL,
                quantiteTotal VARCHAR(20) NOT NULL,
                CONSTRAINT document_pk PRIMARY KEY (refOuvrage)
);


ALTER SEQUENCE public.document_refouvrage_seq OWNED BY public.document.refOuvrage;

CREATE SEQUENCE public.client_refclient_seq;

CREATE TABLE public.client (
                refClient INTEGER NOT NULL DEFAULT nextval('public.client_refclient_seq'),
                refBibliotheque INTEGER NOT NULL,
                nom VARCHAR(255) NOT NULL,
                prenom VARCHAR(250) NOT NULL,
                sexe VARCHAR(250) NOT NULL,
                pseudo VARCHAR(150) NOT NULL,
                motPasse VARCHAR(255) NOT NULL,
                adresse VARCHAR(2550) NOT NULL,
                email VARCHAR(255) NOT NULL,
                codePostal VARCHAR(15) NOT NULL,
                CONSTRAINT client_pk PRIMARY KEY (refClient)
);


ALTER SEQUENCE public.client_refclient_seq OWNED BY public.client.refClient;

CREATE SEQUENCE public.pret_refpret_seq;

CREATE TABLE public.pret (
                refPret INTEGER NOT NULL DEFAULT nextval('public.pret_refpret_seq'),
                refClient INTEGER NOT NULL,
                refOuvrage INTEGER NOT NULL,
                datePret DATE NOT NULL,
                dureePret VARCHAR(100) NOT NULL,
                dateFinPret DATE NOT NULL,
                nbrExemplaire VARCHAR(100) NOT NULL,
                prolonger BOOLEAN NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (refPret)
);


ALTER SEQUENCE public.pret_refpret_seq OWNED BY public.pret.refPret;

ALTER TABLE public.document ADD CONSTRAINT bibliotheque_document_fk
FOREIGN KEY (refBibliotheque)
REFERENCES public.bibliotheque (refBibliotheque)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.utilisateur ADD CONSTRAINT bibliotheque_utilisateur_fk
FOREIGN KEY (refBibliotheque)
REFERENCES public.bibliotheque (refBibliotheque)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.client ADD CONSTRAINT bibliotheque_client_fk
FOREIGN KEY (refBibliotheque)
REFERENCES public.bibliotheque (refBibliotheque)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pret ADD CONSTRAINT document_pret_fk
FOREIGN KEY (refOuvrage)
REFERENCES public.document (refOuvrage)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.pret ADD CONSTRAINT utilisateur_pret_fk
FOREIGN KEY (refClient)
REFERENCES public.client (refClient)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
