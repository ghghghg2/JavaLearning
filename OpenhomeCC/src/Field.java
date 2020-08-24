// https://openhome.cc/Gossip/Java/Class.html

class Clothes{
	String color;
	char size;
	Clothes(String color, char size)
	{
		this.color = color;
		this.size = size;
	}	
}

public class Field {

	public static void main(String[] args) {
		Clothes sun = new Clothes("red", 'S');
		Clothes spring = new Clothes("green", 'M');
		
		System.out.printf("sun (%s, %c)\n", sun.color, sun.size);
		System.out.printf("sun (%s, %c)\n", spring.color, spring.size);
		
	}

}