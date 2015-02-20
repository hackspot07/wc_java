public class Operator{

	private String[] files;
	private String[] flags;

	public Operator(String[] files,String[] flags){
		this.files = files;
		this.flags = flags;
	}

	public void wcWithoutFlag(){
		for(int i=0; i< files.length; i++){ 
			int result[] = new int[3];
			ContentReader readObj = new ContentReader(files[i]);
			WC wcObject = new WC(readObj.readContent());
			result = wcObject.l_w_c_Count();

			System.out.println(" "+result[0]+"	"+result[1]+"	"+result[2]+ " "+files[i]);
		}
	}

	public void wcWithFlags(){
		for(int j=0; files[j]!=null; j++){
			int result[]  = new int[3];
			ContentReader readObj = new ContentReader(files[j]);
			WC wcObject = new WC(readObj.readContent());
			for(int i=0;flags[i]!=null;i++){
				result[i] = checkFlag(readObj.readContent(),flags[i]);
			}
		System.out.println(" "+result[0]+"	"+result[1]+"	"+result[2]+ " "+files[j]);
		}
	}

	public int checkFlag(String content,String flag){
		WC w = new WC(content);
		switch(flag){
			case "-l": return w.lineCount();
			case "-w": return w.wordCount();
			case "-c": return w.charCount();
			default : return -1;
		}
	} 
}