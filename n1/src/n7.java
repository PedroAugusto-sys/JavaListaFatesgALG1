import java.util.Scanner;

public class n7 {
    
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double porcentagemIPI,valorpeca1,quantidadepeca1,valorpeca2,quantidadepeca2;

        System.out.println("Escreva o valor da peça 1");
        valorpeca1 = sc.nextDouble();
        System.out.println("Escreva quantidade da peça 1");
        quantidadepeca1 = sc.nextDouble();
        System.out.println("Escreva o valor da peça 2");
        valorpeca2 = sc.nextDouble();
        System.out.println("Escreva a quantidade da peça 2");
        quantidadepeca2 = sc.nextDouble();

        System.out.println("Escreva a porcentagem a ser aplicada do IPI");
         porcentagemIPI = sc.nextDouble();
         double porcentoporcentagemipi = porcentagemIPI/100;   
        
            double formula=(valorpeca1*quantidadepeca1+valorpeca2*quantidadepeca2)*(porcentoporcentagemipi/100+1);

            System.out.println("O valor total a ser computado é de: " + formula);

        sc.close();
    }
}
