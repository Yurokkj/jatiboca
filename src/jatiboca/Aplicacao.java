
package jatiboca;
import java.util.Scanner;



public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double estoq1, estoq2,entrada, transfer;
		
		
		System.out.println("Entre com o estoque inicial de acucar da filial 1-jatiboca: ");
		estoq1=sc.nextDouble();
		System.out.println("Entre com o estoque inicial de acucar da filial 2-pontal: ");
		estoq2=sc.nextDouble();
		
		String test="y";
		String nula="";
		while("y".equals(test)) {
		System.out.println("que opcao deseja realizar? ");
		System.out.println("1-Entrada de estoque");
		System.out.println("2-Saida de estoque");
		System.out.println("3-Tranferencia de estoque");
		System.out.println("4-Consultar estoque");
		System.out.println("5-Sair");
		
		int option=sc.nextInt();
		switch(option) {
			case 1:
				System.out.println("em qual das filiais sera a entrada? (nome)");
				String nullo = sc.nextLine();
				String qual = sc.nextLine();
				if("jatiboca".equals(qual)) {
						System.out.println("qual a quantidade de entrada?(kg)");
						entrada=sc.nextDouble();
						estoq1+=entrada;
						System.out.println("o estoque atual da jatiboca e de: "+estoq1+" kg");
				} else if("pontal".equals(qual)) {
						System.out.println("qual a quantidade de entrada?(kg)");
						entrada=sc.nextDouble();
						estoq2+=entrada;
						System.out.println("o estoque atual da Pontal e de: "+estoq2+" kg");
				}else {
						System.out.println("erro! nome invalido.");
				}
				
				System.out.println("deseja realizar alguma outra operecao? y/n ");
				nula=sc.nextLine();
				test=sc.nextLine();
				break;
			case 2:
				System.out.println("de qual filial sera retirado o estoque? (nome)");
				 nullo = sc.nextLine();
				 qual = sc.nextLine();
				 if("jatiboca".equals(qual)) {
						System.out.println("qual a quantidade de saida?(kg)");
						entrada=sc.nextDouble();
						estoq1-=entrada;
						System.out.println("o estoque atual da jatiboca e de: "+estoq1+" kg");
				} else if("pontal".equals(qual)) {
						System.out.println("qual a quantidade de saida?(kg)");
						entrada=sc.nextDouble();
						estoq2-=entrada;
						System.out.println("o estoque atual da Pontal e de: "+estoq2+" kg");
				}else {
						System.out.println("erro! nome invalido.");
				}
				 
				 System.out.println("deseja realizar alguma outra operecao? y/n ");
				 nula = sc.nextLine();
				test=sc.nextLine();
				break;
			case 3:
				System.out.println("De qual filial sera transferido o estoque? (nome) ");
				nullo = sc.nextLine();
				 qual = sc.nextLine();
				if("jatiboca".equals(qual)) {
						System.out.println("Qual a quantidade sera tranferida da "+qual+" ? (kg)");
						transfer = sc.nextDouble();
						estoq1-=transfer;
						estoq2+=transfer;
						System.out.println("o estoque atual da Jatiboca e de "+estoq1+" e o estoque da Pontal e de "+estoq2);
				}else if("pontal".equals(qual)) {
						System.out.println("Qual a quantidade sera tranferida da "+qual+" ? (kg)");
						transfer = sc.nextDouble();
						estoq2-=transfer;
						estoq1+=transfer;
						System.out.println("o estoque atual da Pontal e de "+estoq2+" e o estoque da Jatiboca e de "+estoq1);
				}else {
						System.out.println("Erro! nome invalido.");
				}
				
				System.out.println("deseja realizar alguma outra operecao? y/n ");
				 nula = sc.nextLine();
				test=sc.nextLine();
				break;
			case 4:
						System.out.println("Estoque atual");
						System.out.println("--------------------------");
						System.out.println("Jatiboca- "+estoq1+" kg");
						System.out.println("Pontal- "+estoq2+" kg");
						System.out.println("--------------------------");
						
						System.out.println("deseja realizar alguma outra operecao? y/n ");
						 nula = sc.nextLine();
						test=sc.nextLine();
				break;
			case 5:
					test="n";
				break;
		}
		}
		sc.close();
		System.out.println("encerrando aplicacao");
		System.out.println("Obrigado pela preferencia :)");
	}
		
	

}
