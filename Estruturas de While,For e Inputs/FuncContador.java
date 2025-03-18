/* 3) Construir um algoritmo para cadastrar os dados dos 50 funcionários, a partir dos dados de entrada: nome, setor e salário. E verificar o total de funcionários de cada setor.
Sigla		Cargo		
A			Almoxarifado		
P			Produção
C			Contabilidade
V			Vendas

Ao final, exibir o total de todos os salários. */

import javax.swing.JOptionPane;

public class FuncContador {
    public static void main(String[] args) {
        String nome,setor;
        String salario;
        int contA = 0;
        int contP = 0;
        int contC = 0;
        int contV = 0;
        float resultadosal = 0;
        for(int i =1;i<3;i++){
            nome = JOptionPane.showInputDialog("Qual seu nome:").toUpperCase();
            System.out.println("----------\nQual seu cargo:\nA-Almoxarifado\nP-Produção\nC-Contabilidade\nV-Vendas\n----------");
            setor = JOptionPane.showInputDialog(":");
            salario = JOptionPane.showInputDialog("Qual seu salário:");
            float sal = Float.parseFloat(salario);
            resultadosal = resultadosal + sal;
            if(setor.equalsIgnoreCase("A")){
                contA +=1;
                System.out.println(nome+", Seu cargo é Almoxarifado e seu salário é:"+sal);
            }else if(setor.equalsIgnoreCase("P")){
                contP +=1;
                System.out.println(nome+", Seu cargo é Contabilidadee seu salário é:"+sal);
            }else if(setor.equalsIgnoreCase("C")){
                contC +=1;
                System.out.println(nome+", Seu cargo é Contabilidade e seu salário é:"+sal);
            }else if(setor.equalsIgnoreCase("V")){
                contV +=1;
                System.out.println(nome+", Seu cargo é Vendas e seu salário é:"+sal);
            }else{
                System.out.println("Escreve algo correto senão vai ignorar");
            }
        }
        System.out.println("Número de pessoas em Almoxarifado:"+contA);
        System.out.println("Número de pessoas em Produção:"+contP);
        System.out.println("Número de pessoas em Contabilidade:"+contC);
        System.out.println("Número de pessoas em Vendas:"+contV);
        System.out.println("Total salário de todos:"+resultadosal);
    }
}
