import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		ArgumentSeperator argObj = new ArgumentSeperator(args);
	

		ContentReader readObj = new ContentReader(args[0]);
		WC wcObject = new WC(readObj.readContent());
		int result[] = wcObject.l_w_c_Count();

		System.out.println(" "+result[0]+"	"+result[1]+"	"+result[2]+ " "+args[0]);
	} 
}