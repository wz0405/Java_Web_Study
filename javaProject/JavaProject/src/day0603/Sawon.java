package day0603;

public class Sawon {
	Sawon(){}
	private String sawonName;
	private int giboPay, timeSu, familysu;
	
	//생성자
	public Sawon(String sawonName, int giboPay, int timeSu, int familysu) {
		this.sawonName = sawonName;
		this.giboPay = giboPay;
		this.timeSu = timeSu;
		this.familysu = familysu;
		
	}
	//가족수당...3인미만은 5만원, 이상은 7만원
	public int getFamSu() {
		if(familysu<3) {
			return 50000;
		}
		else {
			return 70000;
		}
	}
	
	//초과수당은 초과 시간 *20000원 단,5시간이상은 무조건 100000원
	public int getTimeSu() {
		if(timeSu>=5) {
			return 100000;
		}
		else {
			return timeSu*20000;
		}
	}
	public int getTotalPay() {
		return giboPay+getFamSu()+getTimeSu();
	}
	public void getSawon() {
		System.out.println(sawonName+"\t"+giboPay+"\t"+getFamSu()+"\t"+getTimeSu()+"\t"+getTotalPay());
	}
}
