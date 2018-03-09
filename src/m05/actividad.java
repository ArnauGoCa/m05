package m05;

import java.util.Scanner;


/**
 * 
 * @author	Arnau<arnau.goca@gmail.com> 
 * @version 1.0	(versió actual)
 * @since 1.0	(la primera i probablement última versió del programa)
 *
 */

public class actividad {

	
	/**
	 * Contador de valors depenent del caracter
	 * 
	 * <p>
	 * A partir de l'String introduit s'envia a les funcions, 
	 * on aquestes depenent del contingut sumaran un contador
	 * </p>
	 * 
	 * @param String via Scanner
	 * @return Retorna suma dels contadors de les funcions
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		
		frase = " " + frase + " "; 
		
		int contador=vocalssoles(frase);
		int contador2 =vocalsjuntes(frase);
		int contador3=numeros(frase);
		int contador4 = contador+contador2+contador3;
		
		System.out.println(contador4);
		
	}

	
	/**
	 * <p>
	 * Si a l'String troba un número el sumara al contador
	 * <Tp>
	 * 
	 * 
	 * @param frase String introduida previament per teclat
	 * @return Retorna l'int contador que suma els numeros de l'String
	 */
	public static int numeros(String frase) {
		
		int contador3=0;
		
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)=='0'||frase.charAt(i)=='1'||frase.charAt(i)=='2'||frase.charAt(i)=='3'||frase.charAt(i)=='4'||frase.charAt(i)=='5'||frase.charAt(i)=='6'||frase.charAt(i)=='7'||frase.charAt(i)=='8'||frase.charAt(i)=='9') {
				int num = Integer.parseInt("" + frase.charAt(i));
				contador3 = contador3 + num;
			}
		}
		
		
		return contador3;
	}

	/**
	 * <p>
	 * Augmenta el contador en 2 cada vegada que veu que al costat 
	 * d'una vocal hi ha una vocal igual, pero contara 2 per cada una de les dues vocals ,
	 * per tant si n'hi ha dues vocals iguals juntes acabaria sumant 4
	 * </p>
	 * 
	 * 
	 * @param frase String introduida previament per teclat per l'usuari
	 * @return contador int sumant 2 per cada vocal junta amb un altre vocal igual
	 */
	public static int vocalsjuntes(String frase) {
		// TODO Auto-generated method stub
		int contador2=0;
		
		frase = frase.toLowerCase();
		
		for(int i=0; i<frase.length()-1; i++) {
			
			if((frase.charAt(i)=='a'&&(frase.charAt(i+1)=='a'||frase.charAt(i-1)=='a'))||(frase.charAt(i)=='e'&&(frase.charAt(i+1)=='e'||frase.charAt(i-1)=='e'))||(frase.charAt(i)=='i'&&(frase.charAt(i+1)=='i'||frase.charAt(i-1)=='i'))||(frase.charAt(i)=='o'&&(frase.charAt(i+1)=='o'||frase.charAt(i-1)=='o'))||(frase.charAt(i)=='u'&&(frase.charAt(i+1)=='u'||frase.charAt(i-1)=='u'))){
				contador2=contador2+2;
			}
			
		}
		
		
		return contador2;
	}

	/**
	 * <p>
	 * Augmentar el contador en 1 cada vegada que trobi una vocal sola,
	 * es a dir, cada vegada que trobi una vocal només envoltada per espais, o
	 * si es troba en un extrem de l'String amb un espai a l'altre costat
	 * </p>
	 * 
	 * 
	 * @param frase String introduida previament per teclat
	 * @return contador que suma si hi ha una vocal sola
	 */
	
	public static int vocalssoles(String frase) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		frase = frase.toLowerCase();
		
		for(int i=0; i<frase.length()-1; i++) {
			
			if(frase.charAt(i)==' '&&(frase.charAt(i+1)=='a'||frase.charAt(i+1)=='e'||frase.charAt(i+1)=='i'||frase.charAt(i+1)=='o'||frase.charAt(i+1)=='u')&&(frase.charAt(i+2)==' ')) {
				contador++;
			}
			
		}
		
		
		return contador;
	}

	

}
