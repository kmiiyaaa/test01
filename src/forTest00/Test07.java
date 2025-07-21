package forTest00;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 숫자를 홀수는 더하고 짝수는 빼서 결과를 출력하세요
		
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			if( i%2==0) {
				sum=sum-i;
			}else {
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
