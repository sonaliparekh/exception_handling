
public class ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = Integer.parseInt("ABC");	
		}
		catch(NumberFormatException e)
		{
			System.out.println("cannot parse a string in integer format");
		}				
	}

}
