package genericUtilities;

import java.util.Random;

public class JavaLibrary {
	
	/**
	 * This method is used to get RandomNumber
	 * @return
	 * @author PranshulSaxena
	 */
	public int getRandomNum(int num)
	{
		Random ran = new Random();
		int ranNum=0;
		for(int i=100; i<1000; i++)
		{
			 ranNum = ran.nextInt(num);
		}
		return ranNum;
	}

}
