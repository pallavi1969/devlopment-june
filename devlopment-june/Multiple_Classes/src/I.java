class A 
	{
	   static int i;
	}
	class I
	{

		public static void main(String[] args) 
		{
			System.out.println(A.i);
			A.i=30;
			System.out.println(A.i);
		}
	}
//0
//30
   //one class static member 