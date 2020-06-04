package day0604;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOReader_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath="C:\\java_0526\\javaProject\\ch01\\src\\Hello.java";
		BufferedReader br=null;
		FileReader fr =null;
		
		try {
			fr=new FileReader(filePath);
			System.out.println("파일을 찾음");
			
			br=new BufferedReader(fr);
			while(true) {
				//파일에서 한줄씩 읽는다
				String line=br.readLine();
				
				//문서의 끝으로가면 null값 반환
				if(line==null)
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
