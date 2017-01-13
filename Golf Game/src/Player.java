import java.util.ArrayList;

public class Player
	{
		private String name;
		private int power;
		private int accuracy;
		private int putting;
		private boolean temper;
		
		public Player(String n, int p, int a, int pu, boolean t) {
			name=n;
			power=p;
			accuracy=a;
			putting=pu;
			temper=t;
			
		}
		
		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getPower()
			{
				return power;
			}

		public void setPower(int power)
			{
				this.power = power;
			}

		public int getAccuracy()
			{
				return accuracy;
			}

		public void setAccuracy(int accuracy)
			{
				this.accuracy = accuracy;
			}

		public int getPutting()
			{
				return putting;
			}

		public void setPutting(int putting)
			{
				this.putting = putting;
			}

		public boolean isTemper()
			{
				return temper;
			}

		public void setTemper(boolean temper)
			{
				this.temper = temper;
			}

		static ArrayList<Player> player=new ArrayList<Player>();
		
		public static void addPlayers()
			{
				player.add(new Player("Name", 0, 0, 0, false));
				
			}

	}
