package testes;


import org.junit.Test;

import aplicacao.valores;
import junit.framework.TestCase;

public class valoresTest extends TestCase {

	valores v;
	protected void setUp() throws Exception {
		super.setUp();
		v = new valores();
		v.ins(5);
		v.ins(12);
		v.ins(1);
		v.ins(30);
		v.ins(152);
		v.ins(6);
		}
	
	@Test
	public void testIns() {
		
		assertEquals(false,v.ins(-10));
		assertEquals(false,v.ins(0));
		v.ins(2);
		assertEquals(7,v.size());
		v.ins(3);
		assertEquals(8,v.size());
		v.ins(4);
		assertEquals(9,v.size());
		v.ins(5);
		assertEquals(10,v.size());
		assertEquals(false,v.ins(11));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testDel() {
			v.ins(60);
			assertEquals(5,v.del(0));
			assertEquals(152,v.del(4));
			assertEquals(60,v.del(6));
			assertNotSame(3,v.del(1));
			
		
		//	fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		
		assertEquals(6, v.size());
		v.ins(22);
		assertEquals(7, v.size());
		
		
	//	fail("Not yet implemented");
	}

}
