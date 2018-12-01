/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.daoImpl;


import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/*
Classe Mère qui fera hériter toutes les classes Dao
*/

public abstract class AbstractDaoImpl {
    

    /* Création de l'attribut Datasource permettant la connexion à la base de données */

    

    private static DataSource dataSource;



    public static void setDataSource(DataSource dataSource) {

        AbstractDaoImpl.dataSource = dataSource;

    }



    /* Connexion à la base de données avec l'aide du Driver JDBC (Java Database Connectivity) qui sera à configurer dans le Pom.xml du module Consumer */



    static JdbcTemplate getJdbcTemplate() {

        return new JdbcTemplate(dataSource);

    }



    static NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {

        return new NamedParameterJdbcTemplate(dataSource);
    }
}
