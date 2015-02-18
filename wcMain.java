import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		FileReader fr = new FileReader("D:/javaWorkspace/path.JSON"); 
		BufferedReader br = new BufferedReader(fr); 
		String str=""; 
		String s;
		while((s = br.readLine()) != null) { 
			str = str.concat(s)+"\n";
		} 
	fr.close();
	WC wcObject = new WC(str);
	int l = wcObject.lineCount();
	int w = wcObject.wordCount();
	int c = wcObject.charCount();
	System.out.println(l+"  "+w+"  "+c);
	} 
}