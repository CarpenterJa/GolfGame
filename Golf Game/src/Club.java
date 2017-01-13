import java.util.ArrayList;

public class Club
	{
		private String name;
		private double distance;
		private double accuracy;
		private boolean favorite;
		
		public Club(String n, double d, double a, boolean f)
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

		public double getDistance()
			{
				return distance;
			}

		public void setDistance(double distance)
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
			club.add(new Club("Sand", 80.0, 80.0, false));
			club.add(new Club("Approach", 110.0, 78.0, false));
			club.add(new Club("Pitch", 135.0, 76.0, false));
			club.add(new Club("9 Iron", 150.0, 75.0, false));
			club.add(new Club("8 Iron", 160.0, 74.0, false));
			club.add(new Club("7 Iron", 170.0, 73.0, false));
			club.add(new Club("6 Iron", 180.0, 70.0, false));
			club.add(new Club("5 Iron", 190.0, 68.0, false));
			club.add(new Club("4 Iron", 200.0, 65.0, false));
			club.add(new Club("Hybrid", 210.0, 70.0, false));
			club.add(new Club("5 Wood", 220.0, 62.0, false));
			club.add(new Club("3 Wood", 240.0, 60.0, false));
			club.add(new Club("Driver", 260.0, 50.0, false));
			
		
		}

	}
