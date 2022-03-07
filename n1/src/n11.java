import java.util.Scanner;

public class n11 { 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int aritmetica,harmonica,geometrica,a,b,c,d,opcao;
        double quadratica;

        System.out.println("Insira a nota A");
        a = sc.nextInt();
        System.out.println("Insira a nota B");
        b= sc.nextInt();
        System.out.println("Insira a nota c");
        c = sc.nextInt();
        System.out.println("Insira a nota d");
        d = sc.nextInt();
        System.out.println("===========================================================================");
        System.out.println("Bem-vindo a calculadora de provas, por favor, escolha dentre estas opções:");
        System.out.println("1-Aritmética,2-Harmônica,3-Geométrica,4-Quadrática");
        opcao = sc.nextInt(); 
        
        if (opcao==1) {
            aritmetica = (a+b+c+d)/4;
            System.out.println("Resultado da Aritmética: " + aritmetica);
        } else if(opcao==2) {

            harmonica = 4/(1/a+1/b+1/c+1/d);
            System.out.println("Resultado da Harmônica: " + harmonica);
            
        } else if(opcao==3){
            geometrica = (a*b*c*d)*1/4;
            System.out.println("Resultado da Gemoétrica: " + geometrica);
        } else if(opcao==4){
            quadratica = (((Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)+Math.pow(d, 2))/2)*1/2);
            System.out.println("Resultado da Quadrática: " + quadratica);
        } else{
            System.out.println("Escolha um número listado e válido! (1-2-3-4)");
        }

        


        sc.close();


        
    }
    
}
