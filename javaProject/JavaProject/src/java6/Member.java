package java6;

public class Member {
	String name;
	String number;
	int money;
	
	Member(){}
	Member(String name,String number, int money){
		this.name=name;
		this.number=number;
		this.money=money;
	}
	public String check() {
		if(this.money>=1000) {
			return "vvip";
		}
		else if(this.money>=500) {
			return "vip";
		}
		else {
			return "";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
