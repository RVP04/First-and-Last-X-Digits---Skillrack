import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		input = input.replaceFirst("^0*","");
		char[] inputs = input.toCharArray();
		int X = sc.nextInt();
		int inputLength = input.length()-1;
		
		String FirstX = "";
		String SecondX = "";
		
		for(int i=0;i<X;)
		{
		    if(inputs[inputLength]!='0')
		    {
		        SecondX += inputs[inputLength];
		        inputLength--;
		        i++;
		    }
		}
		int temp=0;
		for(int i=0;i<X;temp++)
		{
		        FirstX += inputs[temp];
		        i++;
		}
		
		System.out.println(FirstX);
		System.out.println(new StringBuilder(SecondX).reverse());

	}
}
