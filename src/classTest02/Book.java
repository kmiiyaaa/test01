package classTest02;

public class Book {
	//1. 책의 이름과 가격을 필드로 가지는 Book 클래스를 만드시오. 
	//단 생성자에서 두 필드를 초기화 하도록 만들고, 책의 이름과 가격을 출력하는 printInfo 메서드를 포함하시오.
	
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("책 이름:" + name);
		System.out.println("가격:" + price);
	}
	

}
