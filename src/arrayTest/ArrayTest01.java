package arrayTest;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 90 80 70 100 85 평균 구하기 (향상된 for문 사용)
		int[] arr= {90, 80, 70, 100, 85};
		
		int sum = 0;
		int avg=0;
		
		
		for(int i : arr) {
			sum = sum+i;
			avg = sum / arr.length;
			
		}
		System.out.println(avg);

	}

}
