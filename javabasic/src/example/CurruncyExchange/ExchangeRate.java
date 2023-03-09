package example.CurruncyExchange;

// 화폐 : 화폐 = 환율

public class ExchangeRate {
	// 넣을 화폐 (ex. 원화, 달러, 엔화, ..)
	private String exchangingCurrency;
	// 바꿀 화폐	(ex. 원화, 달러, 엔화, ..)
	private String exchangedCurrency;
	// 환율 (원 ㅡ 엔, 원 ㅡ 달러, 원 ㅡ 환....)
	private double exchangeRate;
	public String getExchangingCurrency() {
		return exchangingCurrency;
	}
	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}
	public String getExchangedCurrency() {
		return exchangedCurrency;
	}
	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public ExchangeRate(String exchangingCurrency, String exchangedCurrency, double exchangeRate) {
		super();
		this.exchangingCurrency = exchangingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}
//	@Override
//	public String toString() {
//		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + ", exchangedCurrency=" + exchangedCurrency
//				+ ", exchangeRate=" + exchangeRate + "]";
//	}
	
	
//	public ExchangeRate(String exchaningCurrency, String exchangedCurrency, double exchangeRate) {
//		this.exchangedCurrency = exchangedCurrency;
//		this.exchangingCurrency = exchaningCurrency;
//		this.exchangeRate = exchangeRate;
//		
//	}
//	
//	// Get 메서드
//	// "인스턴스" 가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드 <- 객체가 아니라 인스턴스가 가지고 있는 변수를 가지고 오는것 
//	
//
//	public String getExchangeingCurrency() {
//		return this.exchangingCurrency;
//	}
//	public String getExchangedCurrency() {
//		return this.exchangedCurrency;
//	}
//	public double getExchangeRate() {
//		return this.exchangeRate;
//	}
//	// set 메서드
//	// "인스턴스" 가 가지고 있는 특정 변수를 변경 하는것. 반환하지는 않는 메서드
//	
//	public void setExchagingCurrency(String exchangingCurrency ) {
//		this.exchangingCurrency=exchangingCurrency;		
//	}
//	public void setExchagedCurrency(String exchangedCurrency ) {
//		this.exchangedCurrency=exchangedCurrency;		
//	}
//	public void setExchagingeRate(double exchangeRate) {
//		this.exchangeRate=exchangeRate;		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	//get set <- 
}

