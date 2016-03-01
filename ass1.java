
public class ass1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = i;
		}
		for(int i=0;i<11;i++)
		{
			try{
				System.out.println(arr[i]);
			}
			catch( ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exceeded value");
			}
		}
	}

}
