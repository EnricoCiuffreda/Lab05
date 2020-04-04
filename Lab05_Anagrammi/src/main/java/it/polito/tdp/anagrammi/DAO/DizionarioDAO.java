package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DizionarioDAO {
	
	
	public boolean isCorretto(String nome) {

		final String sql = "SELECT * FROM parola WHERE nome=?";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,nome);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				conn.close();
				return true;
			}
				else {
					conn.close();
					return false;
				}
					
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}

}
