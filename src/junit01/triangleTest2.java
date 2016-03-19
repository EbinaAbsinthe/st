package junit01;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class triangleTest2 {
	private triangle t;
	@Before
	public void setUp() throws Exception {
		t = new triangle();
	}

	@Test
	public void testS() {
		Assert.assertEquals("不能判断是否为三角形","不是三角形",t.s(1,1,2));
		Assert.assertEquals("不能判断是否为等边三角形","等边三角形",t.s(1,1,1));
		Assert.assertEquals("不能判断是否为等腰三角形","等腰三角形",t.s(2,2,3));
		Assert.assertEquals("不能判断是否为一般三角形","一般三角形",t.s(3,4,5));
	}
}
