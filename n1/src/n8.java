import java.util.Scanner;


public class n8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        int nFuncionario,nFilho;
        int horTrabFuncionario,valorPorHora,SalarioFamilia,SalarioTotal,SalarioFinal;
        System.out.println("===========================================");
        System.out.println("Informe o Número do Funcionário:");
        nFuncionario = sc.nextInt();
        System.out.println("===========================================");
        System.out.println("Informe as horas trabalhadas do Funcionário:");
        horTrabFuncionario = sc.nextInt();
        System.out.println("===========================================");
        System.out.println("Informe o salário familia para cada filho menor de 14 anos:");
        SalarioFamilia = sc.nextInt();
        System.out.println("===========================================");
        System.out.println("Qual é o valor por hora do funcionário?");
        valorPorHora = sc.nextInt();

        SalarioTotal = horTrabFuncionario*valorPorHora;

        System.out.println("Possui filho que possui menos de 14 anos? 1- Sim 2 - Não");
        nFilho = sc.nextInt();  
        if (nFilho==1) {
            System.out.println("===========================================");
            System.out.println("Quantos filhos?");
            nFilho = sc.nextInt();

            SalarioFinal = SalarioTotal+SalarioFamilia;  
            int SalarioFinalFamilia = SalarioFamilia*nFilho;  
            System.out.println("===========================================");
            System.out.println("O número do funcionário é : " + nFuncionario);
            System.out.println("seu salário é de: " + SalarioFinal+SalarioFinalFamilia);     
        } else {    
            System.out.println("===========================================");
            System.out.println("O número do funcionário é: " + nFuncionario);
            System.out.println("seu salário é de: " + SalarioTotal);
            sc.close();
            return;
             
        }



       sc.close();
        
        
    }
}
