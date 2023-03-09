package example.CurruncyExchange;

import java.util.Scanner;

// 환전기 어플리케이션
// Input : 금액, 환전 할 화폐 종류, 환전 받을 화폐 종류
// Output : 금액, 바뀐 화폐 
// 필요한 것 : 환률


// 클래스 배열 선언과 동시에 초기 화 할때에는 { 안에 new 클래스명(참조변수), 를 반복한다}
public class CurruncyExchange {
	private static ExchangeRate[] exchangeRates = {
			//원화 ㅡ 달러
			new ExchangeRate("KRW","USD",1/1319.2),
			
			//운화 ㅡ 엔
			new ExchangeRate("KRW","JPY",100/960.2),
			
			//달러 ㅡ 원화
			new ExchangeRate("USD","KRW",1318.8/1),
			
			//달러 ㅡ 엔
			new ExchangeRate("USD","JPY",137.3/1),
			
			//엔 ㅡ 원화
			new ExchangeRate("JPY","KRW",960.79/100),
			
			//엔 ㅡ 달러
			new ExchangeRate("JPY","USD",1/137.3)
	
	};
	static String[] currencyType = new String[]{"KRW", "USD","JPY"};
	
	
	

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount = 0;
		try {
			System.out.println("넣을 화폐 종류를 적어주세요 : KRW, USD, JPY");
			exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 종류를 적어주세요 : KRW, USD, JPY");
			exchangedCurrency = scanner.nextLine();
			System.out.println("금액을 적어주세요:");
			amount = scanner.nextInt();
			
		}catch(Exception exception) {
			exception.printStackTrace();
			System.out.println("입력값의 타입이 맞지 않습니다.");
			return;
		}
		System.out.println(exchangingCurrency+ " " + exchangedCurrency + " " + amount);
		
		// 입력 검증
		// 모두 입력 했는지
		if(exchangingCurrency.isBlank() || exchangedCurrency.isBlank() ) {
			System.out.println("모두 입력해주세요");
			return;
		}
		// 넣은 화폐랑 받은 화폐랑 종류가 동일 할떄
		if(exchangedCurrency.equals(exchangingCurrency)) {
			System.out.println("화폐가 동일합니다. 환전할 다른 화폐를 선택해주세요");
			return;
			
		}
		
		// 유효한 금액이 아닐때 (금액이 양수가 아닐때)
		if(amount<=0) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
			
		}
		// 관리 하고 있는 화폐 단위가 아닐 때
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		
		
		for(String currencyCheck :currencyType) {
			if (exchangingCurrency.equals(currencyCheck)) {
				hasExchanging = true;
			}
			
			if (exchangedCurrency.equals(currencyCheck)) {
				hasExchanged = true;
			}
			
			//피라미드 구조를 해결할때 if for안에 또  if for을 넣는것이아니라
			//변수를 하나더 만들어서 true false 값을 대입시켜
			//새로운 if 문으로 구조
			
		}
		if(!hasExchanged||!hasExchanging) {
			System.out.println("유효하지 않은 화폐입니다");
			return;
		}
//			
//		
//		}
//		for(String currencyCheck01 :currencyType) {
//			if(exchangingCurrency.equals(currencyCheck01)){
//				for(String currencyCheck02 :currencyType) {
//					if(exchangedCurrency.equals(currencyCheck02 )){
//						
//						
//						
//						
//					} 
//					
//					
//				}
//				
//				
//			}
//			
//		
//		}
		
		
		
		
		double resultAmount = amount;
		
		for(ExchangeRate exchangeRate:exchangeRates) {
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency()) && 
					exchangedCurrency.equals(exchangeRate.getExchangedCurrency()); 
			if (isSame) {
				resultAmount *=exchangeRate.getExchangeRate();
				break;
			}
			
			
			
		}
		//정상 출력
		
		System.out.println(exchangedCurrency+ "로" + resultAmount+"만큼 환전 되었습니다.");
		
		
		
		
		
	}

}



