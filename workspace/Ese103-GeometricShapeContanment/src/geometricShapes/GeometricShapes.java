package geometricShapes;

public abstract class GeometricShapes {
	/**
	 * 
	 * @return the minimal x-coordinate of the bounding box
	 */
	public abstract double getXMin();
	/**
	 * 
	 * @return the maximal x-coordinate of the bounding box
	 */
	public  abstract double getXMax();
	/**
	 * 
	 * @return the minimal y-coordinate of the bounding box
	 */
	public abstract double getYMin();
	/**
	 * 
	 * @return n the maximal y-coordinate of the bounding box
	 */
	public abstract double getYMax();
	
	public boolean contains (GeometricShapes s){
		boolean contains=false;
		if(this.getXMin()<=s.getXMin() && this.getYMin()<=s.getYMin()  && this.getXMax()>=s.getXMax() && this.getYMax()>=s.getYMax()){
			contains=true;
		}
		return contains;
	}
}
