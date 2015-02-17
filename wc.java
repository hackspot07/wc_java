public class WC{
	private String str;
	private int l,w,c;
	public WC(String content){
		str = content;
	} 

	public int charCount(){
		c = str.length();
		return c;
	}
	
	public int lineCount(){
		String[] counter = str.split("\r\n");
		int count = counter.length-1;
		return count;
	}
}