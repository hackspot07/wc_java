import static org.junit.Assert.*;
import org.junit.Test;

public class WCTest{
	String content = "hello, this is a good day.\r\nWhat do you think?\r\n ";
	@Test
	public void wcGiveCharacterCount48(){
		WC WCObject =  new WC(content);
		int charCount = WCObject.charCount();
		assertEquals(charCount,49);
	}

	@Test
	public void WCGiveLineCount2(){
		WC WCObject =  new WC(content);
		int lines = WCObject.lineCount();
		assertEquals(lines,2);
	}

	@Test
	public void WCGiveWordCount10(){
		WC WCObject =  new WC(content);
		int words = WCObject.wordCount();
		assertEquals(words,10);
	}

}