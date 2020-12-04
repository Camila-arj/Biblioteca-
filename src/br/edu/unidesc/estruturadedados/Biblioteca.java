package br.edu.unidesc.estruturadedados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca extends Livros {


    public static void main(String[] args) {

        LinkedList<Livros> biblioteca = new LinkedList<Livros>();
        int opcao = 0;
        Scanner entr = new Scanner(System.in);

            do {
                System.out.println("----MENU----");
                System.out.println("1) Registrar");
                System.out.println("2) Pesquisar");
                System.out.println("3) Sair");
                System.out.println("Escolha uma opção: ");
                opcao = entr.nextInt();
                switch (opcao) {
                    case 1:

                        Livros livro1 = new Livros();
                        Scanner inf = new Scanner(System.in);

                        System.out.println("---- REGISTRAR LIVRO ----");
                        System.out.println("Informe o titulo: ");
                        String titulo = inf.next();
                        livro1.setTitulo(titulo);
                        System.out.println("Informe o autor: ");
                        String autor = inf.next();
                        livro1.setAutor(autor);
                        System.out.println("Informe o codigo: ");
                        int codigo = inf.nextInt();
                        livro1.setCodigo(codigo);
                        System.out.println("Livro registrado!");

                        biblioteca.add(livro1);

                        break;

                    case 2:
                        int opcao2 = 0;
                        Scanner inf2 = new Scanner(System.in);

                        System.out.println("---- PESQUISANDO LIVRO ----");
                        System.out.println("1) Pesquisar por titulo");
                        System.out.println("2) Pesquisar por autor");
                        System.out.println("3) pesquisar por codigo");
                        opcao2 = entr.nextInt();

                        if (opcao2 == 1){
                            System.out.println("Digite o tilulo: ");
                            String titulo2 = inf2.next();

                            for (Livros item: biblioteca) {
                                if (item.getTitulo() == titulo2){
                                    System.out.println("Livro encontrado!");
                                }else {
                                    System.out.println("Livro não encontrado!");
                                }
                            }
                        }else if (opcao2 == 2){
                            System.out.println("Digite o autor: ");
                            String autor2 = inf2.next();

                            for (Livros item:biblioteca) {
                                if (item.getAutor() == autor2){
                                    System.out.println("Livro encontrado!");
                                }else {
                                    System.out.println("Livro não encontrado!");
                                }
                            }
                        }else if (opcao2 == 3){
                            System.out.println("Digite o codigo: ");
                            String codigo2 = inf2.next();

                            for (Livros item:biblioteca) {
                                if (item.getAutor() == codigo2){
                                    System.out.println("Livro encontrado!");
                                }else {
                                    System.out.println("Livro não encontrado!");
                                }
                            }
                        }else {
                            System.out.println("Opção invalida!");
                        }
                }

            }while (opcao != 3);

            if (opcao == 3){
                System.out.println("Programa encerrado");
            }
    }
}