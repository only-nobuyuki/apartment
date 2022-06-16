package _2._3;

import _2._3.utility.StandardInputReader;

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

		RentalApartment rentalApartmentArray[] = new RentalApartment[3];
		for (int i = 0; i >= 0; i++) {
			// コンソールからデータを入力する
			String name = StandardInputReader.getInputString("アパート名称を入力してください:");
			if(name.isEmpty()) {
				break;
			}
			int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
			int price = StandardInputReader.getInputInt("賃料を入力してください:");
			double deposit = StandardInputReader.getInputDouble("敷金を入力してください:");
			double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください:");
			System.out.println("");
			// 賃貸アパートインスタンスの生成する
			rentalApartmentArray[i] = new RentalApartment(deposit, keyMoney, name, number, price);
		}

		// 表示用のテンプレート
		String fixedPhrase = "名称[nama]　[number]号室　賃料[price]円　敷金[deposit]ヵ月　礼金[keyMoney]ヵ月　初期費用:[initialCost]円";
		for (int i = 0; i < rentalApartmentArray.length; i++) {
			// 賃貸アパートインスタンスからデータを取得する
			String name = rentalApartmentArray[i].getName();
			String number = Integer.toString(rentalApartmentArray[i].getNumber());
			String deposit = Double.toString(rentalApartmentArray[i].getDeposit());
			String keyMoney = Double.toString(rentalApartmentArray[i].getKeyMoney());
			String price = Integer.toString(rentalApartmentArray[i].getPrice());
			String initialCost = Integer.toString(rentalApartmentArray[i].calcInitialCost());
			// テンプレート内の任意の文字列をデータに置き換える
			String result=fixedPhrase.replace("[nama]", name)
					.replace("[number]", number)
					.replace("[price]", price)
					.replace("[deposit]", deposit)
					.replace("[keyMoney]", keyMoney)
					.replace("[initialCost]", initialCost);
			// 賃貸アパートのデータを表示する
			System.out.println(result);
		}
	}

}
