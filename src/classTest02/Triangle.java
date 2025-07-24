package classTest02;

public class Triangle {
// 세변의 길이를 입력 받아 삼각형인지 아닌지 판별할 수 있는 Triangle 클래스를 만드시오. 
//boolean isValid 메서드는 세변으로 삼각형인지 여부를 판별하는 메서드로 두 변 합 > 나머지 변 의 조건을 만족하면 true 로 출력하는 메서드
//세변의 길이를 입력받아 삼각형인지 아닌지 판별할 수 있는 클래스  / 생성자로 만들기 / BOOLEAN타입
	
int a;
int b;
int c;

 public Triangle(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
}

 public boolean isValid() {
	return (a+b>c && b+c>a && a+c>b);  
}

	
	
}
