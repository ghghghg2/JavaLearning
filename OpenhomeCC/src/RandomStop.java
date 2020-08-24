// https://openhome.cc/Gossip/Java/For-While.html

public class RandomStop {

	public static void main(String[] args) {
		int num = 0;
		do {
			num = (int)(Math.random() * 10);
			System.out.println(num);
		}while(num != 5);
		
		System.out.println("I hit 5 ... Orz");

	}

}
