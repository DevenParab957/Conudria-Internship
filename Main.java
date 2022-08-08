import java.io.*;

class Main implements Runnable
{
	public static void main(String[] args)
	{
		Main m1 = new Main();
		Thread t1 = new Thread(m1);
		System.out.println(t1.getName());
		t1.start();

	}
	public void run()
	{

	}
}