package forTest00;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지의 수 중 홀수 개수와 짝수 개수를 출력
		
		int oddCount = 0;
		int evenCount= 0;
		
		for(int i=1 ; i<=100; i++) {
			if(i%2==0) { //짝수
				evenCount++;
			} else { //홀수
				oddCount++;
			}
		}
		
		System.out.println("짝수 : " + evenCount);
		System.out.println("홀수 : " + oddCount);
		
	}

}
