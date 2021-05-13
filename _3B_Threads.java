import java.util.*;
public class _3B_Threads {
	int n;
	Random rn=new Random();
	volatile int cv = 0;
	synchronized void gen() {
		n = rn.nextInt(100);
		System.out.println("Generated no "+n);
		cv=1;
	}
	synchronized void square() {
		System.out.println("Square: "+n*n);
		cv=2;
	}
	synchronized void cube() {
		System.out.println("Cube: "+n*n*n);
		cv=0;
	}
}
class gen implements Runnable{
	_3B_Threads b;
	Thread t;
	String nm;
	gen( _3B_Threads b,String n) {
		this.b = b;
		nm = n;
		t = new Thread(this, nm);
		t.start();
	}
	public void run() {
		while(true) {
		if (b.cv==0)
		 b.gen();
		}
	}
}
class square implements Runnable{
	 _3B_Threads b;
	Thread t;
	String nm;
	square( _3B_Threads b,String n) {
		this.b = b;
		nm = n;
		t = new Thread(this,nm);
		t.start();
	}
		
	public void run() {
		while(true) {
		if (b.cv == 1)
		 b.square();
		}
	} 
}
class cube implements Runnable{
	_3B_Threads b;
	Thread t;
	String nm;
	cube( _3B_Threads b,String n) {
		this.b = b;
		nm = n;
		t = new Thread(this,nm);
		t.start();
	}
	public void run() {
		while(true) {
			if (b.cv==2)
				b.cube();
	
			}
	}
}

class Test{
	public static void main(String args[]) {
		_3B_Threads bobj = new  _3B_Threads();
		gen g = new gen(bobj,"Random Generate");
		square s = new square(bobj,"Square");
		cube c = new cube(bobj,"Cube");
		try {
			g.t.join();
			s.t.join();
			c.t.join();
		}
		catch(InterruptedException e)
		{	}
	}
}
