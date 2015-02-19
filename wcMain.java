import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		ContentReader readObj = new ContentReader(args[0]);
		String content = readObj.readContent();
		int result[] = WC.l_w_c_Count(content);
		
		System.out.println(result[0]+"  "+result[1]+"  "+result[2]+ " "+args[0]);
	} 
}