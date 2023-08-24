package br.senai.sp.poo_introducao;

import java.util.Scanner;

public class Register {

    /** Instance Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instance Teacher */
    Teacher objTeacher = new Teacher();

    public void BothRegister(){

    }


    public void RegisterProfessor() {


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

        /** Print Information */

        System.out.println("Teache's name is: " + objTeacher.name);
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your email: " + objTeacher.email);
        System.out.println("Your Whatsapp: " + objTeacher.phoneNumber);
        System.out.println("You Specialist: " + objTeacher.specialist);
    }

    /** Instanciar Alunos */
    Alunos objAlunos = new Alunos();
    public void Resgister(){



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

        /** Print Information */

        System.out.println("Seu nome: " + objAlunos.nome);
        System.out.println("Sua idade: " + objAlunos.idade);
        System.out.println("Qual é seu Email: " + objAlunos.email);
        System.out.println("Informe sua Nota1: " + objAlunos.nota1);
        System.out.println("Informe Sua Nota2: " + objAlunos.not2);



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

        /** Print Information */

        System.out.println("Teache's name is: " + objTeacher.name );
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your email: " + objTeacher.email);
        System.out.println("Your Whatsapp: " + objTeacher.phoneNumber);
        System.out.println("You Specialist: " + objTeacher.specialist);
    }


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


    }
 public void RegisterAlunos(){

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

 }
}
