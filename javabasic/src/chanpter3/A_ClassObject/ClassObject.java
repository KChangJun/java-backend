package chanpter3.A_ClassObject;


// class
// 객체를 정의해 놓은 것
// 객체를 생성하는 기반
// 객체를 정의하는 틀 또는 설계도

// 클래스는 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메서드로 구성됨
// 필드 : 클래스에 포함된 변수 혹은 상수
// 메서드 : 어떠한 특정 작업을 수행하기 위한 명령문의 집합

// object
// 실제로 존재하는 모든 것
// 클래스로 생성된 실체

// 클래스로 생성된 각각의 개체는 독립적으로 존재함
// 같은 클래스로 생성된 객체라 하더라도 각각이 가지고 있는 '속성 값' 은 다를 수 있다.(보통 다르다)

// 클래스 선언방법
// class 클래스명 {속성1;속성2;..... 기능1{}기능2{}.....}
// 속성 : 변수, 특성, 필드, 상태
// 기능 : 메서드, 함수, 행위

class SmartPhone{
	
	//기종
	//색상
	//메모리
	//전화ㅓㄴ호
	//전원
	String modelName;
	String color;
	int memory;
	String telNumber;
	boolean power;
	
	
	
	// 기능과 관련된건 함수, 메서드 사용
	
	//전화 걸기
	//영상시청
	//메세지
	//전원키고 끄기
	
	void call(String toTelNumber) {
		System.out.println(toTelNumber + " 로 전화를 겁니다");
	}
	
	void showVidio() {
		System.out.println("영상을 시청합니다");
	}
	void sendMessage(String message, String toTelNumber) {
		System.out.println(toTelNumber+"로 "+message + "를 보냅니다");
	}
	
	void setPower() {
		power =!power;
		
	}
	
	
}

public class ClassObject {

	public static void main(String[] args) {
		
		// 인스턴스
		// 특정 클래스로 생서어된 객체를 '인스턴스'라 함
		// 클래스로 객체를 생성하는 행위를 '인스턴스화' 라고 함
		
		// 인스턴스 선언 방법
		// 클래스 참조변수명(인스턴스명)
		//
		
		//클래스 = 구조체 + 메서드
		// 구조체 각기 다른 데이터 타입을 가진 모음. 배열은 모두 동일한 타입이지만 클래스틑 다른 타입도 포함힌다.
		SmartPhone iPhone14; //<= 공간을 만든것
		
		// 인스턴스 생성 방법
		// 참조변수명 = new 클래스명(); 참조변수 = 주소값을 가진 것 
		iPhone14 = new SmartPhone(); // <= 실제로 만든것 독립적인 인스턴스 생성
		SmartPhone iPhone14Pro = new SmartPhone();
		
		
	
		System.out.println(iPhone14);
		System.out.println(iPhone14Pro);
		// 인스턴스의 속성 접근 및 기능 사용
		
		// 인스턴스의 속성 접근 및 기능 사용
		// 속성 접근 : 참조변수, 멤버 변수;
		// 기능 사용 : 참조변수, 메서드([매개변수[1,2,3,4,5....]])
		iPhone14.modelName="IPHONE";
		iPhone14.color="Black";
		iPhone14.memory=512;
		iPhone14.telNumber="010-7865-7625";
		iPhone14.power= false;
		
		System.out.println(iPhone14.modelName);
		System.out.println(iPhone14.telNumber);
		
		//초기화 되지 않은 변수들은 기본값을 가지게 되는데 참조형 변수들은 null, boolean은 false. int는 0 등이다.
		//참조형 변수는 주소를 저장해야하는데 null은 그 주소를 저장하지 않았음을 뜻한다.
		System.out.println(iPhone14Pro.memory);
		System.out.println(iPhone14Pro.modelName);
		System.out.println(iPhone14Pro.power);
		
		iPhone14.call("01022222222");
		iPhone14.showVidio();
		System.out.println(iPhone14.power);
		iPhone14.setPower();
		System.out.println(iPhone14.power);

		
		iPhone14Pro = iPhone14;
		iPhone14Pro.telNumber="010999999999"; // pro의 보고 있는것을 0109999999로 바꿧기 때문에 
		System.out.println(iPhone14.telNumber); // 같은 값을 보도록 설정한 iPhone14또한 01099999999 값이 나온다
		
		// 객체 배열
		// 클래스명[] 객체배열명 = new 클래스명[길이]
		SmartPhone[] smartPhoneList = new SmartPhone[3];
		
		smartPhoneList[0] = iPhone14;
		smartPhoneList[1] = iPhone14Pro;
		smartPhoneList[2] = new SmartPhone();
		
		//SmartPhone smartPhone = new SmartPhone(); 처음에 전부 같은 주소를 생성함
		
	
		for (int index=0; index<smartPhoneList.length; index++) {
			SmartPhone smartPhone = new SmartPhone();// for문 할때마다 주소 객체를 새로 생성함
			smartPhone.telNumber = "010-1111-111" + index;
			smartPhoneList[index] = smartPhone;
			
		}
		for (SmartPhone phone: smartPhoneList)
			System.out.println(phone.telNumber);
		
		
		
	}



}
