package _2._1;
import _2._1.util.copy.StandardInputReader;

/**
 * 賃貸アパートを管理するためのアプリケーションです.
 *
 * @author BetterOneself
 */
class RentalApartmentManagement {

	/**
	 * アプリケーションを起動します.
	 *
	 * @param args 起動パラメータ文字列の配列(今回は利用しない)
	 */
	public static void main(String[] args) {

		// コンソールからデータを入力する
		String name = StandardInputReader.getInputString("アパート名称を入力してください:");
		int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
		int price = StandardInputReader.getInputInt("賃料を入力してください:");
		double deposit = StandardInputReader.getInputDouble("敷金を入力してください:");
		double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください:");

		// 賃貸アパートインスタンスの生成する
		RentalApartment rentalApartment = new RentalApartment(deposit, keyMoney, name, number, price);

		// 賃貸アパートインスタンスからデータを取得する
		double d = rentalApartment.getDeposit();
		double k = rentalApartment.getKeyMoney();
		String n = rentalApartment.getName();
		int num = rentalApartment.getNumber();
		int p = rentalApartment.getPrice();
		int i = rentalApartment.calcInitialCost();

		// 賃貸アパートのデータを表示する
		System.out.println("名称:"+n+" "+num+"号室"+" 賃料:"+p+"円"+"　敷金:"+d+"ヵ月"+"　礼金:"+k+"ヵ月"+" 初期費用:"+i+"円");
	}

}
