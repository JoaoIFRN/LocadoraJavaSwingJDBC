/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo.locadora.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joaon
 */
public class TestePersistencia {
    
    public static void main(String[] args) throws SQLException {
        /*Connection conexao = FabricaConexao.getConexao();
        
        PreparedStatement pstm = conexao.prepareStatement("select * from locadora");
        
        ResultSet rs = pstm.executeQuery();
        
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("nome"));
        }
        
        pstm = conexao.prepareStatement("insert into locadora (nome) values (?)");
        pstm.setString(1, "IFRN CAR");
        pstm.execute();*/
        
        GeralDAO geralDAO = new GeralDAO();
        ResultSet resultSet = geralDAO.consultar("select * from locadora");
        while (resultSet.next()){
            System.out.println(resultSet.getString("nome"));
        }
        
        geralDAO.executar("insert into locadora (nome )values (?)", "LOCXXX");
    }
    
}
