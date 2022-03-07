import java.util.Scanner;

public class n2 {


    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);        

        double f,c,pol,mili;


        System.out.println("Digite a temperatura em F°");
        f = sc.nextDouble();

        c = (f - 32) * 5/9;

        System.out.println("A temperatura de F° para C° é de : " + c);
        System.out.println("===========================================");

        System.out.println("Digite a quantidade de chuva em Polegadas");
        mili = sc.nextDouble();

        pol = mili*25.4;

        System.out.println("A quantidade de Plegadas para Milímetro " + pol);

        sc.close();
        

    }
    
}
