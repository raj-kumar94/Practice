
public class JoinThread 
{
	public static void main(String... s)
	{
		Thread t1 = new Thread(new MyRunnable()+"t1");
		Thread t2 = new Thread(new MyRunnable()+"t2");
		Thread t3 = new Thread(new MyRunnable()+"t3");
		
		t1.start();
		
		try{
			t1.join(2000);
		} catch (InterruptedException e){}
		
		t2.start();
		
		try{
			t1.join(2000);
		} catch (InterruptedException e){}
		
		t3.start();
		
		try{
			t1.join(2000);
			t2.join(2000);
			t3.join(2000);
		} catch (InterruptedException e){}
		
		System.out.println("All threads are dead!");
		
		
		
	}
	
}


class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread stated..."+ Thread.currentThread().getName());
		
		try{
			Thread.sleep(3000);
			
		}catch(Exception e){}	
		
		System.out.println("Thread ended... "+ Thread.currentThread().getName());
		}
}