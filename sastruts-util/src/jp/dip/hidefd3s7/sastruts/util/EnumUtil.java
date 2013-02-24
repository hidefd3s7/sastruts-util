package jp.dip.hidefd3s7.sastruts.util;

import java.util.EnumSet;
import jp.dip.hidefd3s7.sastruts.enumeration.Kubun;

/**
 * 区分値・列挙型を扱うユーティリティクラスです。
 * @author hidefd3s7
 */
public class EnumUtil {

	/* ordinalから */
	public static <C, E extends Enum<E> & Kubun<C>> String nameByOrdinal(int ordinal, Class<E> cls) {
		E e = getEnumByOrdinal(ordinal, cls);
		return e != null ? e.name() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> C codeByOrdinal(int ordinal, Class<E> cls) {
		E e = getEnumByOrdinal(ordinal, cls);
		return e != null ? e.getCode() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String kbnNameByOrdinal(int ordinal, Class<E> cls) {
		E e = getEnumByOrdinal(ordinal, cls);
		return e != null ? e.getName() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String listNameByOrdinal(int ordinal, Class<E> cls) {
		E e = getEnumByOrdinal(ordinal, cls);
		return e != null ? e.getListName() : null;
	}

	/**
	 * {@link Enum#ordinal()} から {@link Enum} を取得します。
	 * @param ordinal {@link Enum#ordinal()}
	 * @param cls 区分クラス
	 * @return 区分オブジェクトを返します。
	 */
	private static <C, E extends Enum<E> & Kubun<C>> E getEnumByOrdinal(int ordinal, Class<E> cls) {
		for (E e : EnumSet.allOf(cls)) {
			if (e.ordinal() == ordinal) {
				return e;
			}
		}
		return null;
	}

	/* nameから */
	public static <C, E extends Enum<E> & Kubun<C>> Integer ordinalByName(String name, Class<E> cls) {
		E e = getEnumByName(name, cls);
		return e != null ? e.ordinal() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> C codeByName(String name, Class<E> cls) {
		E e = getEnumByName(name, cls);
		return e != null ? e.getCode() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String kbnNameByName(String name, Class<E> cls) {
		E e = getEnumByName(name, cls);
		return e != null ? e.getName() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String listNameByName(String name, Class<E> cls) {
		E e = getEnumByName(name, cls);
		return e != null ? e.getListName() : null;
	}

	/**
	 * {@link Enum#name()} から {@link Enum} を取得します。
	 * @param name {@link Enum#name()}
	 * @param cls 区分クラス
	 * @return 区分オブジェクトを返します。
	 */
	private static <C, E extends Enum<E> & Kubun<C>> E getEnumByName(String name, Class<E> cls) {
		for (E e : EnumSet.allOf(cls)) {
			if (e.name().equals(name)) {
				return e;
			}
		}
		return null;
	}

	/* 区分値から */
	public static <C, E extends Enum<E> & Kubun<C>> Integer ordinalByCode(C code, Class<E> cls) {
		E e = getEnumByCode(code, cls);
		return e != null ? e.ordinal() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String nameByCode(C code, Class<E> cls) {
		E e = getEnumByCode(code, cls);
		return e != null ? e.name() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String listNameByCode(C code, Class<E> cls) {
		E e = getEnumByCode(code, cls);
		return e != null ? e.getListName() : null;
	}

	public static <C, E extends Enum<E> & Kubun<C>> String kbnNameByCode(C code, Class<E> cls) {
		E e = getEnumByCode(code, cls);
		return e != null ? e.getName() : null;
	}

	/**
	 * {@link Kubun#getCode()} から {@link Enum} を取得します。
	 * @param code 区分値
	 * @param cls 区分クラス
	 * @return 区分オブジェクトを返します。
	 */
	private static <C, E extends Enum<E> & Kubun<C>> E getEnumByCode(C code, Class<E> cls) {
		for (E e : EnumSet.allOf(cls)) {
			if (e.getCode().equals(code)) {
				return e;
			}
		}
		return null;
	}
}
