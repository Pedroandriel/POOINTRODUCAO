package br.senai.sp.poo_introducao;


import java.util.Scanner;

import br.senai.sp.poo_introducao.*;

public class Register {
    /**
     * Declara Flag
     */
    boolean flag = true;

    /**
     * Instance Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * instanciar Output
     */
    Output objOutput = new Output();


    /**
     * Instance Teacher
     */
    Teacher objTeacher = new Teacher();

    public void BothRegister() {
        flag = false;

        RegisterAlunos();
        RegisterTeacher();


    }


    /**
     * Instanciar Alunos
     */
    Alunos objAlunos = new Alunos();


    public void RegisterTeacher() {

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Hello Teacher, What is your name: ");
        objTeacher.name = teclado.next();
        System.out.println("How old are you: ");
        objTeacher.age = teclado.nextInt();
        System.out.println("What is your email: ");
        objTeacher.email = teclado.next();
        System.out.println("Tell me your phone number: ");
        objTeacher.phoneNumber = teclado.nextInt();
        System.out.println("What is you specialist: ");
        objTeacher.specialist = teclado.next();
        System.out.println("-*-*-*-*-*-*-*-*-*--*-*--*-*-*-*-*-*-*-*-*");

        if (flag) {
            objOutput.PrintTeacher(objTeacher);
        }


    }

    public void RegisterAlunos() {

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/--/-/--/--/-/-/-");
        System.out.println("Olá Estudante, informe seu nome: ");
        objAlunos.nome = teclado.next();
        System.out.println("Informe sua Idade: ");
        objAlunos.idade = teclado.nextInt();
        System.out.println("Qual é o Seu email?: ");
        objAlunos.email = teclado.next();
        System.out.println("Informe sua Nota1: ");
        objAlunos.nota1 = teclado.nextInt();
        System.out.println("Informe sua Nota2: ");
        objAlunos.not2 = teclado.nextInt();

        if (flag) {
            objOutput.PrintAlunos(objAlunos);
        }

    }
}
