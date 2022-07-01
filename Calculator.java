import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n1, n2;
		int ans=1, c=0;
		char choice;
		
		do
		{
			System.out.println("a.Addition\tb.Subtraction\tc.Multiplication\td.Division\te.Exit");
			System.out.println("Enter your choice:");
			choice = s.next().charAt(0);
			
			switch(choice)
			{
			case 'a':
				System.out.println("Enter any two numbers: ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				c = n1 + n2;
				System.out.println(n1+"+"+n2+"="+c);
				break;
				
			case 'b':
				System.out.println("Enter any two numbers: ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				if(n1>n2)
				{
					c = n1 - n2;
					System.out.println(n1+"-"+n2+"="+c);
				}
				else
				{
					c = n2 - n1;
					System.out.println(n2+"-"+n1+"="+c);
				}
				break;
				
			case 'c':
				System.out.println("Enter any two numbers: ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				c = n1 * n2;
				System.out.println(n1+"*"+n2+"="+c);
				break;
				
			case 'd':
				System.out.println("Enter any two numbers: ");
				n1 = s.nextInt();
				n2 = s.nextInt();
				
				if(n2==0)
				{
					System.out.println("Denominator should not be zero");
				}
				else
				{
					c = n1 / n2;
					System.out.println(n1+"/"+n2+"="+c);
				}
				break;
				
			case 'e':
				System.exit(0);
				break;
				
			default:
				System.out.println("WRONG CHOICE");
			}
			System.out.println("DO YOU WANT TO CONTINUE(1/0)?");
			ans = s.nextInt();
                         System.out.println("Done");
		}
		while(ans!=0);
	}
}
