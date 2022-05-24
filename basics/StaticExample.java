package basics;

public class StaticExample {
	static int i=1;
	public StaticExample() {
		System.out.println(i++);
	}
    public static void main(String[] args) {
    	StaticExample obj1=new StaticExample();
    	StaticExample obj2=new StaticExample();
    	StaticExample obj3=new StaticExample();
    	StaticExample obj4=new StaticExample();
    }

}
