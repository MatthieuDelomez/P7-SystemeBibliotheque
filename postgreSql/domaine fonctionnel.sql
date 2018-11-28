
CREATE TABLE document (
                refOuvrage INTEGER NOT NULL,
                nomOuvrage VARCHAR(255) NOT NULL,
                quantiteTotal VARCHAR(20) NOT NULL,
                nbrEmprunte VARCHAR(25) NOT NULL,
                quantiteRestante VARCHAR(25) NOT NULL,
                CONSTRAINT document_pk PRIMARY KEY (refOuvrage)
);


CREATE TABLE utilisateur (
                refClient INTEGER NOT NULL,
                nom VARCHAR(255) NOT NULL,
                prenom VARCHAR(250) NOT NULL,
                sexe VARCHAR(250) NOT NULL,
                pseudo VARCHAR(150) NOT NULL,
                motPasse VARCHAR(255) NOT NULL,
                adresse VARCHAR(2550) NOT NULL,
                email VARCHAR(255) NOT NULL,
                codePostal VARCHAR(15) NOT NULL,
                CONSTRAINT utilisateur_pk PRIMARY KEY (refClient)
);


CREATE TABLE pret (
                refPret INTEGER NOT NULL,
                refClient INTEGER NOT NULL,
                refOuvrage INTEGER NOT NULL,
                datePret VARCHAR(100) NOT NULL,
                dureePret VARCHAR(100) NOT NULL,
                dateFinPret VARCHAR(100) NOT NULL,
                nbrExemplaire VARCHAR(100) NOT NULL,
                prolonger BOOLEAN NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (refPret)
);


ALTER TABLE pret ADD CONSTRAINT document_pret_fk
FOREIGN KEY (refOuvrage)
REFERENCES document (refOuvrage)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE pret ADD CONSTRAINT utilisateur_pret_fk
FOREIGN KEY (refClient)
REFERENCES utilisateur (refClient)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;