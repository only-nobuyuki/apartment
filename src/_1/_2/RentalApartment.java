package _1._2;
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

	RentalApartment(double deposit, double keyMoney, String name, int number, int price) {
		super();
		this.deposit = deposit;
		this.keyMoney = keyMoney;
		this.name = name;
		this.number = number;
		this.price = price;
	}

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
