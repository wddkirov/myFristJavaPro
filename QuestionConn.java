import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;  

public class QuestionConn {

	/**
	 * メインメソッド
	 * キーボードから入力された10個の整数を逆の順序で出力
	 * @author mu
	 * @param args
	 * @return none
	 */
	public static void main(String[] args) {
			
		try {  
			List<String> strForSort=new ArrayList<String>();
			System.out.print("10個の整数を入力してください\n");  
			
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in)); 
            int i=0;
            do {
            	System.out.print(Integer.toString(i+1)+"個目：");  
            	String str0=strin.readLine();
            	if(str0.equals(""))
            	{
            		break;
            	}
            	else
            	{
            		strForSort.add(i, str0); 
                	i++;
            	}
            	
			} while (i<10);
            
            SortIntArr sArr =new SortIntArr(strForSort);
                     
            System.out.print("\n降順に並び替えた結果：\n");  
            
            for(int j=0;j<sArr.GetSortedList().size();j++)
            {
                 System.out.print(sArr.GetSortedList().get(j)+"\n");
            }
                      
        } catch (NullPointerException e) {  
        	e.printStackTrace();
        }  
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}