package sevicios;

import java.io.Console;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClubDto;
import dtos.UsuarioDto;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);

	public void DarAltaUsuario() {

		boolean error = true;

		UsuarioDto nuevoUsuario = new UsuarioDto();

		System.out.println("introduce tu nombre de usuario");
		String nombreUsario = sc.next();
		System.out.println("introduce tus apellidos");
		String apellidosUsuario = sc.next();
		System.out.println("Introduce tu correo electronico");
		String correoUsuario = sc.next();
		System.out.println("Introduce tu DNI");
		String dniUsuario = sc.next();

		while (error == true) {
			System.out.println("introduce tu contraseña");
			String contraseyaUsuario = sc.next();
			System.out.println("confirma tu contraseña");
			String confirmacionContraseya = sc.next();

			if (contraseyaUsuario.equals(confirmacionContraseya)) {
				error = false;
				nuevoUsuario.setNombre(nombreUsario);
				nuevoUsuario.setApellidos(apellidosUsuario);
				nuevoUsuario.setCorreoElectronico(correoUsuario);
				nuevoUsuario.setDni(dniUsuario);
				nuevoUsuario.setContraseya(confirmacionContraseya);
				Inicio.listaUsuario.add(nuevoUsuario);
			} else {
				error = true;
			}
		}

	}

}
