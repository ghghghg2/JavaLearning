// https://openhome.cc/Gossip/Java/EncapsulatePrivateMember.html

class CashCard {
	// Field
	private String number;
	private int balance;
	private int bonus;
	
	// Constructor
	CashCard(String number, int balance, int bonus)
	{
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	void store(int money) 
	{
		if (money > 0)
		{
			this.balance += money;
			if (money >= 1000)
			{
				this.bonus++;
			}
		}
		else
		{
			System.out.println("儲值必須為正整數");
		}
	}
	
	void charge(int money)
	{
		if (money > 0)
		{
			if (money > this.balance)
			{
				System.out.println("餘額不足");
			}
			else // charge <= balance
			{
				this.balance -= money;
			}
		}
		else // negative charge
		{
			System.out.println("扣款必須為正整數");
		}
	}
	
	int exchange(int bonus)
	{
		if (bonus > 0 && bonus <= this.bonus)
		{
			this.bonus -= bonus;
		}
		
		return this.bonus;
	}
	
	String getNumber() // get the number (private)
	{
		return this.number;
	}
	
	int getBalance() // get the balance (private)
	{
		return this.balance;
	}
	
	int getBonus() // get the bonus (private)
	{
		return this.bonus;
	}
}
