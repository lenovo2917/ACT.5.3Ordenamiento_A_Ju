package programas;
public class QuickSort{
    public static void main(String[] args){
        //arreglo a ordenar
        int numeros [] = {10,7,4,9,1,5,8,2,3,6};
        
        //llamada al metodo de ordenamiento QuickSort
        QuickSort(numeros, 0, numeros.length -1);
        
        //metodo para imprimir el vctor ordenado
        ImprimirVector(numeros);
    }
    
    //Metodo de Ordenamiento QuickSort
    public static void QuickSort(int numeros[], int izq, int der){
        

        //Se toma como pivote el primer valor
        int pivote = numeros[izq];

        //Se definen los dos lados y un auxiliar
        int i = izq; 
        int j = der; 
        int aux;

        while(i<j){
            while(numeros[i] <= pivote && i < j) {
                i++;
            }
            while(numeros[j] > pivote){
                j--;   
            }
            if (i<j){                                     
                aux = numeros[i];                  
                numeros[i]= numeros[j];
                numeros[j]=aux;
            }
        }

        numeros[izq] = numeros[j]; 
        numeros[j] = pivote;

        if (izq < j-1){
            QuickSort(numeros,izq,j-1);
        }
        if (j+1 < der){
            QuickSort(numeros,j+1,der);
        }
    }
    public static void ImprimirVector(int arreglo[])
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
}
