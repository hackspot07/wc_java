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
}