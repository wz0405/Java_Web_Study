package day0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//키보드로부터 문자열을 읽어보는 예제
public class FileIOTest_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =null;
		InputStreamReader ir = null;
		
		ir=new InputStreamReader(System.in);
		br=new BufferedReader(ir);
		
		String str="";
		
		System.out.println("문자열을 입력하세요");
		try {
			str=br.readLine();//한줄씩 읽어온다
			System.out.println("입력한문자열 => "+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				ir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
