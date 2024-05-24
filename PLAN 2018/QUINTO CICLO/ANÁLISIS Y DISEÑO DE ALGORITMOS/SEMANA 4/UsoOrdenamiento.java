/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sesion4;

/**
 *
 * @author jprud
 */
public class UsoOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int M = 100000;
        int[] v = new int[M];
        int[] c = new int[M];
        long k1, k2;

        entrada(v);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.ordBurbuja(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación Burbuja: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.ordSeleccion(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación por seleccion: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.ordInsercion(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación por inserción: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.heapsort(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación por heapsort: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.quicksort(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación quicksort: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.mergeSort(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación mergesort: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.ordenacionShell(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación shell: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.ordenacionShell2(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación shell 2: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);




        System.arraycopy(v, 0, c, 0, v.length);
        k1 = System.currentTimeMillis();
        MetodosBasicosOrdenacion.QsortRandom(c);
        k2 = System.currentTimeMillis();
        System.out.println("\nTiempo ordenación quicksort aleatorio: "
                + (k2 - k1));
//        mostrarArreglo(v);
//        mostrarArreglo(c);

    }

    public static void entrada(int[] w) {
        int SUP = 9999;
        for (int i = 0; i < w.length; i++) {
            w[i] = (int) (Math.random() * SUP + 1);
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        int k;
        for (k = 0; k < arreglo.length; k++) {
            System.out.print("[" + arreglo[k] + "] ");
        }
        System.out.println();


    }
    
}
