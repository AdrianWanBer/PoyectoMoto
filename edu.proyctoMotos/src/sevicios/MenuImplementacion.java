package sevicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner sc = new Scanner(System.in);

	public int menuPincipal() {
		int seleccion;

		System.out.println("MENU PRINCIPAL");
		System.out.println("Eliga una opcion:");
		System.out.println("0. Cerrar Menu");
		System.out.println("1.");
		System.out.println("2.");

		seleccion = sc.nextInt();
		return seleccion;
	}

	public int menuUsuario() {
		int seleccion;

		System.out.println("MENU USUARIO:");
		System.out.println("Eliga una opcion:");
		System.out.println("0. Cerrar Menu");
		System.out.println("1.Dar alta un nuevo usuario");
		System.out.println("2.Modificar usuario");
		System.out.println("3.Eliminar usuario");

		seleccion = sc.nextInt();
		return seleccion;
	}

}
