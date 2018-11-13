
CREATE TABLE ouvrage (
                refOuvrage INTEGER NOT NULL,
                nomOuvrage VARCHAR(255) NOT NULL,
                quantiteTotal VARCHAR(255) NOT NULL,
                nbrEmprunte VARCHAR(255) NOT NULL,
                quantiteRestante VARCHAR(100) NOT NULL,
                CONSTRAINT ouvrage_pk PRIMARY KEY (refOuvrage)
);


CREATE TABLE usager (
                refClient INTEGER NOT NULL,
                pseudo VARCHAR(255) NOT NULL,
                motPasse VARCHAR(255) NOT NULL,
                nom VARCHAR(255) NOT NULL,
                prenom VARCHAR(255) NOT NULL,
                email VARCHAR(255) NOT NULL,
                adresse VARCHAR(255) NOT NULL,
                codePostal VARCHAR(10) NOT NULL,
                CONSTRAINT usager_pk PRIMARY KEY (refClient)
);


CREATE TABLE pret (
                refPret INTEGER NOT NULL,
                refClient INTEGER NOT NULL,
                refOuvrage INTEGER NOT NULL,
                datePret VARCHAR(255) NOT NULL,
                dureePret VARCHAR(255) NOT NULL,
                dateFinPret VARCHAR(255) NOT NULL,
                nbrExemplaireEmprunte VARCHAR(10) NOT NULL,
                prolonger BOOLEAN NOT NULL,
                CONSTRAINT pret_pk PRIMARY KEY (refPret)
);


ALTER TABLE pret ADD CONSTRAINT ouvrage_pret_fk
FOREIGN KEY (refOuvrage)
REFERENCES ouvrage (refOuvrage)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE pret ADD CONSTRAINT usager_pret_fk
FOREIGN KEY (refClient)
REFERENCES usager (refClient)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
