package main.java;


public class Main {
	
	private static final int[] a = {1, 2, 3};

	  public void stringVariableAddsArrayAndAssigns() {
	    String b = "a string";
	    // BUG: Diagnostic contains: += Arrays.toString(a)
	    b += a;
	  }
	public void testEquality(String x, String y) {
	    x.toString();
	    new Exception();
	  }
	
}
