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
		Assert.assertEquals("�����ж��Ƿ�Ϊ������","����������",t.s(1,1,2));
		Assert.assertEquals("�����ж��Ƿ�Ϊ�ȱ�������","�ȱ�������",t.s(1,1,1));
		Assert.assertEquals("�����ж��Ƿ�Ϊ����������","����������",t.s(2,2,3));
		Assert.assertEquals("�����ж��Ƿ�Ϊһ��������","һ��������",t.s(3,4,5));
	}
}
