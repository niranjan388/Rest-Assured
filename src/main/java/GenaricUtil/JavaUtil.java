package GenaricUtil;
import java.util.Random;

public class JavaUtil
{
	public int GetRandomNumber()
	{
		Random ran=new Random();
		return ran.nextInt(1000);
	}

	public int Convertstringtoint(String number)
	{
		return  Integer.parseInt(number);
	

	}
	
	
}


