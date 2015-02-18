import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		ReadContent readObj = new ReadContent(args[0]);
		String content = readObj.readContent();
		int result[] = WC.l_w_c_Count(content);
		
		System.out.println(result[0]+"  "+result[1]+"  "+result[2]);
	} 
}