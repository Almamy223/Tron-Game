public class Point
{
	//coordonnee point
	private int x, y ;
	
	
	public Point(int x, int y) //constructeur
	{
		this.x = x;
		this.y = y;
	}
	// accesseur
	public int getPointX()
	{
		return this.x;
	}
	
	public void setPointX(int x)
	{
		this.x = x;
	}
	
	public int getPointY()
	{
		return this.y;
	}
	
	public void setPointY(int y)
	{
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}

