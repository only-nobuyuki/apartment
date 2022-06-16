package _2._3.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * StandardInputReaderクラスは、標準入力(コンソール)から入力されたデータを取得するための機能を有します.
 *
 * <pre>
 *  コンソールで入力されたデータを文字列データとして取得する場合は、{@link #getInputString(String)} メソッドを使用します.
 *
 *  使用例 :
 * <code>
 * String stringData = StandardInputReader.getInputString(&quot;文字列を入力して下さい：&quot;);
 * </code>
 *
 *  コンソールから入力されたデータを数値データとして取得する場合は、{@link #getInputInt(String)} メソッドを使用します.
 *
 *  使用例 :
 * <code>
 * int intData = StandardInputReader.getInputInt(&quot;数値を入力して下さい：&quot;);
 * </code>
 *
 * </pre>
 *
 *  @author BetterOneself
 */
public class StandardInputReader {

    /**
     * コンソールから入力したデータを 文字データとして取得します.
     *
     * @param message
     *            表示するメッセージ
     * @return ユーザの入力した文字データ. 文字が入力されなかった場合、長さ0の文字列が返却されます.
     */
    public static String getInputString(String message) {
        System.out.print(message);
        String inputString = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));
        try {
            inputString = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("入力時にエラーが発生しました。", e);
        }
        return inputString;
    }

    /**
     * コンソールから入力したデータを 数値(整数)データとして取得します.
     *
     * @param message
     *            表示するメッセージ
     * @return ユーザの入力した数値(整数)データ
     * @throws NumberFormatException
     *             整数に変換できない文字が入力された場合
     */
    public static int getInputInt(String message) throws NumberFormatException {
        return Integer.parseInt(getInputString(message));
    }

    /**
     * コンソールから入力したデータを 数値(実数)データとして取得します.
     *
     * @param message
     *            表示するメッセージ
     * @return ユーザの入力した数値(実数)データ
     * @throws NumberFormatException
     *             実数に変換できない文字が入力された場合
     */
    public static double getInputDouble(String message) throws NumberFormatException {
        return Double.parseDouble(getInputString(message));
    }
}