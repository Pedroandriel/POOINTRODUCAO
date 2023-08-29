package br.senai.sp.poo_introducao;

import java.security.PublicKey;

public class Output {


    public void PrintTeacher(Teacher objTeacher){


        /** Print Information */

        System.out.println("Teache's name is: " + objTeacher.name );
        System.out.println("Your age is: " + objTeacher.age);
        System.out.println("Your email: " + objTeacher.email);
        System.out.println("Your Whatsapp: " + objTeacher.phoneNumber);
        System.out.println("You Specialist: " + objTeacher.specialist);


    }

    public void PrintAlunos(Alunos objAlunos){



        /** Print Information */

        System.out.println("Seu nome: " + objAlunos.nome);
        System.out.println("Sua idade: " + objAlunos.idade);
        System.out.println("Qual é seu Email: " + objAlunos.email);
        System.out.println("Informe sua Nota1: " + objAlunos.nota1);
        System.out.println("Informe Sua Nota2: " + objAlunos.not2);
        System.out.println("Informe sua frequencia " + objAlunos.Frequencia);
    }

}
