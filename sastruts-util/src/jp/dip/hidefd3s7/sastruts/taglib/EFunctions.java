package jp.dip.hidefd3s7.sastruts.taglib;

import jp.dip.hidefd3s7.sastruts.enumeration.Kubun;

import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.codeByName;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.codeByOrdinal;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.kbnNameByCode;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.kbnNameByName;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.kbnNameByOrdinal;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.listNameByName;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.listNameByOrdinal;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.listNameByCode;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.nameByCode;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.nameByOrdinal;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.ordinalByCode;
import static jp.dip.hidefd3s7.sastruts.util.EnumUtil.ordinalByName;

/**
 * 区分のファンクションです。
 *
 * @author hidefd3s7
 */
public class EFunctions {

	/** 列挙型で配置される */
	public static String prefix;

	static {
		prefix = Kubun.class.getPackage().getName() + ".";
	}
	
	/**
	 * パッケージの接頭辞を設定します。
	 * @param cls Enumや区分パッケージを格納するクラス
	 */
	public static void setPrefix(Class<?> cls) {
		synchronized (EFunctions.class) {
			prefix = cls.getPackage().getName() + ".";
		}
	}
	

	/**
	 * {@link Enum#ordinal()} から {@link Enum#name()} を取得します。
	 *
	 * @param ordinal {@link Enum#ordinal()}
	 * @param cls     クラス名
	 * @return {@link Enum#name()}
	 */
	@SuppressWarnings("unchecked")
	public static String o2n(int ordinal, String cls) {
		return nameByOrdinal(ordinal, getClass(cls));
	}

	/**
	 * {@link Enum#ordinal()} から {@link Kubun#getCode() } を取得します。
	 *
	 * @param ordinal {@link Enum#ordinal()}
	 * @param cls     クラス名
	 * @return {@link Kubun#getCode() }
	 */
	@SuppressWarnings("unchecked")
	public static Object o2c(int ordinal, String cls) {
		return codeByOrdinal(ordinal, getClass(cls));
	}

	/**
	 * {@link Enum#ordinal()} から {@link Kubun#getName() } を取得します。
	 *
	 * @param ordinal {@link Enum#ordinal()}
	 * @param cls     クラス名
	 * @return {@link Kubun#getName() }
	 */
	@SuppressWarnings("unchecked")
	public static String o2kn(int ordinal, String cls) {
		return kbnNameByOrdinal(ordinal, getClass(cls));
	}

	/**
	 * {@link Enum#ordinal()} から {@link Kubun#getListName() } を取得します。
	 *
	 * @param ordinal {@link Enum#ordinal()}
	 * @param cls     クラス名
	 * @return {@link Kubun#getListName() }
	 */
	@SuppressWarnings("unchecked")
	public static String o2ln(int ordinal, String cls) {
		return listNameByOrdinal(ordinal, getClass(cls));
	}

	/**
	 * {@link Enum#name()} から {@link Enum#ordinal() } を取得します。
	 *
	 * @param name {@link Enum#name()}
	 * @param cls  クラス名
	 * @return {@link Enum#ordinal()}
	 */
	@SuppressWarnings("unchecked")
	public static int n2o(String name, String cls) {
		return ordinalByName(name, getClass(cls));
	}

	/**
	 * {@link Enum#name()} から {@link Kubun#getCode() } を取得します。
	 *
	 * @param name {@link Enum#name()}
	 * @param cls  クラス名
	 * @return {@link Kubun#getCode()}
	 */
	@SuppressWarnings("unchecked")
	public static Object n2c(String name, String cls) {
		return codeByName(name, getClass(cls));
	}

	/**
	 * {@link Enum#name()} から {@link Kubun#getName() } を取得します。
	 *
	 * @param name {@link Enum#name()}
	 * @param cls  クラス名
	 * @return {@link Kubun#getName()}
	 */
	@SuppressWarnings("unchecked")
	public static String n2kn(String name, String cls) {
		return kbnNameByName(name, getClass(cls));
	}

	/**
	 * {@link Enum#name()} から {@link Kubun#getListName() } を取得します。
	 *
	 * @param name {@link Enum#name()}
	 * @param cls  クラス名
	 * @return {@link Kubun#getListName()}
	 */
	@SuppressWarnings("unchecked")
	public static String n2ln(String name, String cls) {
		return listNameByName(name, getClass(cls));
	}

	/**
	 * {@link Kubun#getCode()} から {@link Enum#ordinal() } を取得します。
	 *
	 * @param code {@link Kubun#getCode()}
	 * @param cls  クラス名
	 * @return {@link Enum#ordinal()}
	 */
	@SuppressWarnings("unchecked")
	public static int c2o(Object code, String cls) {
		return ordinalByCode(code, getClass(cls));
	}

	/**
	 * {@link Kubun#getCode()} から {@link Enum#name() } を取得します。
	 *
	 * @param code {@link Kubun#getCode()}
	 * @param cls  クラス名
	 * @return {@link Enum#name()}
	 */
	@SuppressWarnings("unchecked")
	public static String c2n(Object code, String cls) {
		return nameByCode(code, getClass(cls));
	}

	/**
	 * {@link Kubun#getCode()} から {@link Kubun#getName() } を取得します。
	 *
	 * @param code {@link Kubun#getCode()}
	 * @param cls  クラス名
	 * @return {@link Kubun#getName()}
	 */
	@SuppressWarnings("unchecked")
	public static String c2kn(Object code, String cls) {
		return kbnNameByCode(code, getClass(cls));
	}

	/**
	 * {@link Kubun#getCode()} から {@link Kubun#getListName() } を取得します。
	 *
	 * @param code {@link Kubun#getCode()}
	 * @param cls  クラス名
	 * @return {@link Kubun#getListName()}
	 */
	@SuppressWarnings("unchecked")
	public static String c2ln(Object code, String cls) {
		return listNameByCode(code, getClass(cls));
	}

	/**
	 * クラス名から {@link Class } を取得します。
	 *
	 * @param cls クラス名
	 * @return {@link Class }
	 */
	@SuppressWarnings("rawtypes")
	private static Class getClass(String cls) {
		try {
			return Class.forName(getClassName(cls));
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}

	/**
	 * クラス名からクラス名のフルパスを取得します。
	 *
	 * @param cls クラス名
	 * @return クラスのフルパス
	 */
	private static String getClassName(String cls) {
		return startsWithSmallCharactor(cls) ? cls : prefix + cls;
	}

	/**
	 * クラス名が小文字から始まっているかどうかをチェックします。
	 *
	 * @param cls クラス名
	 * @return 小文字で始まっている場合は{@code true}、租ウでない場合は{@code false}
	 */
	private static boolean startsWithSmallCharactor(String cls) {
		if (cls == null || cls.length() < 1) {
			throw new IllegalArgumentException("Set to class name.");
		}
		return cls.matches("^[a-z].*");
	}

	/**
	 * Enum名から {@link Enum#ordinal()} を取得します。
	 *
	 * @param eName Enum名
	 * @return {@link Enum#ordinal()}
	 */
	public static int ordinal(String eName) {
		return n2o(substrName(eName), substrClassName(eName));
	}

	/**
	 * Enum名から {@link Kubun#getCode()} を取得します。
	 *
	 * @param eName Enum名
	 * @return {@link Kubun#getCode()}
	 */
	public static Object code(String eName) {
		return n2c(substrName(eName), substrClassName(eName));
	}

	/**
	 * Enum名から {@link Kubun#getName()} を取得します。
	 *
	 * @param eName Enum名
	 * @return {@link Kubun#getName()}
	 */
	public static String kbnName(String eName) {
		return n2kn(substrName(eName), substrClassName(eName));
	}

	/**
	 * Enum名から {@link Kubun#getListName()} を取得します。
	 *
	 * @param eName Enum名
	 * @return {@link Kubun#getListName()}
	 */
	public static String listName(String eName) {
		return n2ln(substrName(eName), substrClassName(eName));
	}

	/**
	 * Enum名からEnumクラス名を抽出します。
	 *
	 * @param eName Enum名
	 * @return Enumクラス名
	 */
	private static String substrClassName(String eName) {
		validateName(eName);
		return eName.substring(0, eName.lastIndexOf('.'));
	}

	/**
	 * Enum名から {@link Enum#name() } を抽出します。
	 *
	 * @param eName Enum名
	 * @return {@link Enum#name() }
	 */
	private static String substrName(String eName) {
		validateName(eName);
		return eName.substring(eName.lastIndexOf('.') + 1);
	}

	/**
	 * 無効なEnum名かどうかをチェックします。
	 *
	 * @param eName Enum名
	 */
	private static void validateName(String eName) {
		if (eName == null || eName.length() < 1) {
			throw new IllegalArgumentException("Set to enum name. ex. 'Status'.");
		}
		if (eName.lastIndexOf('.') == -1) {
			throw new IllegalArgumentException(
				"Set to enum name. ex. 'Status.SAKUSEI'.");
		}
	}
}
