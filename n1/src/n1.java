import java.util.Scanner;


public class n1 {

    public static void main(String args[]) {
        double aluminio = 100.00;
        double raio,alturaLata;
        
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o raio da lata em Metros");
        raio = sc.nextDouble();
        
        System.out.println("Digite a altura da lata em Metros");
        alturaLata = sc.nextDouble();
        double areaLado = 2*3.14*raio*alturaLata;
        double areaBase = 3.14*Math.pow(raio, 2)*2;

        double areaLata = areaBase + areaLado;


        double precoLata = aluminio*areaLata;

        System.out.println("O preço da lata pelo tamanho será de = " + precoLata);


        
        sc.close();

        
        
    }
    
}
