/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_10533461;

/**
 *
 * @author SERWABA
 */
import java.util.Random;

public class FickerPhase
{
	public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
		
		for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			if(r==1)
                        {
                            first();
                        }
                       else if(r==2)
                        {
                            second();
                        }
                        else if(r==3)
                        {
                            third();
                        }
			else if(r==4)
                        {
                            fourth();
                        }
                        else if(r==5)
                        {
                            fifth();
                        }

			
		}

		System.out.println("I pledge allegiance to the flag.");
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
	}
}

