package package1;

import org.junit.Test;

public class Execuate extends Base {
	@Test
	public void run () throws InterruptedException {
		Testpage tp=new Testpage(dr);
		tp.BootsBuy();
	}
	

}
