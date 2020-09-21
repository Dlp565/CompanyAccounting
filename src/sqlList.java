import java.util.ArrayList;

public class sqlList {

	private ArrayList<Node> sqlList;
	
	
	
	public sqlList() {
		sqlList = new ArrayList<>();
	}
	
	public void InsertNode(int itemCode, String description, float price, String salesFlag) {
		Node newNode = new Node(itemCode, description, price, salesFlag);
		sqlList.add(newNode);
	}
	
	public ArrayList<Node> getList() {
		return this.sqlList;
	}
	
	
}

