package cylinder;      // class for the cylinder
public class Cylinder {
	   private double radius;
	   private double height;
	  
	   
	   public Cylinder() {// Default constructor
	    }
	    public Cylinder(double radius, double height) { // overload constructor
	        this.radius = radius;
	        this.height = height;
	    }
	    public double getRadius() {       //getter method for radius (camelCase)       
	    return radius;
	    }
	    public void setRadius(double radius) {   //sitter method for radius (camelCase)
	    	this.radius = radius;
	    }
	    public double getHeight() {             // getter method for height (camelCase)
	        return height;
	    }
	    public void setHeight(double height) {    // sitter method for height (camelCase)
	        this.height = height;
	    }
	    public double calculateVolume(double radius, double height) {   //  calculate the volume method (worker method)
	       return Math.PI * Math.pow(radius, 2) * height;
	    }
	}
	
	
	
	
	
	
	
	
 

