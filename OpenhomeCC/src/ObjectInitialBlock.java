// https://openhome.cc/Gossip/Java/Overload.html  (Overload)
// https://openhome.cc/Gossip/Java/This.html (this)

class Other
{
	{System.out.println("物件初始區塊");}  // {}內指令在constructor之前執行
	
	Other()
	{
		System.out.println("Other() 建構式");
	}
	
	Other(int o)
	{
		this(); // 執行Other()建構式內容
		System.out.println("Other(int o) 建構式");
	}
}


public class ObjectInitialBlock {

	public static void main(String[] args) {
		new Other(1);

	}

}
