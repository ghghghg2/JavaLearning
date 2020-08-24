// https://openhome.cc/Gossip/Java/Variable-lengthArgument.html (���w���פ޼�)
// (Compiler sugar�^

class MathTool
{
	static int sum(int... numbers)
	{
		int sum = 0;
		for (int number : numbers)
		{
			sum += number;
		}
		return sum;
	}
}



public class VariableLengthArg {

	public static void main(String[] args) {
		System.out.println(MathTool.sum(1, 2));
		System.out.println(MathTool.sum(1, 2, 3));
		System.out.println(MathTool.sum(1, 2, 3, 4));
	}

}