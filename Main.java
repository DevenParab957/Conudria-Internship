import java.io.*;

class Mulithread extends Thread
{
	@Override public  void run()
	{
		System.out.println("Thread name is : ");
		System.out.println(Thread.currentThread().getName());
	}

}

class Main
{
	public static void main(String[] args)
	{
		Mulithread t1 = new Mulithread();
		t1.start();
	}
}