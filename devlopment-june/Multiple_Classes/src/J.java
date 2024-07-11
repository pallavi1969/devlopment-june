class A 
	{
	   static void test()
	{
			System.out.println("from test");
	}
 
	class J
	{

		public static void main(String[] args) 
		{
			System.out.println("main");
			test();
		}
	}
}
  //CTE  b/c test method is a class A member
//