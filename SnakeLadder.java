
public class SnakeLadder
{			
			// variables and constants
			int position = 0;
			int dieroll;
        void welcome()
        {
                System.out.println("welcome to Snake and Ladder problem.");
        }
		
		void playerposition(int position)
		{
			System.out.println("Player position is "+position);//uc1 showing initial position of player
			dieroll = (int)((Math.floor(Math.random() * 10)) % 6) + 1;	//uc2 genetare Random no between 1 to 6
			System.out.println("you are getting"+dieroll);
		}
        public static void main(String args[])
        {		//object creation
                SnakeLadder s=new SnakeLadder();
                //calling methods
				s.welcome();
				s.playerposition(0);
        }
}


