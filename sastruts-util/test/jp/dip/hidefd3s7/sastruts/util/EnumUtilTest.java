/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.dip.hidefd3s7.sastruts.util;

import jp.dip.hidefd3s7.sastruts.enumeration.Status;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author hiroki
 */
public class EnumUtilTest {

	public EnumUtilTest() {
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
	 * nameByOrdinalメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testNameByOrdinal() {
		System.out.println("nameByOrdinal");
		int ordinal = 0;
		Class<Status> cls = Status.class;
		String expResult = "SAKUSEI";
		String result = EnumUtil.nameByOrdinal(ordinal, cls);
		assertEquals(result, expResult);
	}

	/**
	 * codeByOrdinalメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testCodeByOrdinal() {
		System.out.println("codeByOrdinal");
		int ordinal = 0;
		Class<Status> cls = Status.class;
		Object expResult = "1";
		Object result = EnumUtil.codeByOrdinal(ordinal, cls);
		assertEquals(result, expResult);
	}

	/**
	 * kbnNameByOrdinalメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testKbnNameByOrdinal() {
		System.out.println("kbnNameByOrdinal");
		int ordinal = 0;
		Class<Status> cls = Status.class;
		String expResult = "作成中";
		String result = EnumUtil.kbnNameByOrdinal(ordinal, cls);
		assertEquals(result, expResult);
	}

	/**
	 * listNameByOrdinalメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testListNameByOrdinal() {
		System.out.println("listNameByOrdinal");
		int ordinal = 0;
		Class<Status> cls = Status.class;
		String expResult = "1 作成中";
		String result = EnumUtil.listNameByOrdinal(ordinal, cls);
		assertEquals(result, expResult);
	}

	/**
	 * ordinalByNameメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testOrdinalByName() {
		System.out.println("ordinalByName");
		String name = "SAKUSEI";
		Class<Status> cls = Status.class;
		Integer expResult = 0;
		Integer result = EnumUtil.ordinalByName(name, cls);
		assertEquals(result, expResult);
	}

	/**
	 * codeByNameメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testCodeByName() {
		System.out.println("codeByName");
		String name = "SAKUSEI";
		Class<Status> cls = Status.class;
		Object expResult = "1";
		Object result = EnumUtil.codeByName(name, cls);
		assertEquals(result, expResult);
	}

	/**
	 * kbnNameByNameメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testKbnNameByName() {
		System.out.println("kbnNameByName");
		String name = "SAKUSEI";
		Class<Status> cls = Status.class;
		String expResult = "作成中";
		String result = EnumUtil.kbnNameByName(name, cls);
		assertEquals(result, expResult);
	}

	/**
	 * listNameByNameメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testListNameByName() {
		System.out.println("listNameByName");
		String name = "SAKUSEI";
		Class<Status> cls = Status.class;
		String expResult = "1 作成中";
		String result = EnumUtil.listNameByName(name, cls);
		assertEquals(result, expResult);
	}

	/**
	 * ordinalByCodeメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testOrdinalByCode() {
		System.out.println("ordinalByCode");
		Object code = "1";
		Class<Status> cls = Status.class;
		Integer expResult = 0;
		Integer result = EnumUtil.ordinalByCode(code, cls);
		assertEquals(result, expResult);
	}

	/**
	 * nameByCodeメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testNameByCode() {
		System.out.println("nameByCode");
		Object code = "1";
		Class<Status> cls = Status.class;
		String expResult = "SAKUSEI";
		String result = EnumUtil.nameByCode(code, cls);
		assertEquals(result, expResult);
	}

	/**
	 * kbnNameByCodeメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testKbnNameByCode() {
		System.out.println("kbnNameByCode");
		Object code = "1";
		Class<Status> cls = Status.class;
		String expResult = "作成中";
		String result = EnumUtil.kbnNameByCode(code, cls);
		assertEquals(result, expResult);
	}

	/**
	 * listNameByCodeメソッドのテスト、クラスEnumUtilのテスト。
	 */
	@Test
	public void testListNameByCode() {
		System.out.println("listNameByCode");
		Object code = "1";
		Class<Status> cls = Status.class;
		String expResult = "1 作成中";
		String result = EnumUtil.listNameByCode(code, cls);
		assertEquals(result, expResult);
	}
}