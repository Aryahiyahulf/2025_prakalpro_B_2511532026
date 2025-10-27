package pekan5;

public class perulanganFor3 {

	public static void main(String[] args) {
		int jumlah=0;
		for (int i=1; i<=10; i++)   {
			System.out.println(i);
			jumlah = jumlah+i;
			if (i<10)  {
				System.out.println (" + ");
				
			}
		}
		System.out.println();
		
		System.out.println("Jumlah = "+jumlah);

	}
	
}
