package chapter3.F_Overriding;

import java.util.*;

// 오버 라이딩 
// 조상 클래스로 부터 상속받은 메서드의 내용을 변경하는 것
// 상속 받은 메서드를 자손 클래스에 맞게 변경 시키고자 할 때 오버라이딩을 사용
//
class Human{
	String name;
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다");
	}
}

class Developer extends Human{
	// Overload
	void eat() {
		System.out.println(super.name + "가 식사를 합니다.");
	}
	
	// Overriding
	@Override
	void eat(String food) {
		System.out.println(super.name + "가 " + food + "를 반만 먹습니다");
	}
	
}
	

public class Overriding {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 

			Developer developer = new Developer();
			developer.name = "Changjun";
			developer.eat("복숭아");
			Human human = new Human();
			human.name="원준";
			human.eat("키위");
			
	}

}

