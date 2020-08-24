// https://openhome.cc/Gossip/Java/Inheritance.html (繼承)
// https://openhome.cc/Gossip/Java/Polymorphism-is-a.html (多形)
// https://openhome.cc/Gossip/Java/Override.html (Override)

public class RPG {

	public static void main(String[] args) {
		
		SwordsMan swordsMan = new SwordsMan();
        swordsMan.setName("Justin");
        swordsMan.setLevel(1);
        swordsMan.setBlood(200);

        Magician magician = new Magician();
        magician.setName("Monica");
        magician.setLevel(1);
        magician.setBlood(100);
        
		demoSwordsMan();
		demoMagician();
		
		showBlood(swordsMan);
		showBlood(magician);
		
		drawFight(swordsMan);
		drawFight(magician);

	}
	
	static void demoSwordsMan()
	{
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("劍士 (%s, %d, %d)\n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
	}
	
	static void demoMagician()
	{
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("魔法師 (%s, %d, %d)\n", magician.getName(), magician.getLevel(), magician.getBlood());
	}
	
	static void showBlood(Role role)  // polymorphism : swordsMan is-a role, magician is-a role
	{
		System.out.printf("%s 血量  %d\n", role.getName(), role.getBlood());
	}
	
	static void drawFight(Role role)
    {
    	System.out.print(role.getName());
        role.fight();
    }

}


class Role 
{
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
    
    public void fight()
    {
    	// 子類別要重新定義fight()的實際行為 (override)
    }
    
    
}


class SwordsMan extends Role
{
	public void fight()
	{
		System.out.println("揮劍攻擊");
	}
}

class Magician extends Role
{
	@Override
	public void fight()
	{
		System.out.println("魔法攻擊");
	}
	
	public void cure()
	{
		System.out.println("魔法治療");
	}
}