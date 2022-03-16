
public class Constructordemo {
	public Constructordemo(){
		this('a');
		System.out.println("default constructor");
	}
	public Constructordemo(int i) {
		System.out.println(i);
	}
	public Constructordemo(Integer i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Constructordemo demo=new Constructordemo();
	}
}
