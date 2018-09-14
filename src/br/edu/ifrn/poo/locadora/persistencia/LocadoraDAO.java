/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo.locadora.persistencia;

import br.edu.ifrn.poo.locadora.dominio.Locadora;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class LocadoraDAO extends GeralDAO{
    
    public void salvar(Locadora locadora) throws SQLException{
        String sql = "insert into locadora (nome) values (?)";
        executar(sql, locadora.getNome());        
    }
    
    public List<Locadora> listar() throws SQLException{
        String sql = "select id,nome from locadora";
        ResultSet resultSet = consultar(sql);
        List<Locadora> locadoras = new ArrayList();
        while (resultSet.next()){
            locadoras.add(popularLocadora(resultSet));
        }
        return locadoras;
    }
    
    private Locadora popularLocadora(ResultSet resultSet) throws SQLException{
        Locadora locadora = new Locadora();
        locadora.setId(resultSet.getInt("id"));
        locadora.setNome(resultSet.getString("nome"));
        return locadora;
    }
    
}
