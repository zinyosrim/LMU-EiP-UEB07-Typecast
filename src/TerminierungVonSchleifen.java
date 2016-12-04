
public class TerminierungVonSchleifen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* (a)
		int i = 0;
		int j = 0;
		do {
			j = j+ 1;
			i = j + i;
		} while (i < 200);
	
*/
/* (b)
		double i = 0.5;
		double j = 0;
		int z = 0;
		while (j < 1) {	
			j += i;
			i*= 0.5;
			z++;
		}
*/
/* (c)
			int z = 0;
			char i = 'a';
			short j = 0;
			while ( i!= j) {
				i++;
				j = (short) (i+i);
				z++;
				
				System.out.println("j = "+j+" i = "+i+" ("+(i+0)+") "+" z = "+z);
				
			}
*/
/* (d) */
		long i = 26L;
		long j = 24L;
		int z = 0;
		for (long x = 0L; x < 1000L; x++) {
			i = i / 12 + 23 * (--x);
			j = (x--) + j + 5;
			z++;
			System.out.println("j = "+j+" i = "+i+" z = "+z);
		}
		System.out.println("j = "+j);
		System.out.println("i = "+i);
		System.out.println("z = "+z);
	}
}