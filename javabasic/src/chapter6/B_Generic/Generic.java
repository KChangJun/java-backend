package chapter6.B_Generic;

class GenericClass<D> {
	
	boolean status;
	String message;
	D data; // 외부에서 받은 타입으로 data 타입을 지정하겟다
	static <D> GenericClass<D> getInstance(boolean status, String message, D data){
		GenericClass<D> instance = new GenericClass<>();
		instance.status=status;
		instance.message=message;
		instance.data=data;
		
		return instance;
	}
	
}

public class Generic {

// 제너릭
// 다양한 타입을 다루는 메서드나 클래스에 컴파일 시 타입을 체크하는 기능
// 컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있음
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<Integer> generic1 = new GenericClass<>(); // generic1 은 data 타입을 Integer 로 받는다는 뜻.
		GenericClass<String> generic2 = new GenericClass<>();
		
		
		generic1.data=3;
		generic2.data="streess";
		GenericClass<?> generic3 = GenericClass.getInstance(true,"message","String" );
		System.out.println(generic3.message);
	
	
	
	
	}

}
