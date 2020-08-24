// https://openhome.cc/Gossip/Java/Inheritance.html 

public class RPG {

	public static void main(String[] args) {
		RPG.demoSwordsMan();
		RPG.demoMagician();
		

	}
	
	static void demoSwordsMan()
	{
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("�C�h (%s, %d, %d)\n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
	}
	
	static void demoMagician()
	{
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("�]�k�v (%s, %d, %d)\n", magician.getName(), magician.getLevel(), magician.getBlood());
	}

}


class Role {
    private String name;
    private int level;
    private int blood;
    
    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class SwordsMan extends Role
{
	void fight()
	{
		System.out.println("���C����");
	}
}

class Magician extends Role
{
	void fight()
	{
		System.out.println("�]�k����");
	}
	
	void cure()
	{
		System.out.println("�]�k�v��");
	}
}