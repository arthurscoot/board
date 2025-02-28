package com.arthurmoreira.board_migration;

import java.sql.Connection;
import java.sql.SQLException;

import com.arthurmoreira.board_migration.persistence.config.ConnectionConfig;
import com.arthurmoreira.board_migration.ui.MainMenu;

public class Main {

	public static void main(String[] args) {
		
		   try (Connection connection = ConnectionConfig.getConnection()) {
	            System.out.println("Conexão estabelecida com sucesso!");
	            new MainMenu().execute();

	        } catch (SQLException e) {
	            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
	            e.printStackTrace();
	        }
		
	}

}
