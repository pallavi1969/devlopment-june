	 class C1
{
	static int i;
	static
	{
		System.out.println("C1-SIB");
	}
}






 class M {
	static
	{
		System.out.println("M-SIB");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println("C1.i");
		System.out.println(".......");
		C1.i=20;
		System.out.println(C1.i);
		System.out.println("main end");
	}

}
  /*M-SIB
main begin
C1.i
.......
C1-SIB
20
main end 
 .............................
 C1 is already loading 







*/