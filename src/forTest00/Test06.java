package forTest00;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 더하다가 합이 100 이상이 되면 멈추고, 마지막으로 더한 수와 합을 출력하세요.
		
		
		//다시 이해
		
		int sum = 0;
		int last = 0;
		
		for(int i=1; 1<=100; i++) {
			sum=sum+i;
			if(sum>=100) {
				last =i;
				break;
			}
			
		}
		
		System.out.println(sum);
		System.out.println(last);
		
	}

}
