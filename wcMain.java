import java.io.*;

class wcMain{
	public static void main(String args[]){ 
	
		ArgumentSeperator argObj = new ArgumentSeperator(args);
		Operator op = new Operator(argObj.getFiles(),argObj.getFlags());

		if(argObj.getFlags()[0]==null) 
			op.wcWithoutFlag();
		else
			op.wcWithFlags();
	} 
}