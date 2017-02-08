import java.util.Scanner;

public class Holes
	{
		static Scanner input = new Scanner(System.in);
		static int club;
		public static int dError;
		public static int plusOrMinus;
		public static int distance;
		public static void clubSelection()
			{
				System.out.println("Which club would you like to use?");
				LoadGame.printClubs();
				club = input.nextInt() - 1;
			}
		public static void distanceError()
		{
			plusOrMinus=(int)Math.random() * 2;
			dError=(int)Math.random() * 11;
		}
		
		public static void accuaryError()
		{
			
		}

		public static void introduction()
			{
				System.out.println("Welcome to Windhelm golfcourse!");
				System.out.println("Today you will be playing our world renowned 9 hole course.");
				System.out.println(
						"On this course you want to keep the ball straight, and it is better to go short then long.");
				System.out.println("Good luck out there " + LoadGame.name + "." + "\n");
			}

		public static void holeOne()
			{
				boolean inHole = false;
				int counter=0;
				Scorecard.printCard();
				System.out.println("Welcome to the First Hole.");
				while(inHole==false)
			    counter++;
				clubSelection();
				distanceError();
				if(plusOrMinus==0)
					{
				    distance=Club.club.get(club).getDistance() + dError; 
					}
				else
					{
					distance=Club.club.get(club).getDistance() - dError; 
					}
			}

	}
