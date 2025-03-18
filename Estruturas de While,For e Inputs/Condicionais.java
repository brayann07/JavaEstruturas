import java.util.Scanner;
public class Condicionais{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        double x;
        System.out.println("oi:\n1-sim\n2-nao");
        x = entrada.nextDouble();
        if(x == 1){
            System.out.println("oi");
        }
        else{
            System.out.println("ta");
        }
    }
}