// https://openhome.cc/Gossip/Java/Overload.html  (Overload)
// https://openhome.cc/Gossip/Java/This.html (this)

class Other
{
	{System.out.println("�����l�϶�");}  // {}�����O�bconstructor���e����
	
	Other()
	{
		System.out.println("Other() �غc��");
	}
	
	Other(int o)
	{
		this(); // ����Other()�غc�����e
		System.out.println("Other(int o) �غc��");
	}
}


public class ObjectInitialBlock {

	public static void main(String[] args) {
		new Other(1);

	}

}
