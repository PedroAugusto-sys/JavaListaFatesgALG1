import java.util.Scanner;

public class n3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        double precoFabric;
        
        
        
        System.out.println("Digite o preço de fábrica do automóvel: ");
        precoFabric = sc.nextDouble();


        double imposto = 0.30*precoFabric;
        double porcentagemdistribuidor = 0.12*precoFabric;
        double carroNovo=precoFabric+imposto+porcentagemdistribuidor;


        
        
       System.out.println("O preço do carro novo com o custo de fábrica será de: " + carroNovo);

       



        sc.close();


        
    }
    
}
