package sevicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	
	public int menuPincipal() {
		int seleccion;
		
		System.out.println("Eliga una opcion:");
		System.out.println("0.");
		System.out.println("1.");
		System.out.println("2.");
		
		
		seleccion = sc.nextInt();
		return seleccion;
	}
	
}
