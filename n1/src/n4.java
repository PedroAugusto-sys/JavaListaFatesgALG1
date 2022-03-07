import java.util.Scanner;

public class n4 {



    public static void main(String args[]) {

        double x1,y1,x2,y2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o x1 de A");
        x1 = sc.nextDouble();
        System.out.println("Informe o y1 de A");
        y1 = sc.nextDouble();
        System.out.println("Informe o x2 de B");
        x2 = sc.nextDouble();
        System.out.println("Informe o y2 de B");
        y2 = sc.nextDouble();

            
        sc.close();

        double ac = Math.abs(y2 - y1);
        double cb = Math.abs(x2 - x1);

        

        System.out.println("A distância de A até B é de : " + Math.hypot(ac, cb) );

        



    }

    
}
