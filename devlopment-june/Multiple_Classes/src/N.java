class A27
 {
	 public static void main(String[] args) {
		System.out.println("A27-main");
	}
 }
public class N {

	public static void main(String[] args) {
		System.out.println("N.main begin");
		A27.main(null);
		System.out.println("M.main end");
	}
}
/*
  N.main begin
A27-main
M.main end
  */
