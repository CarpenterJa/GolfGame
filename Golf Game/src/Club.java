import java.util.ArrayList;

public class Club
	{
		private String name;
		private int distance;
		private int accuracy;
		private boolean favorite;
		
		public Club(String n, int d, int a, boolean f)
		{
			name=n;
			distance=d;
			accuracy=a;
			favorite=f;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}

		public int getDistance()
			{
				return distance;
			}

		public void setDistance(int distance)
			{
				this.distance = distance;
			}

		public int getAccuracy()
			{
				return accuracy;
			}

		public void setAccuracy(int accuracy)
			{
				this.accuracy = accuracy;
			}

		public boolean isFavorite()
			{
				return favorite;
			}

		public void setFavorite(boolean favorite)
			{
				this.favorite = favorite;
			}
		
		static ArrayList<Club>club=new ArrayList<Club>();	
		
		public static void addClub()
		{
			club.add(new Club("Sand", 80, 80, false));
			club.add(new Club("Approach", 110, 78, false));
			club.add(new Club("Pitch", 135, 76, false));
			club.add(new Club("9 Iron", 150, 75, false));
			club.add(new Club("8 Iron", 160, 74, false));
			club.add(new Club("7 Iron", 170, 73, false));
			club.add(new Club("6 Iron", 180, 70, false));
			club.add(new Club("5 Iron", 190, 68, false));
			club.add(new Club("4 Iron", 200, 65, false));
			club.add(new Club("Hybrid", 210, 70, false));
			club.add(new Club("5 Wood", 220, 62, false));
			club.add(new Club("3 Wood", 240, 60, false));
			club.add(new Club("Driver", 260, 50, false));
			
		
		}

	}
