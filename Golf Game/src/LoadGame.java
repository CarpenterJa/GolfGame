import java.util.Scanner;

public class LoadGame
	{
		static String name;

		public static void printClubs()
			{
				int counter = 0;
				for (Club c : Club.club)
					{
						counter++;
						System.out.println(counter + ") " + c.getName());
					}
			}

		public static void loadGame()
			{
				Scanner user = new Scanner(System.in);
				System.out.println("Welcome to my Golf Game!");
				System.out.println("Would you like to play?" + "\n" + "1) Yes" + "\n" + "2) No");
				int decision = user.nextInt();
				System.out.println();
				if (decision == 1)
					{
						System.out.println("Welcome!");
						System.out.println("What is your name?");
						name = user.next();
						Player.player.get(0).setName(name);
						System.out.println();
						System.out.println(
								name + " do you have a temper when you play golf?" + "\n" + "1) Yes" + "\n" + "2) No");
						int rage = user.nextInt();
						System.out.println();
						if (rage == 1)
							{
								Player.player.get(0).setTemper(true);
								
								System.out.println("That is not going to help you on the golf course.");
							} else
							{
								
								System.out.println("Way to keep your control on the course.");
							}
						System.out.println();
						System.out.println("What is your favorite golf club?");
						printClubs();
						int favClub = user.nextInt() - 1;
						Club.club.get(favClub).setFavorite(true);
						Club.club.get(favClub).setAccuracy(100);
						System.out.println("The old trustie " + Club.club.get(favClub).getName() + ".");
						System.out.println();

					}

				else
					{
						System.out.println("You are missing out.");
						System.exit(0);
					}
			}

	}
