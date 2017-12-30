
public class Segment 
{
	private Point debut;
	
	private Point fin;
	
	
	public Segment(Point a, Point b) // constructeur segment
	{
		this.debut = a;
		this.fin = b;
	}
	

	public Point getPointDebut()
	{
		return this.debut;
	}
	
	public void setPointDebut(Point debut)
	{
		this.debut = debut;
	}
	
	public Point getPointFin()
	{
		return this.fin;
	}
	
	public void setPointFin(Point fin)
	{
		this.fin = fin;
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((debut == null) ? 0 : debut.hashCode());
		result = prime * result + ((fin == null) ? 0 : fin.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segment other = (Segment) obj;
		if (debut == null) {
			if (other.debut != null)
				return false;
		} else if (!debut.equals(other.debut))
			return false;
		if (fin == null) {
			if (other.fin != null)
				return false;
		} else if (!fin.equals(other.fin))
			return false;
		return true;
	}
	
	
}
