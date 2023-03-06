package chanpter3.B_VariableMethod;
import java.lang.Math;
// 메서드
// 특정 작업울 수행하는 일련의 문장들을 하나로 묶은 것
// 작업을 미리 작성해둔것 
// 메서드에 넣을 값과 반환 값만 알면된다 (Black Box 구조)

// 메서드의 장점
// 1. 높은 재사용성 : 한번 만들어 놓은 메서드를 반복해서 사용가능
// 2. 중복 보드 제거 : 반복적으로 나타나는 문장들을 메서드로 만들어서 사용하면 
//					코드의 중복을 제거할 수 있고 수정이 발생하면 하나의 코드만 수정하면 된다
// 3. 프로그램을 구조화 : 작업 단위로 여러 개의 메서드에 담아 프로그램을 구조화 할 수 있음
//

// parameter가 있는 메서드는 반드시 parameter 범위 등과 같은 검증을 먼저 해줘야함

class HigherMatmatics{
	static final double PIE = 3.14;
	
	// 클래스 변수와 마찬가지로 메서드에 static을 포함하게 되면
	// 클래스 메서드로 사용할 수 있음(클래스로 사용 가능)
	// CJ
		static double getTriangleSize(double underside, double height) {
		if(underside<=0 || height<=0) {
			System.out.println("밑변과 높이는 양수이어야합니다.");
			return 0;
					
		}
		double size = 0.5 *underside * height;
		return size;
		}
	
		static double getCircleSize(double radius) {
		if(radius<=0) {
			System.out.println("반지름은 양수여야합니다.");
			return 0;
		}
		double size = PIE * radius * radius;	
		return size;
		// 지금 빨간줄 끄이는 이유
		// static으로 클래스로 사용이 가능한데 
		// PIE는 지금 현재 인스턴스 변수로 생성되어있다
		// 그렇기에 인스턴스를 생성하지 않고는 PIE를 쓸수 없다는것
		// 즉 위의 인스턴수 변수와 해당되는 변수가 들어가는 메서드를 둘다 인스턴스로 하던가
		// 둘다 스태틱으로 하는것이다
		}
		static double getCirumference(double radius) {
			if(radius<=0) {
				System.out.println("반지름은 양수여야합니다.");
				return 0;
			}
			double circumference = 2 * PIE* radius;	
		return circumference;
			
			
		}
	
}







public class Method1 {

	
	// 메서드의 선언부
	//[접근제어자 기타제어자] 반환타입 메서드명 ([매개변수[,..])
	
	
	public static void main(String[] args) 
	// 메서드의 구현부
	// 실제 프로그램의 절차를 작성하는 부분
	// return 데이터; 로 결과를 반환 시켜줌
	// 반환타입이 void 이면 return;으로 메서드를 종료시킴
 	
	{


	double size = HigherMatmatics.getTriangleSize(3.00, 222222222.0);
	System.out.println(size);
	double circleSize = HigherMatmatics.getCircleSize(7.5);
	System.out.println(circleSize);
	
	System.out.println(HigherMatmatics.getCircleSize(4.2));
	
	
	
	
	}

}
