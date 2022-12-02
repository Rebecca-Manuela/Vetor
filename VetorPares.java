import java.util.*;
public class VetorPares {
	public static void main(String[]args) {
		Scanner in = new Scanner  (System.in);
		int a[],b[], i, qtdPar=0;
		a = new int [10];
		b = new int [10];
		for(i=0;i<=9;i++) {
			System.out.println("Informe o "+(i+1)+"º número: ");
			a[i] = in.nextInt();
			if(a[i]%2 ==0) {
				b[i]=a[i];
				qtdPar ++;
			}
		}
		for(i=0;i<=9;i++) {
			if (i==0) {
				System.out.print("["+a[i]+" ");
			} else if (i==9) {
				System.out.println(a[i]+"]");
			} else {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("Os valores pares são: ");
		for(i=0;i<=9;i++) {
			if (i==0) {
				System.out.print("["+b[i]+" ");
			} else if (i==9) {
				System.out.println(b[i]+"]");
			} else {
				System.out.print(b[i]+" ");
			}
		}
		System.out.println("Tendo no total "+qtdPar+" valores pares.");
	}
}
