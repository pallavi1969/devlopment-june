class A28
{
	public static void main(String[] args) {
		System.out.println("A28-main");
	}
	static
	{
		System.out.println("A28-SIB");
	}
}
public class O {

	static
	{
		System.out.println("O-SIB");
	}
	public static void main(String[] args) {
		System.out.println("O.main begin");
		A28.main(args);
		System.out.println("O.main end");
	}
}
/*	O-SIB
O.main begin
A28-SIB
A28-main
O.main end	*/