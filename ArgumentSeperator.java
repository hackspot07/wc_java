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
		int index = 0;
		for(String option:args)
			if(isValidOption(option))
				flags[index++] = option;
		return flags;
	}

	public String[] getFiles(){
		String files[] = new String[args.length];
		int index = 0;
		for(String option:args)
			if(!isValidOption(option))
				files[index++] = option;
		return files;
	}	
}

