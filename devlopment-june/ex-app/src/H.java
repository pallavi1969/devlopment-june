class H 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
 		G.main(null);
        //G.main(args);	//u can use any one
		System.out.println(2);
	}
}

	/*
		how the handle exception handling and error by using exception handling


*/



	/*	output CTS AND RTS both are super success

	   E:\devlopment-june\ex-app\src>javac -d ../classes H.java

E:\devlopment-june\ex-app\src>java -cp ../classes H
1
i am from G
2


*/ 
 /*	   without no main method run the H class it will give the error like as NoSuchMethodError
		



	 E:\devlopment-june\ex-app\src>javac -d ../classes G.java

E:\devlopment-june\ex-app\src>java -cp ../classes H
1
Exception in thread "main" java.lang.NoSuchMethodError: 'void G.main(java.lang.String[])'
        at H.main(H.java:6)


*/