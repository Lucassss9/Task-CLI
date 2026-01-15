package com.lucas.taskcli;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task CLI Iniciado... \n ");

        boolean running = true;

        Scanner sc = new Scanner(System.in);

        while (running) {

            System.out.println("1 - Adicionar tarefa \n" +
                    "2 - Listar tarefas \n" +
                    "0 - Sair");

            System.out.println("\nEscolha uma opção: ");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Em construção...");
            } else if (escolha == 2) {
                System.out.println("Em construção...");
            } else {
                running = false;
            }
        }
    }
}
