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
			System.out.println("�x�ȥ����������");
		}
	}
	
	void charge(int money)
	{
		if (money > 0)
		{
			if (money > this.balance)
			{
				System.out.println("�l�B����");
			}
			else // charge <= balance
			{
				this.balance -= money;
			}
		}
		else // negative charge
		{
			System.out.println("���ڥ����������");
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
