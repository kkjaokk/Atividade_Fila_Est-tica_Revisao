/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.revisão;

/**
 *
 * @author João Henrique
 */
public class Caminhoneiro {
    
    private String nome;
    private String placa;
    private String horarioChegada;

    public Caminhoneiro(String nome, String placa, String horarioChegada) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }

    @Override
    public String toString() {
        return "Caminhoneiro [ " +  "nome='" + nome  + "\n"+  ", placa='" + placa + "\n"+", horarioChegada='" + horarioChegada +  "]";
    }
    
}
