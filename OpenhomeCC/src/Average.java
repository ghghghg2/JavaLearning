// https://openhome.cc/Gossip/Java/String.html


public class Average {

	public static void main(String[] args) {
		long sum = 0;
		for (String arg : args)
		{
			sum += Long.parseLong(arg);
		}
		System.out.printf("Average: %.2f", (float) sum / args.length);

	}

}
