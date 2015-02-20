import java.io.*;

class wcMain{
	public static void main(String args[]) throws Exception { 
		ArgumentSeperator argObj = new ArgumentSeperator(args);
		
		Operator op = new Operator(argObj.getFiles(),argObj.getFlags());
		op.operateBasedOnFlag();
	} 
}