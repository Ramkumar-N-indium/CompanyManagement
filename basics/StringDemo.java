package basics;

public class StringDemo {

	public static void main(String[] args) {
		//StringBuffer name1=new StringBuffer("Tom");
		StringBuilder name1=new StringBuilder("Tom");
		name1.append("Jake");
		
		System.out.println(name1);
	}
}
