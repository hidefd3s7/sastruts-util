package jp.dip.hidefd3s7.sastruts.util;

import java.util.EnumSet;
import jp.dip.hidefd3s7.sastruts.enumeration.Kubun;

/**
 * 区分値・列挙型を扱うユーティリティクラスです。
 *
 * @author hidefd3s7
 */
public class EnumUtil {

  /**
   * {@link Enum#ordinal()} から {@link Enum#name()} を取得します。
   *
   * @param <E> Enumの型
   * @param ordinal {@link Enum#ordinal()}
   * @param cls Enumクラス
   * @return {@link Enum#name()}
   */
  public static <E extends Enum<E> & Kubun<?>> String nameByOrdinal(int ordinal, Class<E> cls) {
	E e = getEnumByOrdinal(ordinal, cls);
	return e != null ? e.name() : null;
  }

  /**
   * {@link Enum#ordinal()} から {@link Kubun#getCode()} を取得します。
   *
   * @param <C> 区分値の型
   * @param <E> Enumの型
   * @param ordinal {@link Enum#ordinal()}
   * @param cls Enumクラス
   * @return {@link Kubun#getCode()}
   */
  public static <C, E extends Enum<E> & Kubun<C>> C codeByOrdinal(int ordinal, Class<E> cls) {
	E e = getEnumByOrdinal(ordinal, cls);
	return e != null ? e.getCode() : null;
  }

  /**
   * {@link Enum#ordinal()} から {@link Kubun#getName()} を取得します。
   *
   * @param <E> Enumの型
   * @param ordinal {@link Enum#ordinal()}
   * @param cls Enumクラス
   * @return {@link Kubun#getName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String kbnNameByOrdinal(int ordinal, Class<E> cls) {
	E e = getEnumByOrdinal(ordinal, cls);
	return e != null ? e.getName() : null;
  }

  /**
   * {@link Enum#ordinal()} から {@link Kubun#getListName()} を取得します。
   *
   * @param <E> Enumの型
   * @param ordinal {@link Enum#ordinal()}
   * @param cls Enumクラス
   * @return {@link Kubun#getListName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String listNameByOrdinal(int ordinal, Class<E> cls) {
	E e = getEnumByOrdinal(ordinal, cls);
	return e != null ? e.getListName() : null;
  }

  /**
   * {@link Enum#ordinal()} から {@link Enum} を取得します。
   *
   * @param <E> Enumの型
   * @param ordinal {@link Enum#ordinal()}
   * @param cls 区分クラス
   * @return 区分オブジェクトを返します。
   */
  private static <E extends Enum<E> & Kubun<?>> E getEnumByOrdinal(int ordinal, Class<E> cls) {
	for (E e : EnumSet.allOf(cls)) {
	  if (e.ordinal() == ordinal) {
		return e;
	  }
	}
	return null;
  }

  /**
   * {@link Enum#name()} から {@link Enum#ordinal()} を取得します。
   *
   * @param <E> Enumの型
   * @param name Enum名
   * @param cls Enumクラス
   * @return {@link Enum#ordinal()}
   */
  public static <E extends Enum<E> & Kubun<?>> Integer ordinalByName(String name, Class<E> cls) {
	E e = getEnumByName(name, cls);
	return e != null ? e.ordinal() : null;
  }

  /**
   * {@link Enum#name()} から {@link Kubun#getCode()} を取得します。
   *
   * @param <C> 区分値の型
   * @param <E> Enumの型
   * @param name Enum名
   * @param cls Enumクラス
   * @return {@link Kubun#getCode()}
   */
  public static <C, E extends Enum<E> & Kubun<C>> C codeByName(String name, Class<E> cls) {
	E e = getEnumByName(name, cls);
	return e != null ? e.getCode() : null;
  }

  /**
   * {@link Enum#name()} から {@link Kubun#getName()} を取得します。
   *
   * @param <E> Enumの型
   * @param name Enum名
   * @param cls Enumクラス
   * @return {@link Kubun#getName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String kbnNameByName(String name, Class<E> cls) {
	E e = getEnumByName(name, cls);
	return e != null ? e.getName() : null;
  }

  /**
   * {@link Enum#name()} から {@link Kubun#getListName()} を取得します。
   *
   * @param <E> Enumの型
   * @param name Enum名
   * @param cls Enumクラス
   * @return {@link Kubun#getListName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String listNameByName(String name, Class<E> cls) {
	E e = getEnumByName(name, cls);
	return e != null ? e.getListName() : null;
  }

  /**
   * {@link Enum#name()} から {@link Enum} を取得します。
   *
   * @param <E> Enumの型
   * @param name {@link Enum#name()}
   * @param cls 区分クラス
   * @return {@link Enum} を返します。
   */
  private static <E extends Enum<E> & Kubun<?>> E getEnumByName(String name, Class<E> cls) {
	for (E e : EnumSet.allOf(cls)) {
	  if (e.name().equals(name)) {
		return e;
	  }
	}
	return null;
  }

  /**
   * {@link Kubun#getCode()} から {@link Enum#ordinal()} を取得します。
   *
   * @param <E> Enumの型
   * @param code 区分値
   * @param cls Enumクラス
   * @return {@link Kubun#getName()}
   */
  public static <E extends Enum<E> & Kubun<?>> Integer ordinalByCode(Object code, Class<E> cls) {
	E e = getEnumByCode(code, cls);
	return e != null ? e.ordinal() : null;
  }

  /**
   * {@link Kubun#getCode()} から {@link Enum#name()} を取得します。
   *
   * @param <E> Enumの型
   * @param code 区分値
   * @param cls Enumクラス
   * @return {@link Kubun#getName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String nameByCode(Object code, Class<E> cls) {
	E e = getEnumByCode(code, cls);
	return e != null ? e.name() : null;
  }

  /**
   * {@link Kubun#getCode()} から {@link Kubun#getName()} を取得します。
   *
   * @param <E> Enumの型
   * @param code 区分値
   * @param cls Enumクラス
   * @return {@link Kubun#getName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String kbnNameByCode(Object code, Class<E> cls) {
	E e = getEnumByCode(code, cls);
	return e != null ? e.getName() : null;
  }

  /**
   * {@link Kubun#getCode()} から {@link Kubun#getListName()} を取得します。
   *
   * @param <E> Enumの型
   * @param code 区分値
   * @param cls Enumクラス
   * @return {@link Kubun#getListName()}
   */
  public static <E extends Enum<E> & Kubun<?>> String listNameByCode(Object code, Class<E> cls) {
	E e = getEnumByCode(code, cls);
	return e != null ? e.getListName() : null;
  }

  /**
   * {@link Kubun#getCode()} から {@link Enum} を取得します。
   *
   * @param <E> Enumの型
   * @param code 区分値
   * @param cls 区分クラス
   * @return 区分オブジェクトを返します。
   */
  private static <E extends Enum<E> & Kubun<?>> E getEnumByCode(Object code, Class<E> cls) {
	for (E e : EnumSet.allOf(cls)) {
	  if (e.getCode().equals(code)) {
		return e;
	  }
	}
	return null;
  }

  /**
   * プライベートコンストラクタです。
   */
  private EnumUtil() {
  }
}
