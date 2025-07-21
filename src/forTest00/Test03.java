package forTest00;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 수 중 홀수의 합을 출력
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			
			if (i%2==1) {
				sum = sum+i;
			}
			
		}
		
		System.out.println(sum);
	}

}
