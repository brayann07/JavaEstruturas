/* 
5) Construir um algoritmo que receba como entrada os dados  de 100 alunos de uma Universidade: nome, idade e sexo. Após verifique a quantidade de alunos:
Total de alunos maior e menor de idade (18 anos)
Total de alunos por sexo (masculino e feminino)
 */

/* import javax.swing.JOptionPane;

public class EscolaCout {
    public static void main(String[] args) {
        String nome,idade,sexo;
        int masc = 0;
        int fem = 0;
        int maior = 0;
        int menor = 0;
        for(int i = 0; i<5;i++){
            nome = JOptionPane.showInputDialog("Qual seu nome:").toUpperCase();
            idade = JOptionPane.showInputDialog("Qual sua idade:");
            sexo = JOptionPane.showInputDialog("Qual seu sexo:\nM-Masculino\nF-Feminino");
            float numIdade = Float.parseFloat(idade);
            if(numIdade >= 18){
                maior +=1;
            }else{
                menor +=1;
            }
            if(sexo.equalsIgnoreCase("M")){
                masc +=1;
            }else if(sexo.equalsIgnoreCase("F")){
                fem +=1;
            }else{
                System.out.println("Sexo Inválido");
            }
        }
        System.out.println("Número de homens:"+masc);
        System.out.println("Número de mulheres:"+fem);
        System.out.println("Número de maiores de idade:"+maior);
        System.out.println("Número de menores de idade:"+menor);
    }
}
 */