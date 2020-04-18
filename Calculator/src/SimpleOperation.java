public class SimpleOperation {
	
	public SimpleOperation() {
		
	}
	
	public void add(int a, int b) {
		 
		int result = a+b;
		System.out.println("Addition of "+a+" and "+b +" " +"is " +result);
	}

	public void subtract(int a, int b) {
		int result = a-b;
		System.out.println("Subtraction of "+a+" with "+b +" " +"is " +result); 
	}

	public void multiply(int a, int b) {
		int result = a*b;
		System.out.println("Multiplication of "+a+" time "+b +" " +"is " +result);
	}

	public void divide(int a, int b) {
		if(b==0) {
			System.out.println("Cannot Divide by zero");
		}
		else
		{
			int result = a/b;
			System.out.println("Divion of "+a+" with "+b +" " +"is " +result);
		}
	}
		  

}

