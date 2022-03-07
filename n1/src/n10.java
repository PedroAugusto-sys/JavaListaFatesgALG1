import java.util.Scanner;

public class n10 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        double publicoTotal,publicoTotalResumido,ingressoPOP=1.0,ingressoGER=5.0,ingressoARQUI=10.0,ingressoCAD=20.0,tipoIngresso;
        double renda;
        
        System.out.println("Qual foi o público total de pessoas no estádio?");
        publicoTotal = sc.nextInt();

        System.out.println("Digite o tipo de ingresso: 1-IngressoPOPULAR 2-IngressoGERAL 3-IngressoARQUIBANCADA 4- IngressoCADEIRA ");
            tipoIngresso = sc.nextInt();

            if (tipoIngresso==1) {
                publicoTotalResumido = 0.10*publicoTotal;
                System.out.println("O tanto de pessoas que compraram o INGRESSO POPULAR:" + publicoTotalResumido);
                renda = ingressoPOP*publicoTotalResumido;
                System.out.println("O faturamento deste ingresso foi de: " + renda);
            } else if(tipoIngresso==2){

                publicoTotalResumido = 0.5*publicoTotal;
                System.out.println("O tanto de pessoas que compraram o INGRESSO POPULAR:" + publicoTotalResumido);
                renda = ingressoGER*publicoTotalResumido;
                System.out.println("O faturamento deste ingresso foi de : " + renda);
            } else if(tipoIngresso==3){
                publicoTotalResumido = 0.3*publicoTotal;
                System.out.println("O tanto de pessoas que compraram o INGRESSO ARQUIBANCADA" + publicoTotalResumido);
                renda=ingressoARQUI*publicoTotal;
                System.out.println("O faturamento deste ingressoi foi de : " + renda);
            }  else if(tipoIngresso==4){
                publicoTotalResumido=0.1*publicoTotal;
                System.out.println("O tanto de pessoas que compraram o INGRESSO CADEIRA" + publicoTotalResumido);
                renda = ingressoCAD*publicoTotal;
                System.out.println("O faturamento deste ingresso foi de :" + renda);
                
                sc.close();
            } else{

                System.out.println("Selecione um número válido.");
                sc.close();
                return;
                
            }

        }






      


}





