import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {

	java.sql.Connection con;
	Statement stmt;
	
	public DBConnector() {
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			con= DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/company","root","Dlp#1194Cbrg");  
			
		} catch(Exception e) { 
			System.out.println(e);
		}
			
	}
	
	public ResultSet doStatement(String statement) {
		
		try {
			stmt = con.createStatement();
			return stmt.executeQuery(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public int doEdit(String statement) {
		
		try {
			stmt = con.createStatement();
			return stmt.executeUpdate(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public int insertData(String table, int itemCode, String description, float price, String salesFlag) {
		return doEdit("INSERT INTO "+table+" VALUES(" +itemCode +",\'" +description +"\'," +price +",\'" 
				+salesFlag +"\');");
	}
	
	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public sqlList getAllData(String table) {
		ResultSet rs = this.doStatement("Select * From " +table);
		sqlList currList = new sqlList();
		try {
			while(rs.next()) {
				currList.InsertNode(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return currList;
	}
	
	public Node getOneRow(String table, int itemCode) throws SQLException {
		ResultSet rs = this.doStatement("Select * From " +table +"Where item_code =" +itemCode);
		String description = "";
		Float price = 0.0f;
		String salesFlag = "";
		while(rs.next()) {
			description = rs.getString(2);
			price = rs.getFloat(3);
			salesFlag = rs.getString(4);
		}
		
		return new Node(itemCode, description, price, salesFlag);
	}
	
	
}
	
	
	

