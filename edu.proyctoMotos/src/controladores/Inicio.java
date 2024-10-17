package controladores;

import java.io.IO;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dtos.ClubDto;
import dtos.UsuarioDto;
import sevicios.MenuImplementacion;
import sevicios.MenuInterfaz;
import sevicios.OperativaImplementacion;
import sevicios.OperativaInterfaz;

public class Inicio {

	public static List<ClubDto> listaClub = new ArrayList<ClubDto>();
	public static List<UsuarioDto> listaUsuario = new ArrayList<UsuarioDto>();

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/ProyectoMotos";
		String user = "postgres";
		String password = "1970";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			if (conn != null) {
				System.out.println("Conectado a la base de datos PostgreSQL!");
			} else {
				System.out.println("Fallo al conectar a la base de datos.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		boolean cerraMenu = false;

		while (!cerraMenu) {
			int seleccion = mi.menuPincipal();

			switch (seleccion) {
			case 0:
				cerraMenu = true;
				break;
			case 1:
				int seleccionUsuario = mi.menuUsuario();
				switch (seleccionUsuario) {
				case 0: // Cerrar menu de usuario
					break;
				case 1: // Dar alta usuario
					oi.DarAltaUsuario();
					break;
				case 2: // Modificar valores de usuario
					break;
				default: // Función de default
					System.out.println("Seleccion no valida");
					break;
				}
				break;
			case 2:

				break;
			default:
				System.out.println("Seleccin no valida");
				break;F
			}

		}

	}

}
