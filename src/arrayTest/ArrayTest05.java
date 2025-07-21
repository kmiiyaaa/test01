package arrayTest;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5 다음 숫자들을 모두 곱한 값을 배열을 사용하여 출력
		
		int[] arr= {1,2,3,4,5};
		int num = 1; // 수를 곱할것이라 초기화값 1로지정
		
		for(int i=0 ; i<arr.length ; i++) {
			num = num * arr[i];
		}
		
		System.out.println(num); //모든 원소 곱
		
	}
	
	

}
