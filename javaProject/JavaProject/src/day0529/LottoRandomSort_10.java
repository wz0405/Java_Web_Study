package day0529;
import java.util.*;
public class LottoRandomSort_10 {
	public static void main(String[] args) {
		int lotto[]=new int[6];
		//1번~45번 난수발생
		for(int a=0;a<lotto.length;a++) {
		
			int b=(int)(Math.random()*45)+1;
			lotto[a]=b;
			for(int c=0;c<a;c++) {
				if(lotto[c]==lotto[a]) {
					a--;
					break;
	
				}
			}
		}
		for (int j=0;j<lotto.length;j++) {
			for(int i=j+1;i<lotto.length;i++) {
				if(lotto[j]>lotto[i]) {
					int temp=lotto[j];
					lotto[j]=lotto[i];
					lotto[i]=temp;
				}
			}
		}
		for(int a:lotto) {
			System.out.println(a);
		}
	}
}
