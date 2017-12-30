
public class Trace
{
	Liste segments = new ListeChainee();
	Point initial;
	
	
	public Trace(Point p)  // constructeur trace
	{
		this.initial = p;
		segments.append(new Segment(initial, initial));
	}
	

	public void allonge(char direction)
	{

		if(segments.size() == 0)
		{
			switch(direction)
			{
			 case 'N':
				segments.append(new Segment(initial, new Point(initial.getPointX(), initial.getPointY()-1 )));
				break;
			 case 'S':
				segments.append(new Segment(initial, new Point(initial.getPointX(), initial.getPointY()+1 )));
				break;
			 case 'E':
				segments.append(new Segment(initial, new Point(initial.getPointX()+1, initial.getPointY() )));
				break;	
			 case 'O':
				segments.append(new Segment(initial, new Point(initial.getPointX()-1, initial.getPointY() )));
				break;		
			}
		}else{
			
			Segment dernierSegment = (Segment)segments.getLast();
			Point finDernierSeg = dernierSegment.getPointFin(); 
			
			switch(direction)
			{
			 case 'N':
				 segments.append(new Segment(finDernierSeg, new Point(finDernierSeg.getPointX(), finDernierSeg.getPointY()-1 )));
				 break;
			 case 'S':
				 segments.append(new Segment(finDernierSeg, new Point(finDernierSeg.getPointX(), finDernierSeg.getPointY()+1 )));
				 break;
			 case 'E':
				 segments.append(new Segment(finDernierSeg, new Point(finDernierSeg.getPointX()+1, finDernierSeg.getPointY() )));
				 break;
			 case 'O':
				 segments.append(new Segment(finDernierSeg, new Point(finDernierSeg.getPointX()-1, finDernierSeg.getPointY() )));
				 break;
			}
		}
	}
	
	public Point PointTete()   // cette fonction doit retournée le point de la tête
	{
		Segment dernierSegment = (Segment)segments.getLast();
		
		
		return dernierSegment.getPointFin();
	}
	
	public boolean contient(Point p)
		
	{
		Segment f=(Segment)segments.getFirst();
		Point fin= f.getPointFin();
		for(int i=0; i<segments.size();i++){
			if(fin.getPointX()== p.getPointX() && fin.getPointY()==p.getPointY()){
				return true;
			}


		}
		return false;
	} 
	
	
	
	public boolean collision(){ 
		return ( contient(PointTete())==true);
		
	}
	


	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

