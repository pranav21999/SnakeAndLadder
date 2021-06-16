public class SnakeLadder
{			
			// variables and constants
			int position = 0;
			int dieroll,choice;		
			//uc 3 condition of no_play,snake and ladder
			final int noplay=1;
			final int snake=2;
			final int ladder=3;
			final int win=100;
			
        void welcome()
        {
                System.out.println("welcome to Snake and Ladder problem.");
        }
		
		void playerposition(int position)
		{
			System.out.println("Player position is "+position);//uc1 showing initial position of player
			dieroll = (int)((Math.floor(Math.random() * 10)) % 6) + 1;	//uc2 genetare Random no between 1 to 6
			//System.out.println("you are getting"+dieroll);
			choice = (int)((Math.floor(Math.random() * 10)) % 3) + 1;	//uc2 genetare Random no between 1 to 6
			
			//uc 3 cheching condion for noplay,snake,ladder
			if (choice == noplay)
			{
				System.out.println("Player stay" + position +"in current position");
				
			}
			else if (choice == ladder)
			{
				position=position+dieroll;
				if (position > win)
				{
					position=position-dieroll;
				}
				System.out.println("player moves:"+dieroll);
				System.out.println("player current position:"+position);
			}	
			if(position == win)
			{
				System.out.println("player moves:"+dieroll);
				System.out.println("player current position:"+position);
				System.out.println("Player win");
			}
			else if (choice == snake)
			{
				position=position-dieroll;
				if(position < 0)
				{
					position=0;
				}
			}			
		}
        public static void main(String args[])
        {		//object creation
                SnakeLadder s=new SnakeLadder();
                //calling methods
				s.welcome();
				s.playerposition(0);
        }
}


