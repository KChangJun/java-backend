package chapter3.E_Inheritance;




// 상속
// 기존 클래스를 재 사용해서 새로운 클래스를 작성하는 것
// 코드의 재사용성을 높이고 코드의 중복을 제거 -> 생산성이 향상, 유지보수성이 향상

// 사용방법:
// class 클래스명 extends 조상클래스{...}

class Human {
	String name;
	int age;
	String telNumber;
	String country;
	
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");		
	}
	
	Human(){}
	
	Human(String name, int age){
		this.name=name;
		this.age=age;
		this.telNumber = "01011112222";
		this.country= "Korea";
		
	}
	
}

// Develop 클래스는 Human의 속성과 기능을 모두 사용 가능
class Developer extends Human{
	 String position;
	 String language;
	 
	 void develope() {
		 System.out.println(super.name + "가" + this.language + "로 " + this.position+ " 개발을 합니다");
	 }  //super는 부모 클래스의 인스턴스 변수, this는 해당 클래스의 인스턴스 변수. 각 클래스마다 같은 변수 이름을 사용할수도 있기 때문에 super this로 정확하게 구분하자
	 Developer(){}
	 Developer(String name, int age, String position, String language){
		 
		 		// super  : 부모  클래스를 지칭
		  		// super() : 부모 클래스의 생성자를 지칭
		 		 super(name, age); //부모 생성자를 그대로 가지고 온다. 위의 경우 이름.나이가 들어간 생성자에 전화번호, 국가를 설정해놧기 때문에
		 		 					// Developer 생성자에도 동일하게 적용된다
		 		 this.position  = position;
		 		 this.language =  language;
		 
	 }
	 
	 
}



public class Inheritance {

	public static void main(String[] args) {
		Developer developer1= new Developer();
		developer1.name = "chang jun";
		developer1.age = 55;
	
		developer1.position = "Back end";
		developer1.language = "Java";
		
		
		developer1.eat("사과");
		developer1.develope();
		Developer developer2 = new Developer("wonJune",33,"Frone end","javascript");
		developer2.eat("바나나");
		developer2.develope();
		System.out.println(developer2.telNumber);
		
		
		
	}

}
