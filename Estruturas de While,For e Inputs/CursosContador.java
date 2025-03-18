/* 2) Escrever um algoritmo para cadastrar dados de 50 alunos de uma Escola: nome do aluno e a sigla do curso e verificar o total alunos em cada curso:
		Sigla			Curso
		INF		      	Informática
		MEC			Mecatrônica
		ELE			Eletrônica
		DES			Design
 */
import javax.swing.JOptionPane;
public class CursosContador {
    public static void main(String[] args) {
        String nome,sigla;
        int info = 0;
        int mec = 0;
        int ele = 0;
        int des = 0;
        for(int i = 0; i < 3; i++){
            nome = JOptionPane.showInputDialog("Digite seu nome");
            sigla = JOptionPane.showInputDialog("Digite seu curso");
            System.out.println("------------\nCurso:\nInformática-INFO\nMecatrÔnica-MEC\nEletrônica-ELE\nDesign-DES\n-----------");
            if(sigla.equalsIgnoreCase("INFO")){
                info +=1;
                System.out.println(nome+",Você faz Informática!");
            }else if(sigla.equalsIgnoreCase("MEC")){
                mec +=1;
                System.out.println(nome+",Você faz Mecatrônica!");
            }else if(sigla.equalsIgnoreCase("ELE")){
                ele +=1;
                System.out.println(nome+",Você faz Eletrônica!");
            }else if(sigla.equalsIgnoreCase("DES")){
                des +=1;
                System.out.println(nome+",Você faz Design Gráfico!");
            }
        }
        System.out.println("Número de gente que faz Informática:"+info);
        System.out.println("Número de gente que faz Mecâtronica:"+mec);
        System.out.println("Número de gente que faz Eletrônica:"+ele);
        System.out.println("Número de gente que faz Design Gráfico:"+des);
    }
}
