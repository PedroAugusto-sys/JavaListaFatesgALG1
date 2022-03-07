import java.util.Scanner;
public class n6 {       


    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        double horas,taxa;
        double postaxa3hr = 8.50;

        System.out.println("Por quantas horas foi utilizada a charrete?");
        horas = sc.nextDouble();
        taxa = horas*3.50;
        

        if (horas<3) {
           System.out.println("O preço pelo uso será de :" + taxa);
        } else if (horas==3) {
            System.out.println("O preço pelo uso será de : " + postaxa3hr);
        } else {
            System.out.println("O sistema não aceita mais de 3 horas de uso por cliente.");
        }

        sc.close();

    }
    
}
