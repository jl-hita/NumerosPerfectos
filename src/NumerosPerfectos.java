public class NumerosPerfectos {
	public static void main(String[] args) {
		System.out.println("Números perfectos entre 1 y 10000000: ");
		for(int i=1;i <= 10000000;i++){
        	if(esPerfecto(i))
        		System.out.println(i);
        }
		System.out.println("Gracias por usar el programa.");
	}
	static boolean esPerfecto(int n) {
		int suma=0;
		boolean perfecto=false;
		for(int i = 1; i < n; i++) {                            
			if (n % i == 0)
				suma = suma + i;
		}
		if (suma == n)                
			perfecto=true;
		return perfecto;
	}
}