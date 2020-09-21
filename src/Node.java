

public class Node{
		private int itemCode;
		private String description;
		private float price;
		private String salesFlag;
		
		public Node(int itemCode, String description, float price, String salesFlag) {
			this.itemCode = itemCode;
			this.description = description;
			this.price = price;
			this.salesFlag = salesFlag;
		}
		
		public int getItemCode() {
			return this.itemCode;
		}
		
		public String getDescription() {
			return this.description;
		}
		
		public float getPrice() {
			return this.price;
		}
		
		public String getsalesFlag() {
			return this.salesFlag;
		}
	}