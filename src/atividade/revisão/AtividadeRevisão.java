/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.revisão;

import java.util.Scanner;

/**
 *
 * @author João Henrique
 */
public class AtividadeRevisão {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila<Caminhoneiro> filaCaminhoneiros = new Fila<>(10);

        while (true) {
            System.out.println("\n1. Cadastrar caminhoneiro");
            System.out.println("2. Inserir caminhoneiro");
            System.out.println("3. Exibir fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    if (filaCaminhoneiros.estaCheia()) {
                        System.out.println("A fila está cheia. Não é possível cadastrar mais caminhoneiros.");
                        break;
                    }
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();
                    System.out.print("Horário de Chegada: ");
                    String horarioChegada = scanner.nextLine();
                    try {
                        filaCaminhoneiros.enfileirar(new Caminhoneiro(nome, placa, horarioChegada));
                        System.out.println("Caminhoneiro cadastrado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao cadastrar caminhoneiro: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (filaCaminhoneiros.estaVazia()) {
                        System.out.println("A fila está vazia. Não há caminhoneiros para atender.");
                        break;
                    }
                    try {
                        Caminhoneiro atendido = filaCaminhoneiros.desenfileirar();
                        System.out.println("Caminhoneiro atendido: " + atendido);
                    } catch (Exception e) {
                        System.out.println("Erro ao atender caminhoneiro: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Fila de caminhoneiros:");
                    System.out.println(filaCaminhoneiros);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
}
