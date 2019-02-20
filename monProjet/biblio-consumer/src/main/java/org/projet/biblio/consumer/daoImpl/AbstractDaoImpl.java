package org.projet.biblio.consumer.daoImpl;


import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


/**
 * Classe Mère qui fera hériter toutes les classes Dao.
 * 
 *
 * @author Delomez Matthieu
 */
public abstract class AbstractDaoImpl {
    

    /* Création de l'attribut Datasource permettant la connexion à la base de données */

    private static DataSource dataSource;

    /**
     *
     * @param dataSource
     */
    public static void setDataSource(DataSource dataSource) {

        AbstractDaoImpl.dataSource = dataSource;

    }

    /* Connexion à la base de données avec l'aide du Driver JDBC (Java Database Connectivity) */

    static JdbcTemplate getJdbcTemplate() {

        return new JdbcTemplate(dataSource);

    }


    static NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {

        return new NamedParameterJdbcTemplate(dataSource);
    }
}
