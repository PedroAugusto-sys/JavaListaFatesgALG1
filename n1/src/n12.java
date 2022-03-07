import java.util.Scanner;


public class n12 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n,n2;
        double n3,n4;


        System.out.println("O que você deseja? 1-Numero 2-Quadrado 3-Raiz Quadrada");
        n = sc.nextInt();
        
        if (n==1) {
            System.out.println("Que número você quer que ecoe?");
            n2 = sc.nextInt();
            System.out.println("O número que você digitou foi: " + n2);

        } else if(n==2) {
            System.out.println("Digite o numero que você quer que fique ao quadrado! ");
            n4 = sc.nextInt();
            System.out.println("O número que ficou ao quadrado " + Math.pow(n4, 2));
            
         } else if(n==3){

            System.out.println("Que número você quer que seja elevado ao quadrado?");
            n2 = sc.nextInt();

            n3= Math.pow(n2, 2);

            System.out.println("O número ao quadrado que você escolheu virou: " + n3);

         }






        sc.close();
        
    }
    

    
}
