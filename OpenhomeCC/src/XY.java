// https://openhome.cc/Gossip/Java/Array.html

public class XY {
	public static void main(String[] args) {
		int cords[][] = {{1, 2, 3},
				      {4, 5, 6}};
		
		for (int x = 0; x < cords.length; x++)
		{
			for (int y = 0; y < cords[x].length; y++)
			{
				System.out.printf("%2d%c", cords[x][y], (y == cords[x].length - 1)? '\n':' ');
			}
		}
			
	}

}
