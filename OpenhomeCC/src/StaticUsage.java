// https://openhome.cc/Gossip/Java/Static.html  (static)

class Ball
{
	double radius;
	static final double PI = 3.141596;
	static double toRadians(double angdeg)
	{
		return angdeg * (Ball.PI / 180);
	}
}

public class StaticUsage {
	public static void main(String[] args)
	{
		// �����z�L���O�W��(�D����)�ϥ�static�ܼƩΤ�k
		System.out.println(Ball.toRadians(180.));
	}

}
