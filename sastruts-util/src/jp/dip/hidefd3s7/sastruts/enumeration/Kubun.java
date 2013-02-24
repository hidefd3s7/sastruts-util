package jp.dip.hidefd3s7.sastruts.enumeration;

/**
 * 区分値のインターフェースです。
 *
 * @param <CODE> 区分値の型を定義します。
 */
public interface Kubun<CODE> {

	/**
	 * 区分値を取得します。
	 *
	 * @return 区分値
	 */
	CODE getCode();

	/**
	 * 区分名称を取得します。
	 *
	 * @return 区分名称
	 */
	String getName();

	/**
	 * リストに表示する名称を取得します。
	 *
	 * @return リスト表示名称
	 */
	String getListName();
}
