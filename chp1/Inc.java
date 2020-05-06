// pamala-repo/chp1/Inc.java

class StaticTest {
	static int i = 47;
}
class Incrementable {
	static void increment() {StaticTest.i++;}
}

class Inc {
	  
	  public static void main(String[] args) {
		 System.out.println("Initial Value: ");
		 System.out.println(StaticTest.i);
	  
	     Incrementable.increment();
		 
	     System.out.println("Increased Value: ");
		 System.out.println(StaticTest.i);
	  }
}
