
public class Scorecard
	{
		public static void printCard()
		{
			System.out.println("Hole    |  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |");
			System.out.println("Yardage | 430 | 390 | 115 | 600 | 422 | 440 | 195 | 565 | 370 |");
			System.out.println("Par     |  4  |  4  |  3  |  5  |  4  |  4  |  3  |  5  |  4  |");
			System.out.println("Score   |  " + Course.course.get(0).getScore() + "  |  " + Course.course.get(1).getScore() + "  |  " + Course.course.get(2).getScore() + "  |  " + Course.course.get(3).getScore() + "  |  " + Course.course.get(4).getScore() + "  |  " + Course.course.get(5).getScore() + "  |  " + Course.course.get(6).getScore() + "  |  " + Course.course.get(7).getScore() + "  |  " + Course.course.get(8).getScore() + "  |  " + "\n");
		}

	}
