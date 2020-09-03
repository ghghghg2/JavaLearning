// https://openhome.cc/Gossip/Java/Interface.html (Interface) �h�تF��P�ɾ֦��@�ةʽ� (ex. ���B�H���B������ҷ| ��a)
// https://openhome.cc/Gossip/Java/Polymorphism-interface.html


public class Ocean {

	public static void main(String[] args) {
		doSwim(new Anemonefish("����"));
        doSwim(new Shark("����"));
        doSwim(new Human("�봵��"));
        doSwim(new Submarine("����@��"));

	}
	
	public static void doSwim(Swimmer swimmer)
	{
		swimmer.swim();
	}

}


interface Swimmer // ���Ҧ�����a�S�ʪ����O�ϥ�
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
	        System.out.printf("�p���� %s ��a%n", name);
	    }
	}

class Shark extends Fish {
	   public Shark(String name) {
	       super(name);
	   }
	    @Override
	    public void swim() {
	        System.out.printf("�T�� %s ��a%n", name);
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
		System.out.printf("�H�� %s ��a%n", this.name);
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
        System.out.printf("����� %s ���%n", name);
    }
}