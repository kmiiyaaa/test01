package classTest02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1번
		Book b1 = new Book("소나기",15000);
		
		b1.printInfo();
		
		
		//2번
		StringTool st1 = new StringTool();
		
		st1.printLength("안녕하세요");
		
		//3번
		AverageCalculator ac1 = new AverageCalculator();
		ac1.getAverage(new int[]{10,20,30,40,50}); 
		//메서드 호출 시 배열 리터럴을 직접 넣을 때는 new를 써야 함
		
	
		//4번
		Bmi bmi = new Bmi();
		bmi.bmiCalculator(50, 160);
		
		
		//5번
		Rectangle r1 = new Rectangle(2,5);
		r1.recPerimeter();
		
		//6번
		Triangle t1 = new Triangle(1,2,3);
		System.out.println(t1.isValid());
		
		
		}

	

 }

