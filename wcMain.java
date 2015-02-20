import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		ArgumentSeperator argObj = new ArgumentSeperator(args);

		Operator op = new Operator(argObj.getFiles(),argObj.getFlags());
		String[] flags = argObj.getFlags();

		if(flags[0]==null){ 
			op.wcWithoutFlag();
		}
		else{ 
			op.wcWithFlags();
		}
	} 
}