class HelloAllRunnable implements Runnable
{  
	public void run()
{  
	System.out.println("Hello India");  
}  
  
public static void main(String args[])
{  
	HelloAllRunnable m1=new HelloAllRunnable();  
	Thread t1 =new Thread(m1);
	HelloAllRunnable m2=new HelloAllRunnable();  
	Thread t2 =new Thread(m2);
	HelloAllRunnable m3=new HelloAllRunnable();  
	Thread t3 =new Thread(m3);     
	HelloAllRunnable m4=new HelloAllRunnable();  
	Thread t4 =new Thread(m4);
	HelloAllRunnable m5=new HelloAllRunnable();  
	Thread t5 =new Thread(m5);
	t1.start();
	t2.start();
	t3.start();  
	t4.start();
	t5.start();

 }  
}  