package abstarction;

abstract class Lenova {
	int quality;
	String resulation;
	abstract void keyboard();
	void monitor() {
		System.out.println("result");
	}
	static void mouse() {
		System.out.println("choose the file");
	}
	
	public Lenova (String resulation,int quality) {
		this.quality=quality;
		this.resulation=resulation;
		System.out.println("quality:"+quality);
	}
}
