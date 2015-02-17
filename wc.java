public class WC{
	private String str;
	private int l,w,c;
	public WC(String content){
		str = content;
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
		return str.split("\\s+").length;
	}
}