import java.util.Arrays;

public class ArgumentSeperator{
	private String[] args;

	public ArgumentSeperator(String[] args){
		this.args = args;
	}

	public boolean isValidOption(String option){
		String options = "-l   -w    -c";
		return (options.indexOf(option)>=0) ? true : false;
	}

	public String[] getFlags(){
		String flags[] = new String[args.length];
		for(int i=0;i<args.length;i++)
			if(isValidOption(args[i]))
				flags[flags.length-1] = args[i];
		return flags;
	}

	public String[] getFiles(){
		String files[] = new String[args.length];
		for(int i=0;i<args.length;i++)
			if(!isValidOption(args[i]))
				files[files.length-1] = args[i];
		return files;
	}	
}

