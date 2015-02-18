import java.io.*;

public class ReadContent{
	private String fileName;

	ReadContent(String fileName){
		this.fileName = fileName;
	}

	public String readContent()throws Exception{
		FileReader fr = new FileReader(fileName); 
		BufferedReader br = new BufferedReader(fr); 
		String str="",lineStr;
		while((lineStr = br.readLine()) != null)
			str = str.concat(lineStr) + "\r\n";
		fr.close();
		return str;
	}
}