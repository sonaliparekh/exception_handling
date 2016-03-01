
public class ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Sonali";
try{

	System.out.println("Value at index 0 "+str.charAt(0));
	System.out.println("value at index 10"+str.charAt(15));
	
}
catch(StringIndexOutOfBoundsException e)
{
	System.out.println("String index out of bound");
}



	}

}
