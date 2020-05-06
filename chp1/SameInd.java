// pamala.repo/chp1/SameInd.java

class StaticTest {
	static int i = 47;
}

public class SameInd {	
  public static void main(String[] args) {
	// Print intial value of static indicator.
    System.out.println("Initial Value: ");
	System.out.println(StaticTest.i);
	// Create three objects of the StaticTest class.
	StaticTest st1 = new StaticTest();
	StaticTest st2 = new StaticTest();
	StaticTest st3 = new StaticTest();
	// Add one to the indicator for each object.
	st1.i++;
	st2.i++;
	st3.i++;
	// Print final value.
	// Shows that each object adds to the same indicator.
	System.out.println("Final Value: ");
	System.out.println(StaticTest.i);
	}
}
