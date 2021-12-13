package icici.loan.homeloan;

public class GarbageCollector {
	
	public static void main(String[] args) {
		
		GarbageCollector t = new GarbageCollector();
		GarbageCollector t1 = new GarbageCollector();
        System.out.println(t);
        System.out.println(t1);
        System.out.println(t.toString());
        System.out.println(t1.toString());
        t=null;
        t1=null;
        System.out.println(t);
        System.out.println(t1);
        t=t1;
        System.out.println(t);
        System.out.println(t1);
        t.m1();
        System.gc();
	}
	
	public void m1()
	{
		GarbageCollector t3 = new GarbageCollector();
	}
	
	public void finalize()
	{
		System.out.println("Object is Destroyed");
	}

}
