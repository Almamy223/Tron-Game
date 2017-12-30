public class ListeChainee implements Liste 
{

	//classe locale
	public class Noeud 
	{
		private Object contenu;
		private Noeud suivant;
		
		// constructeur
		public Noeud(Object o, Noeud suivant) 
		{
			this.contenu = o;
			this.suivant = suivant;
		}
		
		public Object recuperer() 
		{	
			return contenu;
		}
		
		public void setObject(Object o) 
		{	
			this.contenu = o;
		}
		
		public void setSuivant(Noeud suivant) {
			
			this.suivant = suivant;
		}
		public Noeud NoeudSuivant() 
		{	
			return suivant;
		}
	}


	private Noeud premier;	
	private Noeud dernier; 	
	private int n;	
	
	// constructeur
	public ListeChainee() 
	{
		premier = null;
		dernier = null;
		n = 0;
	}

	@Override
	public int size()
	{	
		return n;
	}

	@Override
	public void append(Object o) {

		if (n == 0) 
		{
			premier = new Noeud(o, null);
			dernier = premier;
		}else{
			Noeud N = new Noeud(o, null);
			dernier.setSuivant(N);
			dernier = N;
		}
		
		n++;	
	}

	@Override
	public void preprend(Object o) {
		
		if (n == 0) 
		{
			premier = new Noeud(o, null);
			dernier = premier;
		}else{
			Noeud N = new Noeud(o, premier);
			premier = N;
		}
		n++;	
	}


	@Override
	public Object getFirst() 
	{	
		return premier.recuperer();
	}

	@Override
	public Object getLast() 
	{
		
		return dernier.recuperer();
	}

	public Object removeFirst() 
	{
		
		Noeud X = premier;
		premier = premier.NoeudSuivant();
		n--;	
		
		return X.recuperer();
	}

	@Override
	public Object get(int position) 
	{
		if ((position < 0) || (position > n-1))
		{
			throw new ArrayIndexOutOfBoundsException();
		}else{	
			Noeud Y = premier;
			int i = 0;
			while (i < position) 
			{
				Y = Y.NoeudSuivant();
				i++;
			}
			return Y.recuperer();
		}
	}


	@Override
	public void set(int position, Object o) 
	{	
		if ((position < 0) || (position > n-1))
		{
			throw new ArrayIndexOutOfBoundsException();
		}else {
			Noeud Z = premier;
			int i = 0;
			while (i < position) 
			{	
				Z = Z.NoeudSuivant();
				i++;
			}
			Z.setObject(o);
		}
	}
	

	
	public String toString() 
	{	
		String A = "ListeChainee [";	
		if (n == 0)
		{
			return A + "]";
		}
		Noeud B = premier;
		int i = 0;
		
		while (i < n) {
			
			A += B.recuperer().toString();
			
			B = B.NoeudSuivant();
			
			if (i != n-1)
			{
				A += ", ";

			}else{
				A += "]";
			}
			i++;
		}
		
		return A;
	}
}
//Aata-allah Rchidi 2000 2436 & Almamy Coulibaly P1004541