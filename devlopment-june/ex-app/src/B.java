class B 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
 		A a1=new A();
		System.out.println(2);
	}
}

   //1
//2


	/* A class is not availbe but i will run inside a B class so it will give the error	 NoClassDefFoundError  



1
Exception in thread "main" java.lang.NoClassDefFoundError: A
        at B.main(B.java:6)
Caused by: java.lang.ClassNotFoundException: A
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 1 more


	E:\devlopment-june\ex-app\src>java -cp ../classes B
1
Exception in thread "main" java.lang.NoClassDefFoundError: A
        at B.main(B.java:6)
Caused by: java.lang.ClassNotFoundException: A
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
        ... 1 more





 E:\devlopment-june\ex-app\src>javac -d ../classes B.java

E:\devlopment-june\ex-app\src>java -cp ../classes B
1
2
	*/