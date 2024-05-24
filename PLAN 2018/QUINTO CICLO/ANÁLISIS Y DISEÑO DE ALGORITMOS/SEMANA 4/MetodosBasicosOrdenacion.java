/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sesion4;

import java.util.Random;

/**
 *
 * @author jprud
 */
public class MetodosBasicosOrdenacion {

    public static void ordBurbuja(int a[]) {
        int i, j;
        int n = a.length;
        // bucle externo controla la cantidad de pasadas 
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // elementos desordenados, se intercambian
                    intercambiar(a, j, j + 1);
                }
            }
        }
    }

    public static void ordSeleccion(int a[]) {
        int indiceMenor, i, j, n;
        n = a.length;
        // ordenar a[0]..a[n-2] y a[n-1] en cada pasada
        for (i = 0; i < n - 1; i++) {
            // comienzo de la exploración en índice i 
            indiceMenor = i;
            // j explora la sublista a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // sitúa el elemento mas pequeño en a[i] 
            if (i != indiceMenor) {
                intercambiar(a, i, indiceMenor);
            }
        }
    }

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    public static void ordInsercion(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            /*  indice j es para explorar la sublista a[i-1]..a[0] 
         buscando la posicion correcta del elemento destino*/
            j = i;
            aux = a[i];
            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {
                // desplazar elementos hacia arriba para hacer espacio 
                a[j] = a[j - 1];
                j--;
            }
            a[j] = aux;
        }
    }

    public static void heapsort(int a[]) {
        insertamonticulo(a);
        eliminamonticulo(a);
    }

    public static void insertamonticulo(int[] a) {
        int i, j;
        int aux;
        boolean band;
        for (i = 1; i <= a.length - 1; i++) {
            j = i;
            band = true;
            while (j > 0 && band == true) {
                band = false;
                if (a[j] > a[j / 2]) {
                    aux = a[j / 2];
                    a[j / 2] = a[j];
                    a[j] = aux;
                    j = j / 2;
                    band = true;
                }
            }
        }

    }

    public static void eliminamonticulo(int[] a) {
        int i, j;
        int aux, izq, der, ap, mayor;
        boolean bool;
        for (i = a.length - 1; i > 0; i--) {
            aux = a[i];
            a[i] = a[0];
            izq = 1;
            der = 2;
            j = 0;
            bool = true;
            while ((izq < i) && (bool == true)) {
                mayor = a[izq];
                ap = izq;
                if (mayor < a[der] && der != i) {
                    mayor = a[der];
                    ap = der;
                }
                if (aux < mayor) {
                    a[j] = a[ap];
                    j = ap;
                } else {
                    bool = false;
                }
                izq = j * 2;
                der = izq + 1;
            }
            a[j] = aux;
        }
    }

    public static void quicksort(int a[]) {
        quicksort(a, 0, a.length - 1);
    }

    private static void quicksort(int a[], int primero, int ultimo) {
        if (ultimo <= primero) {
            return;
        }
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;
        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (primero < j) {
            quicksort(a, primero, j); // mismo proceso con sublista izqda
        }
        if (i < ultimo) {
            quicksort(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }

    /**
     * perform a merge sort on the elements of data
     *
     * @param data data != null, all elements of data are the same data type
     */
    public static void mergeSort(int[] data) {
        int[] temp = new int[data.length];
        sort(data, temp, 0, data.length - 1);
    }

    private static void sort(int[] data, int[] temp, int low, int high) {
        if (low < high) {
            int center = (low + high) / 2;
            sort(data, temp, low, center);
            sort(data, temp, center + 1, high);
            merge(data, temp, low, center + 1, high);
        }
    }

    private static void merge(int[] data, int[] temp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1;
        int tempPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        //main loop
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (data[leftPos]<= data[rightPos]) {
                temp[tempPos] = data[leftPos];
                leftPos++;
            } else {
                temp[tempPos] = data[rightPos];
                rightPos++;
            }
            tempPos++;
        }
        //copy rest of left half
        while (leftPos <= leftEnd) {
            temp[tempPos] = data[leftPos];
            tempPos++;
            leftPos++;
        }
        //copy rest of right half
        while (rightPos <= rightEnd) {
            temp[tempPos] = data[rightPos];
            tempPos++;
            rightPos++;
        }
        //Copy temp back into data
        for (int i = 0; i < numElements; i++, rightEnd--) {
            data[rightEnd] = temp[rightEnd];
        }
    }

    /*
    public static void mergesort(int a[]) {
        mergesort(a, 0, a.length - 1);
    }

    public static void mergesort(int[] a, int primero, int ultimo) {
        int central;
        if (primero < ultimo) {
            central = (primero + ultimo) / 2;
            mergesort(a, primero, central);
            mergesort(a, central + 1, ultimo);
            mezcla(a, primero, central, ultimo);
        }
    }
// mezcla de dos sublistas ordenadas

    public static void mezcla(int[] a, int izda, int medio, int drcha) {
        int[] tmp = new int[a.length];
        int i, k, z;
        i = z = izda;
        k = medio + 1;
        // bucle para la mezcla, utiliza tmp[] como array auxiliar 
        while (i <= medio && k <= drcha) {
            if (a[i] <= a[k]) {
                tmp[z++] = a[i++];
            } else {
                tmp[z++] = a[k++];
            }
        }
        // se mueven elementos no mezclados de sublistas
        while (i <= medio) {
            tmp[z++] = a[i++];
        }
        while (k <= drcha) {
            tmp[z++] = a[k++];
        }
        // Copia de elementos de tmp[] al array a[]
        System.arraycopy(tmp, izda, a, izda, drcha - izda + 1);
    }
     */
    
       public static void ordenacionShell2(int arr[])
    {
        int n = arr.length;
  
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1)
            {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
  
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
  
                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        
    }
    
    
    public static void ordenacionShell(int a[]) {
        int intervalo, i, j, k;
        int n = a.length;

        intervalo = n / 2;
        while (intervalo > 0) {
            for (i = intervalo; i < n; i++) {
                j = i - intervalo;
                while (j >= 0) {
                    k = j + intervalo;
                    if (a[j] <= a[k]) {
                        j = -1;    // par de elementos ordenado 
                    } else {
                        intercambiar(a, j, j + 1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
    
    

    // Esta función ayuda a calcular
    // numeros aleatorioe entre low(inclusive)
    // y high(inclusive)
    static void random(int arr[], int low, int high) {
        Random rand = new Random();
        int pivot = rand.nextInt(high - low) + low;
        int temp1 = arr[pivot];
        arr[pivot] = arr[high];
        arr[high] = temp1;
    }

    /* Esta función toma un elemento como pivote,coloca el elemento pivote
    en su posición correcta en la matriz ordenada y coloca todos los elementos
    más pequeños (más pequeños que pivote) a la izquierda del pivote y todos 
    los elementos mayores a la derecha del pivote */
    static int partition(int arr[], int low, int high) {
        // el pivote se selecciona aleatoriamente
        random(arr, low, high);
        int pivot = arr[high];
        int i = (low - 1); // índice de elemento más pequeño
        for (int j = low; j < high; j++) {
            // Si el elemento actual es más pequeño o igual
            // al pivote
            if (arr[j] < pivot) {
                i++;
                // intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // intercambia arr[i+1] y arr[high] (o pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    /*La función principal que implementa QuickSort aleatorio
    arr [] -> Array a ordenar,
    low -> Índice inicial,
    high -> Índice final */
    public static void Qsortaleatorio(int arr[], int low, int high) {
        if (low < high) {
            /* pi es un índice de partición, arr [pi]
            ahora está en el lugar correcto */
            int pi = partition(arr, low, high);
//Ordena elementos de forma recursiva
//antes de la partición y después de la partición
            Qsortaleatorio(arr, low, pi - 1);
            Qsortaleatorio(arr, pi + 1, high);
        }
    }

    public static void QsortRandom(int a[]) {
        Qsortaleatorio(a, 0, a.length - 1);
    }

}
