package br.senai.sp.poo_introducao;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        /** Instance Register */
        Register objRegister = new Register();

        /** Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("O que quer cadastrar [1- Prof 2- Alunos 3- Aluno ]");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            objRegister.RegisterTeacher();
        } else if (opcao == 2) {
            objRegister.RegisterAlunos();

        } else if (opcao == 3) {
            objRegister.BothRegister();
        } else {
            System.out.println("Opção Invalida !!!");
        }


        }
    }
