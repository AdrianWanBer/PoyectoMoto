package controladores;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dtos.ClubDto;
import dtos.UsuarioDto;

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

	}

}
