// https://openhome.cc/Gossip/Java/For-While.html

public class NineNineTable {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				System.out.printf("%d*%d=%d%c", j, i, j * i, (j == 9? '\n':'\t'));			
			}		
		}

	}

}
