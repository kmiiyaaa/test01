package classTest;

public class Product {

	
	String name; //상품명
	int price;  // 가격
	int quantity; // 수량
	
	public Product(int price, int quantity) {
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return price * quantity;
	}
	
	
	

}
