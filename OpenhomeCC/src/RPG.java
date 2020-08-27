// https://openhome.cc/Gossip/Java/Inheritance.html (繼承)
// https://openhome.cc/Gossip/Java/Polymorphism-is-a.html (多形)
// https://openhome.cc/Gossip/Java/Override.html (Override)
// https://openhome.cc/Gossip/Java/Protected.html (protected - 可以被子類別存取(不須透過父類別的方法))
// https://openhome.cc/Gossip/Java/OverrideSyntax.html (使用super呼叫父類別中被override的方法)

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
		System.out.printf(swordsMan.toString());
	}
	
	static void demoMagician()
	{
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf(magician.toString());
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
    protected String name;
    protected int level;
    protected int blood;
    
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
    
    
    // to be override
    public String toString() 
    {
    	return String.format("(%s, %d, %d)\n", this.name, this.level, this.blood);
    }
    
    
}


class SwordsMan extends Role
{
	@Override
	public void fight()
	{
		System.out.println("揮劍攻擊");
	}
	
	@Override
	public String toString()
	{
		return "劍士" + super.toString();
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
	
	@Override
	public String toString()
	{
		return "魔法師" + super.toString();
	}
}