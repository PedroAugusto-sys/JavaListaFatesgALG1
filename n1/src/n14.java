import java.util.Scanner;

public class n14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double kmlitro = 2.90;
        double carroAnda = 12;
        double tempoViagem,velocidadeMedia,dinheiroGasto;
        

        System.out.println("Forneça o tempo de viagem");
        tempoViagem = sc.nextDouble();
        System.out.println("Forneça a velocidade média do veículo em KM: ");
        velocidadeMedia = sc.nextDouble();

        double distancia = tempoViagem*velocidadeMedia;
        double quantidadeLitro = distancia/12;





        sc.close();
    }    


}
