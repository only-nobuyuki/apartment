package _3._2;

import _3._2.article.RentalApartment;
import _3._2.article.RentalApartmentList;
import _3._2.commons.utitlty.StandardInputReader;

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
		// 賃貸アパートインスタンスを格納する配列
		RentalApartmentList apartmentList = new RentalApartmentList();

		// 50回繰り返す
		for (int i = 0; i <= 50; i++) {
			// コンソールから賃貸アパートのデータを入力する
			String name = StandardInputReader.getInputString("アパート名称を入力してください:");
			if (name.isEmpty()) {
				break;
			}
			int number = StandardInputReader.getInputInt("部屋番号を入力してください:");
			int price = StandardInputReader.getInputInt("賃料を入力してください:");
			double deposit = StandardInputReader.getInputDouble("敷金を入力してください:");
			double keyMoney = StandardInputReader.getInputDouble("礼金を入力してください:");

			// 改行する
			System.out.println();

			// 賃貸アパートインスタンスの生成する
			RentalApartment apartment = new RentalApartment(name, number, price, deposit, keyMoney);
			apartmentList.addRentalApartment(apartment);
		}

		for (int i = 0; i < apartmentList.getQuantityCount(); i++) {
			// 賃貸アパートインスタンスからデータを取得する
			String name = apartmentList.getRentalApartment(i).getName();
			int number = apartmentList.getRentalApartment(i).getNumber();
			int price = apartmentList.getRentalApartment(i).getPrice();
			double deposit = apartmentList.getRentalApartment(i).getDeposit();
			double keyMoney = apartmentList.getRentalApartment(i).getKeyMoney();

			int initalCost = apartmentList.getRentalApartment(i).calcInitalCost();

			// 賃貸アパートのデータを表示する
			System.out.println("名称:" + name + " " + number + "号室"
					+ " 賃料:" + price + "円"
					+ " 敷金:" + deposit + "ヶ月"
					+ " 礼金:" + keyMoney + "ヶ月"
					+ " 初期費用:" + initalCost + "円");
		}
		// 改行する
		System.out.println();

	}

}
