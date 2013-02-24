package jp.dip.hidefd3s7.sastruts.enumeration;

import jp.dip.hidefd3s7.sastruts.enumeration.Kubun;

public enum Status implements Kubun<String> {

	SAKUSEI("1", "作成中"),
	KENTO_MACHI("2", "検討待ち"),
	SHONIN_MACHI("3", "承認待ち"),
	SHONIN_ZUMI("4", "承認済み");
	private String code;
	private String name;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getListName() {
		return code + " " + name;
	}

	private Status(String code, String name) {
		this.code = code;
		this.name = name;
	}
}
