package _1._1;
/**
 * 賃貸アパートを表すクラス
 *
 * 賃貸アパートに関わる情報や操作を保有します.
 *
 * RentalApartment.java
 * @author ノブ
 */
class RentalApartment {
	/**
	 * 敷金(賃料の何ヶ月分)
	 */
	private double deposit;
	
	/**
	 * 礼金(賃料の何ヶ月分)
	 */
	private double keyMoney;
	
	/**
	 * 物件名称
	 */
	private String name;
	
	/**
	 * 部屋番号
	 */
	private int number;
	
	/**
	 * 月々の賃料
	 */
	private int price;

	double getDeposit() {
		return deposit;
	}

	void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	double getKeyMoney() {
		return keyMoney;
	}

	void setKeyMoney(double keyMoney) {
		this.keyMoney = keyMoney;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}
}
