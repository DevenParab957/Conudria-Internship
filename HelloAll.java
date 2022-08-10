class HelloAll extends Thread
{  
	public void run()
{  
	System.out.println("Hello All");  
}  
public static void main(String args[])
{  
	HelloAll t1=new HelloAll();  
	HelloAll t2=new HelloAll();  
	HelloAll t3=new HelloAll();  
	HelloAll t4=new HelloAll();  
	HelloAll t5=new HelloAll();  
	t1.start();  
	t2.start();  
	t3.start();  
	t4.start();  
	t5.start();  
}

}  