package chapter6.A_ColletionClass;

import java.util.*;

// Collection Framework
// 배열형태의 데이터를 보다 편하게 사용 할 수 있도록 해주는 클래스의 집합
// 


// set list map
// set 집합 중복 허용 x 순서 없음 tree는 순서있음
 
// list 순서있음 중복허용 

//map 순서없음 중복 허용 key 값은 중복안됨.

public class ColletionClass {

	public static void main(String[] args) {
		
		// Set 클래스
		// 집합 
		// 집합 - 중복을 허용하지 않고 순서가 없는 형태
		
		
		// HashSet<E> 중복을 허용하지 않고 순서가 없는 형태
		// TreeSet<E>
//		Set<Integer> integerSet = new Set<Integer>();   // Set은 인터페이스 이기 때문에 인스턴스가 생성되지 않고, 해당 인터페이스로 만든 class로 인스턴스를 만들어야한다
		Set<Integer> integerSet = new HashSet<Integer>();  // 그렇기 때문에 Set이 아니라 HashSet, TreeSet을 이용한다.
		integerSet.add(4);
		integerSet.add(2);
		integerSet.add(1);
		integerSet.add(68);
		integerSet.add(6);
		integerSet.add(22);
		integerSet.add(8);
		integerSet.add(55);
		integerSet.add(51);
		integerSet.add(52);
		integerSet.add(81);
		integerSet.add(54);
		integerSet.add(94);
		integerSet.add(57);
		// 순서가 없어서 index로 접근 불가
		
		Iterator<Integer> iterator = integerSet.iterator();
		while(iterator.hasNext()) {
			
		System.out.println(iterator.next());
			
		}
		
		
		System.out.println("---------------------------------------");
		//TreeSet<E>
		//중복을 허용하지 않고 순서가 없는 형태 +정렬
		
		Set<Integer> integerTreeSet = new TreeSet<Integer>();  
		integerTreeSet.add(4);
		integerTreeSet.add(55);
		integerTreeSet.add(10);
		integerTreeSet.add(4);
		integerTreeSet.add(12);
		integerTreeSet.add(72);
		integerTreeSet.add(26);
		integerTreeSet.add(57);
		integerTreeSet.add(4);
		integerTreeSet.add(39);
		integerTreeSet.add(42);

		// 순서가 없어서 index로 접근 불가
		
		for(Integer item:integerTreeSet){
			
		System.out.println(item);
		
		
		}
		System.out.println("---------------------------------------");
	
		// List
		// 데이터를 일렬로 나열한 구조
		// 순서가 존재하고 중복이 허용됨(배열)
		
		// ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'
		List<String> stringList= new ArrayList<String>();
		stringList.add("apple");
		stringList.add(0,"banana");	// 먼저 있던 0번 index apple는 후순위로 밀려난다	
		stringList.set(1, "melon"); // set -> 변경 1번자리 apple을 melon으로 변경
		//stringList.remove(1); //remove 특정 index를 삭제 하고 반환한다. 이 경우에는 melon이 반환됨
		System.out.println(stringList.remove(1));// melon이 반환된것을 볼수있음
		
		
		System.out.println(stringList.toString());
		
		for (int index=0; index < stringList.size(); index++) {
			
			System.out.println(stringList.get(index)); // 배열은 배열명.[index]로 요소를 반환 받지만 List는 .get을 이용해서 받는다
		}
		System.out.println("---------------------------------------");
		
		// LinkedList<E> : 순서가 존재하고 중복이 허용된 ' 배열 ' + 각 요소가 이전, 이후 요소의 주소를 같이 가지고 있음. 검색속도가 빠르다.
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long startTime = System.currentTimeMillis();
		for(int integer = 0; integer<100_000; integer++) {
			arrayList.add(0,integer);	
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Array List 작업 시간");
		System.out.println(endTime-startTime);
		
	
		
		startTime = System.currentTimeMillis();
		for(int integer = 0; integer<100_000; integer++) {
			linkedList.add(0,integer);	
		}
		endTime=System.currentTimeMillis();
		System.out.println("Linked List 작업 시간");
		System.out.println(endTime-startTime);
		
		
		
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		// Map
		// key 와 value가 하나의 쌍으로 저장되는 구조
		// 순서가 존재하지 않음, 단 key를 이용해서 특정한 value를 가져올 수 있음
		
		// HashMap<E,E> key 와 value 타입 두개를 입력한다.
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("key", "value"); //Set과 LIst에서는 add를 썻지만 Map 에서는 put을 사용한다
		hashMap.put("apple", "사과");
		
		
		System.out.println(hashMap.get("key")); // 반환 받을때에는 .get 사용
		
		
		// Lotto 응용
		Set<Integer> lottos = new TreeSet<Integer>();
		while(lottos.size()<6) {
			Random random= new Random();
			int randomNumber = random.nextInt(45)+1;
			lottos.add(randomNumber);	
		}
		System.out.println(lottos.toString());
		
		
		
		
	}

}
