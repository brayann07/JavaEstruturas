/* Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez. */

import java.util.Scanner;
public class Final {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,media;
        System.out.println("Nota 1:");
        nota1 = entrada.nextInt();
        System.out.println("Nota 2:");
        nota2 = entrada.nextInt();
        media = (nota1 + nota2) / 2;
        if(media >=7 && media <10){
            System.out.println("Passou!");
        }
        if(media <7){
            System.out.println("!Passou");
        }
        if(media >=10){
            System.out.println("Passou com distinção!");
        }
    }
}
