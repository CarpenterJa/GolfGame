import java.util.Scanner;

public class Holes {
	static Scanner input = new Scanner(System.in);
	static int club;
	static int dError;
	static int plusOrMinus;
	static int distance;
	static int xDistance;
	static int yDistance;
	static int holeNumber;
	static int counter;

	public static void clubSelection() {
		System.out.println("Which club would you like to use?");
		LoadGame.printClubs();
		club = input.nextInt() - 1;
	}

	public static void distanceError() {

		plusOrMinus = (int) (Math.random() * 2);
		dError = (int) (Math.random() * 11);
		if (plusOrMinus == 0) {
			distance = Club.club.get(club).getDistance() + dError;
		} else {
			distance = Club.club.get(club).getDistance() - dError;
		}
		yDistance+=distance;
		System.out.println("You hit the ball " + distance + " yards.");

	}

	public static void accuarcyError() {
		int variance;
		int acc;
		int middle;
		if(Club.club.get(club).isFavorite()==true)
		{
			xDistance=Course.course.get(holeNumber-1).getWidth() / 2;
		}
		else
		{
		acc=(int) (Math.random() * (100-Club.club.get(club).getAccuracy()));
		middle=((100-Club.club.get(club).getAccuracy())/2);
		if(acc==middle)
		{
			xDistance=Course.course.get(holeNumber-1).getWidth() / 2;
		}
	
		else if(acc>middle)
		{
			xDistance=(Course.course.get(holeNumber-1).getWidth() / 2) + (acc-middle);
		}
		else
		{
			xDistance=(Course.course.get(holeNumber-1).getWidth() / 2) - (Math.abs(acc-middle));
		}
		}
		

	}

	public static void checkStatus()
	{
		boolean onGreen=false;
		if(((yDistance>=(Course.course.get(holeNumber-1).getLength() - 15)) && (yDistance<=(Course.course.get(holeNumber-1).getLength() + 15))) &&
		   (((xDistance>=(Course.course.get(holeNumber-1).getWidth()/2) - 15)) && (xDistance<=(Course.course.get(holeNumber-1).getWidth()/2) +15)))
			{
				onGreen();
			}
		else if(yDistance>(Course.course.get(holeNumber-1).getLength() + 15) || xDistance<=5 || xDistance>=(Course.course.get(holeNumber-1).getWidth() - 5))
			{
				System.out.println("You are out of bounds. Two stroke penalty. Try again.");
				counter+=2;
			
			}
		else
			{
				
			}
	}
	
	public static void onGreen()
	{
		System.out.println("You are on the green!");
	}

	public static void introduction() {
		System.out.println("Welcome to Windhelm golfcourse!");
		System.out
				.println("Today you will be playing our world renowned 9 hole course.");
		System.out
				.println("On this course you want to keep the ball straight, and it is better to go short then long.");
		System.out.println("Good luck out there " + LoadGame.name + "." + "\n");
	}

	public static void holeOne() {
		holeNumber=1;
		yDistance=0;
		boolean inHole = false;
		counter=0;
		Scorecard.printCard();
		System.out.println("Welcome to the First Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
		}
	}

}
