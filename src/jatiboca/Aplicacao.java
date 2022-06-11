
package jatiboca;
import java.util.Scanner;



public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double estoq1, estoq2,entrada,saida;
		String loja1 = "jatiboca";
		String loja2 = "pontal";
		
		System.out.println("Entre com o estoque inicial de acucar da empresa 1-jatiboca: ");
		estoq1=sc.nextDouble();
		System.out.println("Entre com o estoque inicial de acucar da empresa 2-pontal: ");
		estoq2=sc.nextDouble();
		
		System.out.println("que opcao deseja realizar? ");
		int option=sc.nextInt();
		
		switch(option) {
			case 1:
				System.out.println("em qual das lojas sera a entrada?");
				int qual = sc.nextInt();
				
				if(loja.equals(loja1)) {
					System.out.println("qual a quantidade de entrada?(kg)");
					entrada=sc.nextDouble();
					estoq1+=entrada;
					System.out.println("o estoque atual da jatiboca e de "+estoq1);
				} else if(loja.equals("pontal")) {
					System.out.println("aguardando conclusao");
				}
				break;
				
				
				
			
		}
		sc.close();
	}

}
