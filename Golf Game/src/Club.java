import java.util.ArrayList;

public class Club
	{
		private String name;
		private int distance;
		private double accuracy;
		private boolean favorite;
		
		public Club(String n, int d, double a, boolean f)
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

		public double getAccuracy()
			{
				return accuracy;
			}

		public void setAccuracy(double accuracy)
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
			club.add(new Club("Sand", 80, 80.0, false));
			club.add(new Club("Approach", 110, 78.0, false));
			club.add(new Club("Pitch", 135, 76.0, false));
			club.add(new Club("9 Iron", 150, 75.0, false));
			club.add(new Club("8 Iron", 160, 74.0, false));
			club.add(new Club("7 Iron", 170, 73.0, false));
			club.add(new Club("6 Iron", 180, 70.0, false));
			club.add(new Club("5 Iron", 190, 68.0, false));
			club.add(new Club("4 Iron", 200, 65.0, false));
			club.add(new Club("Hybrid", 210, 70.0, false));
			club.add(new Club("5 Wood", 220, 62.0, false));
			club.add(new Club("3 Wood", 240, 60.0, false));
			club.add(new Club("Driver", 260, 50.0, false));
			
		
		}

	}
