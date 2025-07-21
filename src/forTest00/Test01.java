package forTest00;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100 까지 정수 중 3의배수이거나 5의 배수인 수만 출력
		
		for(int i = 1 ; i<=100; i++) {
			if(i%3==0 || i%5==0) {
				System.out.println(i);
			}
			
		}
		
		
		
	}

}
