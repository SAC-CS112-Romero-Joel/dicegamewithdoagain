package dicegamewithplaygain;

import java.util.Scanner;

public class doagain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
int playa;
do
{
		
double Roll, Odd =1, Even=2, Guess,play; 
				
				
		
Roll = 1 + (int) ( Math.random() * 6);

System.out.println("Roll The dice Y=1 or N=2 ");
play =input.nextInt();

if (play==1)
	
{	


System.out.println("Guess if its Odd press (1)  or Even press (2)");
 Guess = input.nextInt();
	
 
if (Roll == 1)
{
if (Guess== 1)
{
System.out.println("Congrats you chose odd and the number was "+ Roll);
}
else
{		
System.out.println("You guessed Even You lose the Number was"+ Roll);
}
}
else if (Roll == 2)
{
if (Guess== 2)
{
System.out.println("Congrats you chose even and the number was "+Roll);
}
else
{		
System.out.println("You guessed odd You lose the number was "+ Roll);
}
}	 
 
else if (Roll == 3)
{
if (Guess== 1)
{
System.out.println("Congrats you chose odd and the number was "+ Roll);
}
else
{		
System.out.println("You guessed even You lose the number was "+Roll);
}
}	 
else if (Roll == 4)
{
if (Guess== 2)
{
System.out.println("Congrats you chose even and the number was "+Roll);
}
else
{		
System.out.println("You guessed odd You lose the number was " + Roll);
}
}	 
else if (Roll == 5)
{
if (Guess== 1)
{
System.out.println("Congrats you chose odd and the number was "+ Roll);
}
else
{		
System.out.println("You guessed even You lose the number was "+ Roll);
}
}	 

else if (Roll == 6)
{
if (Guess== 2)
{
System.out.println("Congrats you chose even and the number was "+ Roll);
}
else
{		
System.out.println("You guessed odd You lose the number was " +Roll);
}
}	 
}
else 
{ 
	System.out.print("Please exit ");
}


System.out.println("want to Play Agian Enter 3 for yes and 4 for no");
 playa = input.nextInt();
} while ( playa == 3 );


	}

}
