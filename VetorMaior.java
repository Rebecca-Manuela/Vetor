import java.util.*;
public class VetorMaior {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a[], i, maiorValor, menorValor;
		a = new int [10];
		System.out.println("Digite o "+(0+1)+"º número:");
		a[0]=in.nextInt();
		maiorValor = a[0];
		menorValor = a[0];
		for(i=1;i<=9;i++) {
			System.out.println("Digite o "+(i+1)+"º número:");
			a[i]=in.nextInt();
			if(a[i]>maiorValor) {
				maiorValor=a[i];
			} else if (a[i]<menorValor) {
				menorValor=a[i];
			}
		}
		System.out.println("O maior valor é: "+maiorValor);
		System.out.println("O menor valor é: "+menorValor);
	}
}
