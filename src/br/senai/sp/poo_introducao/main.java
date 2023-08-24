package br.senai.sp.poo_introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /** Instance Register */
        Register objRegister = new Register();

        /** Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("O que quer cadastrar [1- Prof 2- Alunos]");
        int opcao = teclado.nextInt();

        if (opcao==1){
            objRegister.Resgister();
        } else if (opcao==2) {
            objRegister.RegisterAlunos();

        }else {
            System.out.println("Opção Invalida !!!");
        }

    }
}
