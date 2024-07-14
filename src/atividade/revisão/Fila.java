/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.revisão;

/**
 *
 * @author João Henrique
 */
public class Fila <T>{
    
    private int capacidade;
    private T[ ] fila;
    private int frente;
    private int tras;
    private int tamanho;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.fila = (T[]) new Object[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public void enfileirar(T item) throws Exception {
        if (estaCheia()) {
            throw new Exception("Fila cheia");
        }
        tras = (tras + 1) % capacidade;
        fila[tras] = item;
        tamanho++;
    }

    public T desenfileirar() throws Exception {
        if (estaVazia()) {
            throw new Exception("Fila vazia");
        }
        T item = fila[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return item;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(fila[(frente + i) % capacidade].toString()).append("\n");
        }
        return sb.toString();
    }
    
}
