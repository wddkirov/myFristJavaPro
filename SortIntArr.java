import java.util.*;
import java.util.regex.*;

/**
 * 整数リストの正確性をチェック上、その並び順を逆にするリストを作成
 * @author mu
 */
public class SortIntArr {
	/**
	 * private変数
	 * 整数リスト
	 */
	private List<String> _strForSort=new ArrayList<String>();
	
	/**
	 * SortIntArrのコンストラクタメソッド
	 * @param listStr, not {@code null}
	 * @return void
	 */
	public SortIntArr(List<String> listStr)
	{
		_strForSort=listStr;
		CheckIntList(_strForSort);
		
	}
	
	/**
	 * リストに格納される要素が整数型であるかをチェック
	 * リスト並び順を逆にするリストを作成
	 * @param listStr, not {@code null}
	 * @return void
	 * @exception 渡るパラメータlistStrが整数以外の要素がある場合、llegalArgumentException発生させる
	 */
	private void CheckIntList(List<String> listStr)
	{
		if(listStr.size()<=0)
		{
			throw new IllegalArgumentException("1個以上の整数の形で入力してください！");
		}
		int i=1;
		for (String str : listStr) {
			if(!isDigit(str))
			{
				throw new IllegalArgumentException(Integer.toString(i)+"個目は整数の形で入力してください！");
			}
			i++;
		}	
		Collections.reverse(_strForSort);
	}
	
	/**
	 * 並び順が逆にされた後のリストを取得
	 * @return 並び順が逆にされた後のリスト
	 */
	public List<String> GetSortedList()
	{
		return _strForSort;
	}
	
	
	/**
	 * 文字列が数値形式であるかのチェック
	 * @param strNum
	 * @return 数値形式である：TRUE 数値形式でない：FALSE
	 */
	private boolean isDigit(String strNum) {  
	    Pattern pattern = Pattern.compile("[0-9]{1,}");  
	    Matcher matcher = pattern.matcher((CharSequence) strNum);  
	    return matcher.matches();  
	}
	
}
