package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        List<Endereco> enderecos = new ArrayList<>();

        int opc;
        do {
            System.out.println("Selecione uma opção: \n 1- Cadastrar pessoa \n 2- Pesquisar \n 3- Sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:

                        System.out.println("Insira o nome:");
                        String nome = scanner.next();
                        System.out.println("Insira a idade:");
                        int idade = scanner.nextInt();
                        System.out.println("Insira a quantidade de endereços:");
                        int qtdEndereco = scanner.nextInt();
                        for (int j = 0; j < qtdEndereco; j++) {

                            System.out.println("Insira o numero e a rua:");
                            enderecos.add(new Endereco(scanner.nextInt(), scanner.next()));
                        }
                        pessoas.add(new Pessoa(nome, idade, enderecos));

                    break;
                case 2:
                    pesquisarPessoa(pessoas);
                    break;
                case 3:
                    System.out.println("Programa encerrado!");

                default:
                    System.out.println("Essa opção não está disponivivel!");
            }
        } while (opc !=3);



    }
    public static void pesquisarPessoa(List<Pessoa> pessoas){
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Insira o nome que deseja pesquisar:");
         nome = scanner.next();

         for(Pessoa pessoa : pessoas){
             if(pessoa.getNome().equals(nome)){
                 System.out.println("Pessoa encontrada!");
                 System.out.println("Nome:"+pessoa.getNome() + "\n Idade:" + pessoa.getIdade());
                 for(Endereco endereco : pessoa.getEnderecos()){
                     System.out.println("\n Endereço" + " rua:" + endereco.getRua() + "\n numero:" + endereco.getNumero());
                 }

                 break;
             }

         }

    }
}