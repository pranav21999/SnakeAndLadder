
public class SnakeLadder
{
			int position = 0;

        void welcome()
        {
                System.out.println("welcome to Snake and Ladder problem.");
        }
		void playerposition(int position)
		{
			System.out.println("Player position is "+position);			
		}
        public static void main(String args[])
        {
                SnakeLadder s=new SnakeLadder();
                s.welcome();
				s.playerposition(0);
        }
}


