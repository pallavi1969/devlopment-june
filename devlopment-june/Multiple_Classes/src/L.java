class C1
{
	static int i;
	static
	{
		System.out.println("C1 -SIB");
	}
}

   class L
   {
  		static
    {
		 
		System.out.println("B -SIB");
	}

	 public static void main(String[]args)
{
	System.out.println("main");
   }
}


