import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;  

public class QuestionConn {

	/**
	 * ���C�����\�b�h
	 * �L�[�{�[�h������͂��ꂽ10�̐������t�̏����ŏo��
	 * @author mu
	 * @param args
	 * @return none
	 */
	public static void main(String[] args) {
			
		try {  
			List<String> strForSort=new ArrayList<String>();
			System.out.print("10�̐�������͂��Ă�������\n");  
			
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in)); 
            int i=0;
            do {
            	System.out.print(Integer.toString(i+1)+"�ځF");  
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
                     
            System.out.print("\n�~���ɕ��ёւ������ʁF\n");  
            
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