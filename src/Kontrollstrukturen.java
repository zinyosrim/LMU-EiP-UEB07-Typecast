
public class Kontrollstrukturen {

	/* (a) Alternative
	public static void Rekursion (int i, int j){
		if (  i < j | i > j) {
	i++; 
	j--;
	System.out.println("i = "+i+" j = "+j);
	Rekursion(i,j);
	}
	}
	*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* (a)
		int i = 0;
		int j = 42;
		while ( i < j | i > j ){
			i++;
			j--;
		}
		*/
		
		/* (a) Alternative
		int i = 0;
		int j = 42;
		Rekursion (i, j);
		*/

		/* (b)
		int i = 0;
		int j = 42;
		while ( i < j | i > j );{
			i++;
			j--;
		}
		*/
		
		/* (c) 
		
		int i = 0;
		int j = 42;
		while ( i < j | i > j )
			i++;
			j--;
		*/
		
		/* (d) */
		
		int n = 4;
		double x = 0.;
		double y = 1.;
		int i = 1;
		do {
			x = x+y;
			y = y/i;
		} while (i++ <= n);
		System.out.println("x = "+x+" y = "+y);
		
	
		
		/* (d) mit while */
		
		n = 4;
		x = 0.;
		y = 1.;
		i = 1;
		while (i<=n+1) {
			x = x+y;
			y = y/i;
			i++;
		}
		System.out.println("x = "+x+" y = "+y);
		
		/* (d) mit for */
		
		n = 4;
		x = 0.;
		y = 1.;
		i = 1;
		for (i=1; i <= n+1; i++) {
			x = x+y;
			y = y/i;
		}
		System.out.println("x = "+x+" y = "+y);
		
		
	}

}
