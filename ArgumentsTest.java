import static org.junit.Assert.*;
import org.junit.Test;

public class ArgumentsTest{
	@Test
	public void isValidOptionsWillReturnTrue(){
		String args[] = {"-l"};
		Arguments argObj = new Arguments(args);	
		boolean bool = argObj.isValidOption("-l");
		assertEquals(bool,true);
	} 
	
	@Test
	public void isValidOptionsWillReturnFalse(){
		String args[] = {"-m"};
		Arguments argObj = new Arguments(args);	
		boolean bool = argObj.isValidOption("-m");
		assertEquals(bool,false);
	} 
}