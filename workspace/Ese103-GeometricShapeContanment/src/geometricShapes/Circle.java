package geometricShapes;

import geometricShapes.GeometricShapes;


	public class Circle extends GeometricShapes {
		private double xC;
		private double yC;
		private double r;
		/**
		 * @param xC
		 * @param yC
		 * @param r
		 */
		public Circle(double xC, double yC, double r) {
			this.xC = xC;
			this.yC = yC;
			if(r>0){
				this.r=r;
			}
		    else{
			    throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
		    
		    }
			}
		/**
		 * @return the xC
		 */
		public double getXC() {
			return xC;
		}
		/**
		 * @param xC the xC to set
		 */
		public void setXC(double xC) {
			this.xC = xC;
		}
		/*
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(r);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(xC);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(yC);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}
		/* )
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
			Circle other = (Circle) obj;
			if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
				return false;
			if (Double.doubleToLongBits(xC) != Double.doubleToLongBits(other.xC))
				return false;
			if (Double.doubleToLongBits(yC) != Double.doubleToLongBits(other.yC))
				return false;
			return true;
		}
		/* 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "circle [xc=" + xC + ", yc=" + yC + ", r=" + r + "]";
		}
		/**
		 * @return the yC
		 */
		public double getYC() {
			return yC;
		}
		/**
		 * @param yc the yC to set
		 */
		public void setYC(double yC) {
			this.yC = yC;
		}
		/**
		 * @return the r
		 */
		public double getR() {
			return r;
		}
		/**
		 * @param r the r to set
		 */
		public void setR(double r) {
			if(r>0){
			   this.r = r;
			}
			else{
				throw new IllegalArgumentException("Selezionare un valore maggiore di 0.");
			}
		}
		/**
		 * 
		 * @return the minimal x-coordinate of the bounding box

		 */
		@Override
		public double getXMin(){
			return this.xC-r;
		}
		/**
		 * 
		 * @return the minimal y-coordinate of the bounding box

		 */
		@Override
		public double getYMin(){
			return this.yC-r;
		}
		/**
		 * 
		 * @return  the maximal x-coordinate of the bounding box

		 */
		@Override
		public double getXMax(){
			return this.xC+r;
		}
		/**
		 * 
		 * @return the maximal y-coordinate of the bounding box

		 */
		@Override
		public double getYMax(){
			return this.yC+r;
		}
	        

}



