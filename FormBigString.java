package makebigstring;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FormBigString {
	
	public String makeBigString(String word,String sep,int count) {
		String newWord="";
		for(int i =0;i<count;i++) {
			if(i<count-1) {
				newWord+= word + sep;
				
			}
			else {
				newWord+= word;
			}
		}
		return newWord;
	}
	@Test
	public void testcase1() {
		Assert.assertEquals(makeBigString("Word","X",3), "WordXWordXWord");
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(makeBigString("This","And",2), "ThisAndThis");
	}
	@Test
	public void testcase3() {
		Assert.assertEquals(makeBigString("This","And",1), "This");
	}


}
