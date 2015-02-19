import java.io.*;


public class ContentReader{
	private String fileName;

	ContentReader(String fileName){
		this.fileName = fileName;
	}
	public String readContent(){
		String str="";
		try{ 
			File file = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(file));

			int length = (int)file.length(); 
	        char[] cbuf = new char[length];
         	br.read(cbuf, 0, length);
         	str = String.valueOf(cbuf);
		}
		catch(Exception e){
			System.out.println("WC :"+ fileName+":No such File Or directory");
		}
		return str;
	}
}