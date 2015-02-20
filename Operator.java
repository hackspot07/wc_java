public class Operator{

	private String[] files;
	private String[] flags;

	public Operator(String[] files,String[] flags){
		this.files = files;
		this.flags = flags;
	}

	public void operateBasedOnFlag(){
		int result[] = new int[3];
		for(String file:files){ 
			ContentReader readObj = new ContentReader(file);
			WC wcObject = new WC(readObj.readContent());
			result = wcObject.l_w_c_Count();

			System.out.println(" "+result[0]+"	"+result[1]+"	"+result[2]+ " "+file);
		}
	}
}