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
	static boolean inHole;
	static int acc;
	static int middle;

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
		yDistance += distance;
		System.out.println("You hit the ball " + distance + " yards.");

	}

	public static void accuarcyError() {
		if (Club.club.get(club).isFavorite() == true) {
			xDistance = Course.course.get(holeNumber - 1).getWidth() / 2;

		} else {
			acc = (int) (Math.random() * (100 - Club.club.get(club)
					.getAccuracy()));
			middle = ((100 - Club.club.get(club).getAccuracy()) / 2);
			if (acc == middle) {
				xDistance = Course.course.get(holeNumber - 1).getWidth() / 2;

			}

			else if (acc > middle) {
				xDistance = (Course.course.get(holeNumber - 1).getWidth() / 2)
						+ (acc - middle);

			} else {
				xDistance = (Course.course.get(holeNumber - 1).getWidth() / 2)
						- (Math.abs(acc - middle));

			}
		}

	}

	public static void checkStatus() {

		if (((yDistance >= (Course.course.get(holeNumber - 1).getLength() - 15)) && (yDistance <= (Course.course
				.get(holeNumber - 1).getLength() + 15)))
				&& (((xDistance >= (Course.course.get(holeNumber - 1)
						.getWidth() / 2) - 15)) && (xDistance <= (Course.course
						.get(holeNumber - 1).getWidth() / 2) + 15))) {
			onGreen();
		} else if (yDistance > (Course.course.get(holeNumber - 1).getLength() + 15)
				|| xDistance <= 5
				|| xDistance >= (Course.course.get(holeNumber - 1).getWidth() - 5)) {
			System.out
					.println("You are out of bounds. Two stroke penalty. Try again.");
			yDistance -= distance;
			xDistance = (Course.course.get(holeNumber - 1).getWidth() / 2);
			counter += 2;

		} else if (yDistance > (Course.course.get(holeNumber - 1).getLength() - 80)) {
			inHole = true;
			counter++;
			System.out
					.println("You are less then 80 yards out. You chip the ball and make it on the green.");
			if (Player.player.get(0).isTemper() == true) {
				counter = counter + 2;
				System.out.println("Your temper gets to you and you two putt.");
			} else {
				counter++;
				System.out.println("You keep your cool and one putt.");
			}

		}

		else {
			System.out
					.println("You are "
							+ (Course.course.get(holeNumber - 1).getLength() - yDistance)
							+ " yards from the hole.");
			if (acc == middle) {
				System.out.println("You are in the middle of the fairway.");

			}

			else if (acc > middle) {
				System.out.println("You are " + (xDistance - middle)
						+ " yards right of the middle of the fairway.");

			} else {
				System.out.println("You are " + Math.abs(middle - xDistance)
						+ " yards left of the middle of the fairway.");

			}
		}
	}

	public static void onGreen() {
		inHole = true;
		System.out.println("You are on the green!");
		if (acc == middle
				&& yDistance == Course.course.get(holeNumber - 1).getLength()) {
			System.out.println("You hit it right in the hole!!!");
		} else if (((yDistance >= (Course.course.get(holeNumber - 1)
				.getLength() - 5)) && (yDistance <= (Course.course.get(
				holeNumber - 1).getLength() + 5)))
				&& (((xDistance >= (Course.course.get(holeNumber - 1)
						.getWidth() / 2) - 5)) && (xDistance <= (Course.course
						.get(holeNumber - 1).getWidth() / 2) + 5))) {
			counter++;
			System.out.println("You one putted the hole.");
		} else if (((yDistance >= (Course.course.get(holeNumber - 1)
				.getLength() - 10)) && (yDistance <= (Course.course.get(
				holeNumber - 1).getLength() + 10)))
				&& (((xDistance >= (Course.course.get(holeNumber - 1)
						.getWidth() / 2) - 10)) && (xDistance <= (Course.course
						.get(holeNumber - 1).getWidth() / 2) + 10))) {
			counter = counter + 2;
			System.out.println("You two putted the hole.");
		} else {
			counter = counter + 3;
			System.out.println("You three putted the hole.");

		}

	}

	public static void score() {
		if (counter == Course.course.get(holeNumber - 1).getPar()) {
			System.out.println("You got a par.");
		} else if (counter == (Course.course.get(holeNumber - 1).getPar() + 1)) {
			System.out.println("You got a bogey.");
		} else if (counter == (Course.course.get(holeNumber - 1).getPar() + 2)) {
			System.out.println("You got a double bogey.");
		} else if (counter == (Course.course.get(holeNumber - 1).getPar() + 3)) {
			System.out.println("You got a triple bogey.");
		} else if (counter == (Course.course.get(holeNumber - 1).getPar() - 1)) {
			System.out.println("You got a birdie.");
		} else if (counter == (Course.course.get(holeNumber - 1).getPar() + 1)) {
			System.out.println("You got an eagle.");
		} else {
			System.out.println("You got a " + counter + " on the hole.");
		}
		Course.course.get(holeNumber - 1).setScore(counter);
		Scorecard.printCard();
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
		holeNumber = 1;
		yDistance = 0;
		inHole = false;
		counter = 0;
		Scorecard.printCard();
		System.out.println("Welcome to the First Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeTwo() {
		holeNumber = 2;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Second Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeThree() {
		holeNumber = 3;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Third Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeFour() {
		holeNumber = 4;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Fourth Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeFive() {
		holeNumber = 5;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Fifth Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeSix() {
		holeNumber = 6;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Sixth Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeSeven() {
		holeNumber = 7;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Seventh Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeEight() {
		holeNumber = 8;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Eigth Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

	public static void holeNine() {
		holeNumber = 9;
		yDistance = 0;
		inHole = false;
		counter = 0;

		System.out.println("Welcome to the Ninth Hole.");
		while (inHole == false) {
			counter++;
			clubSelection();
			distanceError();
			accuarcyError();
			checkStatus();

		}
		score();
	}

}
