package _1._2;
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
		// 賃貸アパートインスタンスの生成する
		RentalApartment rentalApartment = new RentalApartment(2.0, 1.0, "エステートピア新宿", 105, 84000);

		// 賃貸アパートインスタンスからデータを取得する
		double d=rentalApartment.getDeposit();
		double k=rentalApartment.getKeyMoney();
		String n=rentalApartment.getName();
		int num=rentalApartment.getNumber();
		int p=rentalApartment.getPrice();

		// 賃貸アパートのデータを表示する
		System.out.println("名称:"+n+" "+num+"号室"+" 賃料:"+p+"円"+"　敷金:"+d+"ヵ月"+"　礼金:"+k+"ヵ月");
	}

}
