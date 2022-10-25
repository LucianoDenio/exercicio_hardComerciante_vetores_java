package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		Product[] product = new Product[n];
		
		for(int i=0;i<product.length;i++) {
			System.out.printf("Produto %d: %n", i+1);
			System.out.print("NOME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço de compra: ");
			double buy = sc.nextDouble();
			System.out.print("Preço de venda: ");
			double sell = sc.nextDouble();
			
			product[i] = new Product(name, buy, sell);
		}
		
		
		int low = 0, medio =0, tall =0;
		for(int i=0;i<product.length;i++) {
			if(product[i].percent(product[i].getBuy(),product[i].getSell()) < 10.0) {
				low ++;
			}
			else if(product[i].percent(product[i].getBuy(),product[i].getSell()) <= 20.0) {
				medio ++;
			}
			else tall++;
		}
		
		System.out.println();
		System.out.println("RELATORIO: ");
		System.out.println("Lucro abaixo de 10%: " + low);
		System.out.println("Lucro entre 10% e 20%: " + medio);
		System.out.println("Lucro acima de 20%: " + tall);
		System.out.printf("Valor total de compra: %.2f%n" , Product.allBuy(product));
		System.out.printf("Valor total de venda: %.2f%n" , Product.allSee(product));
		System.out.printf("Lucro total: %.2f%n", Product.gain(product));
		
		sc.close();

	}

}
