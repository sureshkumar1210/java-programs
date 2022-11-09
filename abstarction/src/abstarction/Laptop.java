package abstarction;

public class Laptop extends Lenova {
	
	static void add(Lenova l) {
		l.keyboard();
		l.monitor();
	}
	@Override
	void keyboard() {
		System.out.println("typing function");
	}
	public Laptop(String resulation, int quality) {
		super("low", 50);
		System.out.println("picture resulation is:"+resulation);
	}

	public static void main(String[] args) {
		Laptop sk=new Laptop("high",100);
		//sk.keyboard();
		//sk.monitor();
		mouse();
		add(sk);
	}
}
