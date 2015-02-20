import static org.junit.Assert.*;
import org.junit.Test;

public class ArgumentSeperatorTest{
	@Test
	public void isValidOptionsWillReturnTrue(){
		String args[] = {"-l"};
		ArgumentSeperator argObj = new ArgumentSeperator(args);	
		boolean bool = argObj.isValidOption("-l");
		assertEquals(bool,true);
	} 

	@Test
	public void isValidOptionsWillReturnFalse(){
		String args[] = {"-m"};
		ArgumentSeperator argObj = new ArgumentSeperator(args);	
		boolean bool = argObj.isValidOption("-m");
		assertEquals(bool,false);
	}
	 
	@Test
	public void getFilesWillReturnOnetxt(){
		String args[] = {"one.txt","-l"};
		ArgumentSeperator argObj = new ArgumentSeperator(args);	
		String[] files = argObj.getFiles();
		assertEquals("one.txt",files[0]);
	} 

	@Test
	public void getFlagsWillgiveminusW(){
		String args[] = {"one.txt","-w","-s"};
		ArgumentSeperator argObj = new ArgumentSeperator(args);	
		String[] flags = argObj.getFlags();
		assertEquals("-w",flags[0]);
	} 
}