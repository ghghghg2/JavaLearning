// https://openhome.cc/Gossip/Java/Interface.html (Interface) 多種東西同時擁有一種性質 (ex. 魚、人類、潛水艇皆會 游泳)
// https://openhome.cc/Gossip/Java/Polymorphism-interface.html


public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));

	}
	
	public static void doSwim(Swimmer swimmer)
	{
		swimmer.swim();
	}

}


interface Swimmer // 給所有有游泳特性的類別使用
{
	public abstract void swim();
}

abstract class Fish implements Swimmer
{
	protected String name;
	public Fish(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	@Override // keep abstract 
	public abstract void swim();
}

class Anemonefish extends Fish {
	   public Anemonefish(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("小丑魚 %s 游泳%n", name);
	    }
	}

class Shark extends Fish {
	   public Shark(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("鯊魚 %s 游泳%n", name);
	    }
	}

class Human implements Swimmer
{
	protected String name;
	public Human(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void swim()
	{
		System.out.printf("人類 %s 游泳%n", this.name);
	}
}

class Submarine implements Swimmer {
    private String name;
    public Submarine(String name) {
        this.name = name;
    }    
    public String getName() {
        return name;
    }
    
    @Override
    public void swim() {
        System.out.printf("潛水艇 %s 潛行%n", name);
    }
}