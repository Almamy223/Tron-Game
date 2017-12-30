public class ListeTableau implements Liste 
{
	
	private int n;	
	
	// tableau contenant les elements 
	private Object[] tab;	
	
	public ListeTableau() 
	{
		tab = new Object[10];
		n = 0;
	}
	
	@Override
	public int size() 
	{
		return n;
	}
		
	@Override
	public void append(Object o) 
	{
		if (n == tab.length) 
		{

			Object[] tab2 = new Object[n+1];

			for (int i=0; i<n; i++) {

				tab2[i] = tab[i];
			}

			tab2[tab2.length-1] = o;

			tab = tab2;
		}else{
			tab[n] = o;
		}
		n++;
	}
	
	@Override
	public void preprend(Object o)
	{
		if (n == tab.length) 
		{
			Object[] tab3 = new Object[n+1];
			
			tab3[0] = o;
			
			for (int i=0; i<n; i++) {
				
				tab3[i+1] = tab[i];
			}
			
			tab = tab3;
		}else{
			
			for (int i=n-1; i>=0; i--) 
			{
				tab[i+1] = tab[i];
			}
			
			tab[0] = o;
		}
		
		n++;
	}
	
	@Override
	public Object getFirst() {
		
		return tab[0];
	}
	
	public Object getLast() 
	{
		return tab[n-1];
	}
	
	@Override
	public Object removeFirst()
	{	
		Object o = tab[0];
		
		for (int i=0; i<n-1; i++) 
		{
			tab[i] = tab[i+1];
		}
		n--;
		return o;
	}
	
	@Override
	public Object get(int position) 
	{
		if ((position < 0) || (position > n-1))
		{
			throw new ArrayIndexOutOfBoundsException();
		}else
			return tab[position];
	}
	
	@Override
	public void set(int position, Object o) {
		
		if ((position < 0) || (position > n-1))
		{
			throw new ArrayIndexOutOfBoundsException();
		}else{
			tab[position] = o;
		}
	}
	
	public String toString() {
		
		String x = "ListeTableau [";
		
		for (int i=0; i<n; i++) 
		{
			x += tab[i].toString();	
			if (i != n-1)
			{
				x += ", ";
			}else{
				x += "]";
			}
		}
		
		return x;
	}
}
//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541
