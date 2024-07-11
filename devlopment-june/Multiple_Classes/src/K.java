class C1
{
	static void test()
	{
		System.out.println("from test");
	}
}



 class K {
	public static void main(String[] args) {
		System.out.println("main");
		C1.test();
	}
}