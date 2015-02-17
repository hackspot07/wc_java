import static org.junit.Assert.*;
import org.junit.Test;

public class WCTest{
	String content1 = "hello, this is a good day.\r\nWhat do you think?\r\n";
	String content2 = "\r\nthis			\nthis\n 	leo";
	@Test
	public void wcGiveCharacterCount48(){
		WC WCObject =  new WC(content1);
		int charCount = WCObject.charCount();
		assertEquals(charCount,48);
	}
	@Test
	public void wcGiveCharacterCount20(){
		WC WCObject =  new WC(content2);
		int charCount = WCObject.charCount();
		assertEquals(charCount,20);
	}

	@Test
	public void WCGiveLineCount2(){
		WC WCObject =  new WC(content1);
		int lines = WCObject.lineCount();
		assertEquals(lines,2);
	}

	@Test
	public void WCGiveLineCount3(){
		WC WCObject =  new WC(content2);
		int lines = WCObject.lineCount();
		assertEquals(lines,3);
	}

	@Test
	public void WCGiveWordCount10(){
		WC WCObject =  new WC(content1);
		int words = WCObject.wordCount();
		assertEquals(words,10);
	}

	@Test
	public void WCGiveWordCount3(){
		WC WCObject =  new WC(content2);
		int words = WCObject.wordCount();
		assertEquals(words,3);
	}
}