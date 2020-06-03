package day0603;
interface InterA{
	public void write();
	public void play();
}
class InterEx{
	InterA ina = new InterA() {
		
		@Override
		public void write() {
			// TODO Auto-generated method stub
			System.out.println("¾²±â");
		}
		
		@Override
		public void play() {
			// TODO Auto-generated method stub
			System.out.println("³î±â");
		}
	};
}
public class AnonymousTest_05 {
	public static void main(String[] args) {
		InterEx in = new InterEx();
		in.ina.play();
		in.ina.write();
	
	}
}
