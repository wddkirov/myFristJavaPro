import java.util.*;
import java.util.regex.*;

/**
 * �������X�g�̐��m�����`�F�b�N��A���̕��я����t�ɂ��郊�X�g���쐬
 * @author mu
 */
public class SortIntArr {
	/**
	 * private�ϐ�
	 * �������X�g
	 */
	private List<String> _strForSort=new ArrayList<String>();
	
	/**
	 * SortIntArr�̃R���X�g���N�^���\�b�h
	 * @param listStr, not {@code null}
	 * @return void
	 */
	public SortIntArr(List<String> listStr)
	{
		_strForSort=listStr;
		CheckIntList(_strForSort);
		
	}
	
	/**
	 * ���X�g�Ɋi�[�����v�f�������^�ł��邩���`�F�b�N
	 * ���X�g���я����t�ɂ��郊�X�g���쐬
	 * @param listStr, not {@code null}
	 * @return void
	 * @exception �n��p�����[�^listStr�������ȊO�̗v�f������ꍇ�AllegalArgumentException����������
	 */
	private void CheckIntList(List<String> listStr)
	{
		if(listStr.size()<=0)
		{
			throw new IllegalArgumentException("1�ȏ�̐����̌`�œ��͂��Ă��������I");
		}
		int i=1;
		for (String str : listStr) {
			if(!isDigit(str))
			{
				throw new IllegalArgumentException(Integer.toString(i)+"�ڂ͐����̌`�œ��͂��Ă��������I");
			}
			i++;
		}	
		Collections.reverse(_strForSort);
	}
	
	/**
	 * ���я����t�ɂ��ꂽ��̃��X�g���擾
	 * @return ���я����t�ɂ��ꂽ��̃��X�g
	 */
	public List<String> GetSortedList()
	{
		return _strForSort;
	}
	
	
	/**
	 * �����񂪐��l�`���ł��邩�̃`�F�b�N
	 * @param strNum
	 * @return ���l�`���ł���FTRUE ���l�`���łȂ��FFALSE
	 */
	private boolean isDigit(String strNum) {  
	    Pattern pattern = Pattern.compile("[0-9]{1,}");  
	    Matcher matcher = pattern.matcher((CharSequence) strNum);  
	    return matcher.matches();  
	}
	
}
