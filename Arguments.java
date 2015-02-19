import java.util.Arrays;

public class Arguments{
	private String[] files = new String[5];
	private String[] flags = new String[5];
	private String[] args;

	public Arguments(String[] args){
		this.args = args;
		this.flags = getFlags();
		this.files = getFiles();
	}

	public boolean isValidOption(String option){
		String options = "-l   -w    -c";
		return (options.indexOf(option)>=0) ? true : false;
	}

	public String[] getFlags(){
		for(int i=0;i<args.length;i++)
			if(isValidOption(args[i]))
				flags[flags.length-1] = args[i];
		return flags;
	}

	public String[] getFiles(){
		for(int i=0;i<args.length;i++)
			if(!isValidOption(args[i]))
				files[files.length-1] = args[i];
		return files;
	}	
}

