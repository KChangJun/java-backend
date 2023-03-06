package chanpter3.B_VariableMethod;

class Triangle {
	double underside;
	double height;
	double diagonal;
	
	
	double area;
	double circumference;
}

class TriangleMath{
	
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle(); // =>힙 영역에 생성
		triangle.underside = underside;
		triangle.height = height;
//		triangle.diagonal = Math.sqrt(Math.pow(underside, 2)+Math.pow(height, 2)) ;
		setDiagonal(triangle);
		setArea(triangle);
		setcircumferece(triangle);
		return triangle;
		
	}
	
	static void setArea(Triangle triangle) {// 참조변수 - 복사해서 사용. 원본은 그대로 하지만 참조변수는 주소를 저장하는것이기 때문에
											// 메서드 내에서 내용을 바꾸게 되면 호출부의 주소 또한 바뀌게 된다.
		double area = 0.5 * triangle.underside * triangle.height;
		triangle.area = area;
				
	}
	
	static void setDiagonal(Triangle triangle) {
		double squareDiagonal = Math.pow(triangle.underside,2)+Math.pow(triangle.height,2);
		double diagonal1 = Math.sqrt(squareDiagonal);
		triangle.diagonal=diagonal1;
			
	}
		
	static void setcircumferece(Triangle triangle) {
		triangle.circumference=triangle.underside+triangle.height+triangle.diagonal;
			
	}

}



public class Method2 {

	public static void main(String[] args) {

	
		Triangle triangle1 = new Triangle();
		triangle1.underside=3;
		triangle1.height=4;
		triangle1.diagonal=5;
		
		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);
		Triangle triangle2 = TriangleMath.createTriangle(5, 5);
		System.out.println(triangle2.area);
		
		triangle2 =triangle1;
		System.out.println(triangle2.height);
		
		triangle2.height=7;
		System.out.println(triangle1.height);
		
	}
	

}
