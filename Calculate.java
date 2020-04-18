
public class Calculate {

		    public static void main(String[] args) {
		    	SimpleOperation s = new SimpleOperation();
		    	s.add(25, 44);
		    	s.subtract(400, 199);
		    	s.multiply(2, 33);
		    	s.divide(30, 3);
		    	
		    	
		    	ComplexOperation c = new ComplexOperation();
		    	c.mod(3, 45);
		    	c.log(5);
		    	
		    	ShapeOperation sr = new ShapeOperation();
		    	sr.area_of_rectangle(3, 4);
		    	sr.Circumference_of_circle(2.3);
		    	
		    	
		    	PowerOperation p = new PowerOperation();
		    	p.square(4);
		    	p.cube(4);
		    	p.power(4, 6);
		    	p.squareroot(66);
	    }
	  }