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

	@Test
	public void ordinalOK() {
		assertEquals(Status.SAKUSEI.ordinal(), ordinal("Status.SAKUSEI"));
	}

	@Test
	public void codeOK() {
		assertEquals(Status.SAKUSEI.getCode(), code("Status.SAKUSEI"));
	}

	@Test
	public void kbnNameOK() {
		assertEquals(Status.SAKUSEI.getName(), kbnName("Status.SAKUSEI"));
	}

	@Test
	public void listNameOK() {
		assertEquals(Status.SAKUSEI.getListName(), listName("Status.SAKUSEI"));
	}

	@Test
	public void o2nOK() {
		assertEquals(Status.SAKUSEI.name(), o2n(0, "Status"));
	}

	@Test
	public void o2cOK() {
		assertEquals(Status.SAKUSEI.getCode(), o2c(0, "Status"));
	}

	@Test
	public void o2knOK() {
		assertEquals(Status.SAKUSEI.getName(), o2kn(0, "Status"));
	}

	@Test
	public void o2lnOK() {
		assertEquals(Status.SAKUSEI.getListName(), o2ln(0, "Status"));
	}

	@Test
	public void c2oOK() {
		assertEquals(Status.SAKUSEI.ordinal(), c2o("1", "Status"));
	}

	@Test
	public void c2nOK() {
		assertEquals(Status.SAKUSEI.name(), c2n("1", "Status"));
	}

	@Test
	public void c2knOK() {
		assertEquals(Status.SAKUSEI.getName(), c2kn("1", "Status"));
	}

	@Test
	public void c2lnOK() {
		assertEquals(Status.SAKUSEI.getListName(), c2ln("1", "Status"));
	}

	@Test
	public void n2oOK() {
		assertEquals(Status.SAKUSEI.ordinal(), n2o("SAKUSEI", "Status"));
	}

	@Test
	public void n2cOK() {
		assertEquals(Status.SAKUSEI.getCode(), n2c("SAKUSEI", "Status"));
	}

	@Test
	public void n2knOK() {
		assertEquals(Status.SAKUSEI.getName(), n2kn("SAKUSEI", "Status"));
	}

	@Test
	public void n2lnOK() {
		assertEquals(Status.SAKUSEI.getListName(), n2ln("SAKUSEI", "Status"));
	}
}
