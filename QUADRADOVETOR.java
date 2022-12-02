import java.util.Scanner;
public class QUADRADOVETOR {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int i, a[], b[];
		a = new int [10];
		b = new int [10];
		for (i=0;i<10;i++) {
			System.out.println("Informe o "+(i+1)+"º número:");
			a[i]=in.nextInt();
			b[i]=a[i]*a[i];
		}
		for(i=0;i<10;i++) {
			if(i==0) {
				System.out.print("[ "+a[i]+" ");
			} else if (i==9) {
				System.out.print(a[i]+" ]");
			} else {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		for(i=0;i<10;i++) {
			if(i==0) {
				System.out.print("[ "+b[i]+" ");
			} else if (i==9) {
				System.out.print(b[i]+" ]");
			} else {
				System.out.print(b[i]+" ");
			}
		}
	}
}
