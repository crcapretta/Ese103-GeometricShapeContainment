package geometricShapes;

public class Square extends Rectangle {

	public Square(double xV, double yV, double l) {
		super(xV, yV,l,l);
		// TODO Auto-generated constructor stub
	}

	public double getL(){
		return this.getXSideLength();
	}
	
    public void setL(double l){
    	this.setXSideLength(l);
    }
    @Override
    public void setXSideLength(double l){
    	if(l>0){
    		super.setXSideLength(l);
    		super.setYSideLength(l);
    	}
    	else{
    		throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
    	}
    }
    public void setYSideLength(double l){
    	if(l>0){
    	     super.setYSideLength(l);
    		super.setXSideLength(l);
    	}
    	else{
    		throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
    	}
    }

	@Override
	public String toString() {
		return "Square [xV=" + getXV() + ", yV=" + getYV() + ", xSideLength="
				+ getXSideLength() + ", ySideLength=" + getYSideLength() + "]";
	}
    
}
