import java.util.Scanner;

public class n5 {
    

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double base,altura,volume;

        System.out.println("Insira a base da pirâmide:");
        base = sc.nextDouble();
        System.out.println("Insira a altura da pirâmide:");
        altura = sc.nextDouble();

        volume = 0.333333*base*altura;


        System.out.println("O volume da pirâmide é de:" + volume);

        sc.close();


    }




}
