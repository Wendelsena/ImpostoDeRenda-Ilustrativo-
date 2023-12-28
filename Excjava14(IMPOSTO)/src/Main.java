import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculo de imposto de renda\n");
		
		System.out.println("Tabela exemplo\n");
		System.out.println("Renda------------------------ Imposto\n"
				+ "de R$0,00 à R$2000,00 ------- 0%\n"
				+ "de R$2000,01 à R$3000,00 ---- 8%\n"
				+ "de R$3000,01 à R$4500,00 ---- 18%\n"
				+ "acima de R$4500,00 ---------- 28%\n");
		
		double salario, imposto;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor, digite sua renda mensal, com centavos: ");
		salario = sc.nextDouble();
		
		
		if (salario > 2000 && salario <= 3000) {
			
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("Você irá pagar: R$%.2f%n", imposto);
		}
		
		else if (salario > 3000 && salario <= 4500) {
			
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
			System.out.printf("Você irá pagar: R$%.2f%n", imposto);
		}
		
		else if (salario > 4500) {
			
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Você irá pagar: R$%.2f%n", imposto);
		}
		
		else {
			System.out.println("Isento");
		}
		
		
		sc.close();

	}

}
