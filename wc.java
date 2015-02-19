public class WC{
	private String str;
		
	public WC(String str){
		this.str = str;
	} 

	public int charCount(){
		return str.length();
	}
	
	public int lineCount(){
		int count = 0;
		for(int i=0; i< str.length(); i++)
			if(str.substring(i,i+1).equals("\n"))
				count++;
		return count;
	}

	public int wordCount(){
		String[] strArray =  str.split("\\s+");
		int count = strArray.length;
		for(int i=0; i< strArray.length; i++)
			if(strArray[i].equals(""))
				count--;
		return count;
	}

	public static int[] l_w_c_Count(String str){
		WC wcObject = new WC(str);
		int result[] = {wcObject.lineCount(),wcObject.wordCount(),wcObject.charCount()};
		return result;
	}
}


