package jp.dip.hidefd3s7.sastruts.taglib;

import jp.dip.hidefd3s7.sastruts.enumeration.Status;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static jp.dip.hidefd3s7.sastruts.taglib.EFunctions.*;
import static org.testng.Assert.*;

/**
 *
 *
 * @author hidefd3s7
 */
public class EFunctionsTest {

	public EFunctionsTest() {
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@BeforeMethod
	public void setUpMethod() throws Exception {
	}

	@AfterMethod
	public void tearDownMethod() throws Exception {
	}

	/**
	 * ordinalメソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testPrefix() {
		assertEquals("jp.dip.hidefd3s7.sastruts.enumeration.", EFunctions.prefix);
		EFunctions.setPrefix(EFunctions.class);
		assertEquals("jp.dip.hidefd3s7.sastruts.taglib.", EFunctions.prefix);
	}

	/**
	 * ordinalメソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testOrdinal() {
		assertEquals(Status.SAKUSEI.ordinal(), ordinal("Status.SAKUSEI"));
	}

	/**
	 * codeメソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testCode() {
		assertEquals(Status.SAKUSEI.getCode(), code("Status.SAKUSEI"));
	}

	/**
	 * kbnNameメソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testKbnName() {
		assertEquals(Status.SAKUSEI.getName(), kbnName("Status.SAKUSEI"));
	}

	/**
	 * listNameメソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testListName() {
		assertEquals(Status.SAKUSEI.getListName(), listName("Status.SAKUSEI"));
	}

	/**
	 * o2n メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testO2n() {
		assertEquals(Status.SAKUSEI.name(), o2n(0, "Status"));
	}

	/**
	 * o2c メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testO2c() {
		assertEquals(Status.SAKUSEI.getCode(), o2c(0, "Status"));
	}

	/**
	 * o2kn メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testO2kn() {
		assertEquals(Status.SAKUSEI.getName(), o2kn(0, "Status"));
	}

	/**
	 * o2ln メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testO2ln() {
		assertEquals(Status.SAKUSEI.getListName(), o2ln(0, "Status"));
	}

	/**
	 * c2o メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testC2o() {
		assertEquals(Status.SAKUSEI.ordinal(), c2o("1", "Status"));
	}

	/**
	 * c2n メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testC2n() {
		assertEquals(Status.SAKUSEI.name(), c2n("1", "Status"));
	}

	/**
	 * c2kn メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testC2kn() {
		assertEquals(Status.SAKUSEI.getName(), c2kn("1", "Status"));
	}

	/**
	 * c2ln メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testC2ln() {
		assertEquals(Status.SAKUSEI.getListName(), c2ln("1", "Status"));
	}

	/**
	 * n2o メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testN2o() {
		assertEquals(Status.SAKUSEI.ordinal(), n2o("SAKUSEI", "Status"));
	}

	/**
	 * n2c メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testN2c() {
		assertEquals(Status.SAKUSEI.getCode(), n2c("SAKUSEI", "Status"));
	}

	/**
	 * n2kn メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testN2kn() {
		assertEquals(Status.SAKUSEI.getName(), n2kn("SAKUSEI", "Status"));
	}

	/**
	 * n2ln メソッドのテスト、クラスEFunctionsのテスト。
	 */
	@Test
	public void testN2ln() {
		assertEquals(Status.SAKUSEI.getListName(), n2ln("SAKUSEI", "Status"));
	}
}
