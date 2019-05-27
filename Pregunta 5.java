import java.util.Scanner;

public class ASD {
	public static void main(String[] args) {
		
        Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la cadena que desea analizar: ");
		String texto = teclado.nextLine();
		int contador=1;
		for (int i=0 ; i<texto.length(); i++ ){
			if(texto.charAt(i) != texto.charAt(texto.length()-1-i)) {
				contador=0;
			}
		}
		if (contador == 1) 
			System.out.println("Es palíndromo");
			else 
				System.out.println("No es palíndromo");	
	}


}
