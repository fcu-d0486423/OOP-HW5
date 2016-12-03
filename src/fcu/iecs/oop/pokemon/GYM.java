package fcu.iecs.oop.pokemon;
import java.util.Random;
import java.util.Scanner;
public class GYM {

	public static void fight(Pokemon p1,Pokemon p2) {
		// TODO Auto-generated method stub
		int ran;
		
		ran=(int)Math.random()*1;
		
		Scanner type=new Scanner(System.in);
		System.out.println("Enter two pokemon");
		String p11=type.next();
		String p21=type.next();
		if(ran==1)
		{
			System.out.printf("The winner is %s\n",p11);
			System.out.printf("The loser is %s",p21);
			Pokemon.CP(p11);
		}
		else
			System.out.printf("The winner is %s\n",p21);
		    System.out.printf("The loser is %s",p11);
		    Pokemon.CP(p21);
	}

}
