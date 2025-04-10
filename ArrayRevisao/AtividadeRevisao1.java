/* 1)Uma indústria deseja controlar seus funcionários. Construir um programa JAVA  que onsidere o problema de registrar os nomes dos funcionários, seus respectivos cargos e salários em Arrays (separadas). Após a leitura, imprimir os funcionários, cargos e salários cadastrados. */

import javax.swing.JOptionPane;

public class AtividadeRevisao1{
    public static void main(String[] args){
        String[] nomes = new String[2];
        String[] cargos = new String[2];
        float[] salarios = new float[2];
        for (int i = 0; i < 2; i++) {
            String nome = JOptionPane.showInputDialog("Qual seu nome?:");
            String cargo = JOptionPane.showInputDialog("Qual seu cargo?:");
            float salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salario?:"));
            nomes[i] = nome;
            cargos[i] = cargo;
            salarios[i] = salario;
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("------------------\nNome:"+nomes[i]+"\nCargo:"+cargos[i]+"\nSeu salário é:"+salarios[i]+"\n");

        }
    }
}