package Interface;

public class CountryTraffic implements CentralTraffic {

	public static void main(String[] args) {
		
		
		CentralTraffic ct=new CountryTraffic();
		ct.redStop();
		ct.greenGo();
		ct.walkOnZebra();
		
		
		
	}
	
	@Override
	public void redStop() {
		
		System.out.println("Please stop on red light");
		
	}

	@Override
	public void greenGo() {
		
		System.out.println("Please Go on Green light");
		
	}

	@Override
	public void walkOnZebra() {
		
		System.out.println("Please Walk on Zebra light");
	}
	
	

}
