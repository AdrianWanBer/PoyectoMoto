package sevicios;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import controladores.Inicio;
import dtos.ClubDto;
import dtos.UsuarioDto;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);

	public void DarAltaUsuario() {

		UsuarioDto nuevoUsuario = new UsuarioDto();

		System.out.println("introduce tu nombre de usuario");
		String nombreUsario = sc.next();
		System.out.println("introduce tus apellidos");
		String apellidosUsuario = sc.next();
		System.out.println("Introduce tu correo electronico");
		String correoUsuario = sc.next();
		System.out.println("Introduce tu DNI");
		String dniUsuario = sc.next();
		System.out.println("introduce tu contraseña");
		String contraseyaUsuario = sc.next();
		nuevoUsuario.setNombre(nombreUsario);
		nuevoUsuario.setApellidos(apellidosUsuario);
		nuevoUsuario.setCorreoElectronico(correoUsuario);
		nuevoUsuario.setDni(dniUsuario);
		nuevoUsuario.setContraseya(contraseyaUsuario);
		Inicio.listaUsuario.add(nuevoUsuario);
	}

	public void modificarUsuario() {
		
		System.out.println("Que usuario desea modificar (gmail)");
		String correo = sc.next();
		for (UsuarioDto usuario : Inicio.listaUsuario) {
			if(usuario.getCorreoElectronico().equals(correo)) {
				System.out.println("Que desea modificar:");
				
			}
		}
		
	}

}
