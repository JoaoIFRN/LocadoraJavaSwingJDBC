/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo.locadora.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class FabricaConexao {

    private static Connection connection;

    private FabricaConexao() {

    }

    public static Connection getConexao() {
        if (connection == null) {
            try {
                connection
                        = DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora",
                                "root",
                                "");
            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

        return connection;
    }

}
