package bdd;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDD {
	private BDDConnection bddConnection;
	
	public BDD(){
		bddConnection = new BDDConnection();
	}
	
	public ResultSet query(String sql, int[] i){
		try{
			CallableStatement call = bddConnection.getConnection().prepareCall(sql);
			for(int x = 0; x < i.length; x++){
				call.setInt((x+1), i[x]);
			}
			call.execute();
			return call.getResultSet();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
