import java.util.Scanner;
public class ModulusQuizzer
	{
//test
		public static void main(String[] args)
			{
			int counter=0;
			System.out.println("how many questions do you want to ask");
			Scanner userInput = new Scanner(System.in);
			
				
			int x= userInput.nextInt();
			for(int i=0;i<x;i++)
				{
				int rn1 = (int)(Math.random()*5) + 1;
				int rn2 = (int)(Math.random()*5) + 1;
				System.out.println(rn1 +" % " + rn2 + "=" +"?");
				
				
			Scanner userInput1 = new Scanner(System.in);
				int A=userInput1.nextInt();
				if (rn1%rn2==A)
					{
					System.out.println("correct");
				counter++;
					}
				else
				    System.out.println("incorrect");
				
				}
			System.out.println("you got " + counter + " correct ");
			System.out.println("that is a " + counter%x + "%");
			}

	}
