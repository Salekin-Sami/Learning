public class ModulusAnimationWorm
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<80; i++ )
		{
			if ( i%16 == 0 )
				System.out.print(" ABCDEFGH                \r");
			else if ( i%16 == 1 )
				System.out.print("   IJKLMNO               \r");
			else if ( i%16 == 2 )
				System.out.print("     PQRSWXYZ             \r");
			else if ( i%16 == 3 )
				System.out.print("       12345           \r");
			else if ( i%16 == 4 )
				System.out.print("         67890         \r");
			else if ( i%16 == 5 )
				System.out.print("           HELLO SAMI       \r");
			else if ( i%16 == 6 )
				System.out.print("             IDK WHAT IM DOING     \r");
			else if ( i%16 == 7 )
				System.out.print("               RAW CODING   \r");
			else if ( i%16 == 8 )
				System.out.print("                 ******** \r");
			else if ( i%16 == 9 )
				System.out.print("               ********   \r");
			else if ( i%16 == 10 )
				System.out.print("             ********     \r");
			else if ( i%16 == 11 )
				System.out.print("           ********       \r");
			else if ( i%16 == 12 )
				System.out.print("         ********         \r");
			else if ( i%16 == 13 )
				System.out.print("       ********           \r");
			else if ( i%16 == 14 )
				System.out.print("     ********             \r");
			else if ( i%16 == 15 )
				System.out.print("   ********               \r");

			Thread.sleep(200);
		}
		
	}
}
