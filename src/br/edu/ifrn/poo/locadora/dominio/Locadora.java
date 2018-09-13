/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo.locadora.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Locadora {
    
    private List<Veiculo> veiculos = new ArrayList();
    
    public void cadastrarVeiculo(Veiculo veiculo){
        if (veiculo != null && !veiculos.contains(veiculo))
            veiculos.add(veiculo);
    }
    
    public void alugar(String placa){
        if (veiculos.contains(new Veiculo(placa))){
            veiculos.get(veiculos.indexOf(new Veiculo(placa))).setDisponibilidade(false);
        }
    }
    
}
