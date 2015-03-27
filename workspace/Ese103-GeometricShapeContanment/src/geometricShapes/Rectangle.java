package geometricShapes;


public class Rectangle extends GeometricShapes {
	private double xV;
	private double yV;
	private double xSideLength;
	private double ySideLength;
	/**
	 * @param xV
	 * @param yV
	 * @param xSideLength 
	 * @param ySideLength 
	 */
	public Rectangle(double xV, double yV, double xSideLength, double ySideLength) {
		super();
		this.xV = xV;
		this.yV = yV;
		if(xSideLength>0 && ySideLength>0){
		     this.xSideLength=xSideLength;
		     this.ySideLength=ySideLength;
		}
		else{
			throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
		}
	}
	@Override
	public String toString() {
		return "Rectangle [xV=" + xV + ", yV=" + yV + ", xSideLength="
				+ xSideLength + ", ySideLength=" + ySideLength + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(xSideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(xV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ySideLength);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(yV);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(xSideLength) != Double
				.doubleToLongBits(other.xSideLength))
			return false;
		if (Double.doubleToLongBits(xV) != Double.doubleToLongBits(other.xV))
			return false;
		if (Double.doubleToLongBits(ySideLength) != Double
				.doubleToLongBits(other.ySideLength))
			return false;
		if (Double.doubleToLongBits(yV) != Double.doubleToLongBits(other.yV))
			return false;
		return true;
	}
	@Override
	public double getXMin() {
		// TODO Auto-generated method stub
		return xV;
	}
	@Override
	public double getXMax() {
		// TODO Auto-generated method stub
		return xV+xSideLength;
	}
	@Override
	public double getYMin() {
		// TODO Auto-generated method stub
		return yV;
	}
	@Override
	public double getYMax() {
		// TODO Auto-generated method stub
		return yV+ySideLength;
	}
	public double getXV() {
		return xV;
	}
	public void setXV(double xV) {
		this.xV = xV;
	}
	public double getYV() {
		return yV;
	}
	public void setYV(double yV) {
		this.yV = yV;
	}
	public double getXSideLength() {
		return xSideLength;
	}
	public void setXSideLength(double xSideLength) {
		if(xSideLength>0){
		   this.xSideLength = xSideLength;
	    }
		else{
			throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
		}
	}
	public double getYSideLength() {
		return ySideLength;
	}
	public void setYSideLength(double ySideLength) {
		if(ySideLength>0){
		    this.ySideLength = ySideLength;
	    }
		else{
			throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
		}
	}
	
	

}
