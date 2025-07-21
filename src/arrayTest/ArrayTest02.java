package arrayTest;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 20 30 40 50 숫자 거꾸로 출력하기
		
		int[] arr= {10, 20, 30, 40, 50};
		
		for(int i = arr.length-1 ;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
