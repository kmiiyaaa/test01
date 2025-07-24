package classTest02;

public class Bmi {
	
//BMI의 계산식은 BMI = weight / (height²) 이다. 키와 몸무게를 넣으면 BMI를 출력하는 bmiCalulator 메서드를 가지고 있는 
//메서드만 
	
	public void bmiCalculator(double height, double weight) {
		double bmi = weight / (height * height);
		System.out.println(bmi);
	}
	
	

}
