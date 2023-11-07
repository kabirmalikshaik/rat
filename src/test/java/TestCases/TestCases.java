package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import valid.Validations;

public class TestCases {
	@Test
	public void case1()
	{
		Validations v1=new Validations();
		Assert.assertEquals(true, v1.check("sameer","123"));

	}
	@Test
	public void case2()
	{
		Validations v2=new Validations();
		Assert.assertEquals(false, v2.check("raki","raki"));

	}
	
}

