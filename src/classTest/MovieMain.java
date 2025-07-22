package classTest;

public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Movie m1 = new Movie("영화이름","영화장르",150);
		
		System.out.println("긴 영화인가요?" + m1.isLongMovie());
	
	}

}
//main에서 결과 출력

	//[실행 예시]

	//긴 영화인가요? true
