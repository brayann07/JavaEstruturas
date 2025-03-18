/* 1) Escrever um programa que leia nome, disciplina e duas notas dos 30 alunos de um curso. Após calcular a média final e verificar sua situação: 
	Alunos Reprovados (média < 5)
   Alunos em Recuperação (média >= 5 e média < 7)
	Alunos Aprovados (média >= 7)
 */
import java.util.Scanner;
public class AlunoContador {
    public static void main(String[] args) {
        String nome,disciplina;
        float nota1,nota2;
        float resultado = 0;
        int reprovados = 0;
        int recuperacao = 0;
        int aprovados = 0;
        
        for(int i = 1; i < 4 ; i++){
            @SuppressWarnings("resource")
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Qual seu nome:");
            nome = entrada.nextLine();
            System.out.println("Qual sua disciplina");
            disciplina = entrada.nextLine();
            System.out.println("Qual sua primeira nota");
            nota1 = entrada.nextFloat();
            System.out.println("Qual sua segunda nota");
            nota2 = entrada.nextFloat();
            resultado = (nota1 + nota2)/2; 
        if(resultado<5){
            reprovados +=1;
            System.out.println(nome+",você reprovou na matéria "+disciplina);
            
        }
        if(resultado>=5 && resultado<7){
            recuperacao +=1;
            System.out.println("Infelizmente "+nome+" você ficou em recuperação na matéria "+disciplina);
            
        }
        if(resultado>=7){
            aprovados +=1;
            System.out.println("Parabéns "+nome+" você passou na matéria "+disciplina);
           
        }
        
        }
        System.out.println("Número de alunos reprovados:"+reprovados);
        System.out.println("Número de alunos recuperação:"+recuperacao);
        System.out.println("Número de alunos aprovados:"+aprovados);
    }
}
