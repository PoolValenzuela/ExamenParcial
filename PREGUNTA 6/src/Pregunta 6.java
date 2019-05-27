import java.util.Scanner;

public class ASDASD {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		int f=0, mult=0,k=0,l=0;
		System.out.println("Ingrese la cantidad de números a evaluar: ");
		int n = teclado.nextInt();
		
		
		int [] conjunto = new int [n];
		System.out.println("Ingrese los valores del conjunto de números: ");
		for (int i=0;i<conjunto.length; i++) {
			System.out.print("Matriz conjunto["+ i +"]: ");
			conjunto[i]=teclado.nextInt();		
		}
		for (int i=0; i<conjunto.length-3;i++) {
			for(int j=0; j<4; j++) {
				mult=f*conjunto[i+j];
			}
			if(k<=mult) {
				k=mult;
				l=i;
			}
		}
		System.out.println(conjunto[l]+" "+conjunto[l+1]+" "+conjunto[l+2]+" "+conjunto[l+3]);
	}

}
