package studying;

import java.util.Scanner;

public class vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 0, j=0, c=0;

		int[] v = new int[5];

		System.out.println("Insira 5 números para serem colocados em ordem decrescente: ");

		for (i = 0; i < 5; i++) {
			c = i+1;
			System.out.printf("Insira o número " + c + ": ");
			v[i] = sc.nextInt();
		}

		for (i = 0; i < 5; i++) {
			for(j = 0; j < 5; j++) {
				if(v[j]<v[i]) {
					c = v[i];
					v[i] = v[j];
					v[j] = c;
				}
			}
		}
	System.out.println("\nOrdem decrescente: ");
		for (i = 0; i < 5; i++) {
			c = i+1;
			System.out.printf("Número " + c + ": "+ v[i] + "\n");
		}
	}

}
