package _2._3;
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

	/**
	 * 賃貸アパートを表すクラスのコンストラクタです.
	 * @param deposit
	 * @param keyMoney
	 * @param name
	 * @param number
	 * @param price
	 */
	RentalApartment(double deposit, double keyMoney, String name, int number, int price) {
		super();
		this.deposit = deposit;
		this.keyMoney = keyMoney;
		this.name = name;
		this.number = number;
		this.price = price;
	}

	/**
	 * 契約時の初期費用を計算します.
	 * @return 初期費用
	 */
	int calcInitialCost() {
		int price = getPrice();
		int i = (int) (price * 2
				+ Math.floor(price * getDeposit())
				+ Math.floor(price * getKeyMoney()));
		if (price < 50000) {
			return i + price;
		} else if (price >= 50000 && price < 100000) {
			return (int) (i + price * 0.75);
		} else {
			return (int) (i + price * 0.5);
		}
	}

	/**
	 * 敷金を取得します.
	 * @return 敷金
	 */
	double getDeposit() {
		return deposit;
	}

	/**
	 * 敷金を設定します.
	 * @param 敷金
	 */
	void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	/**
	 * 礼金を取得します.
	 * @return 礼金
	 */
	double getKeyMoney() {
		return keyMoney;
	}

	/**
	 * 礼金を設定します.
	 * @param 礼金
	 */
	void setKeyMoney(double keyMoney) {
		this.keyMoney = keyMoney;
	}

	/**
	 * 物件名称を取得します.
	 * @return 物件名称
	 */
	String getName() {
		return name;
	}

	/**
	 * 物件名称を設定します.
	 * @param 物件名称
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * 部屋番号を取得します.
	 * @return 部屋番号
	 */
	int getNumber() {
		return number;
	}

	/**
	 * 部屋番号を設定します.
	 * @param 部屋番号
	 */
	void setNumber(int number) {
		this.number = number;
	}

	/**
	 * 月々の賃料を取得します.
	 * @return 賃料
	 */
	int getPrice() {
		return price;
	}

	/**
	 * 月々の賃料を設定します.
	 * @param 賃料
	 */
	void setPrice(int price) {
		this.price = price;
	}
}
