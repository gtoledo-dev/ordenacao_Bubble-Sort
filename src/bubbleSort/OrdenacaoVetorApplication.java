package bubbleSort;

public class OrdenacaoVetorApplication {

	public static void main(String[] args) {
		
		int vector[] = {5, 3, 2, 4, 7, 1, 0, 6};
		int aux;
		boolean control;
		
		for(int i=0; i<vector.length; i++) {		
			control = true;		
			for(int j=0; j<(vector.length - 1);j++) {
				
				if(vector[j]>vector[j + 1]) {
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
					control = false;
				}
			}
			if(control) {
				break;
			}
		}
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i] + " ");
		}

	}

}
