package com.lucas.taskcli;

import com.lucas.taskcli.ui.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task CLI Iniciado... \n ");

        Menu menu = new Menu();

        boolean running = true;

        Scanner sc = new Scanner(System.in);

        while (running) {

            menu.menu();

            int escolha = menu.mostrarMenuEObterEntrada();

            switch (escolha) {
                case 0:
                    System.out.println("Encerrando...");
                    running = false;
                    break;
                case 1:
                    System.out.println("Em desenvolvimento...");
                    break;
                case 2:
                    System.out.println("Em desenvolvimento...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
    }
}
