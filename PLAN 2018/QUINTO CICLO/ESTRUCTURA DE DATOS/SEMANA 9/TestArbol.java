package Semana10;

import javax.swing.JOptionPane;

public class TestArbol {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol1 = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                        + "2. Recorrer el arbol EntreOrden\n"
                        + "3. Recorrer el arbol PreOrden\n"
                        + "4. Recorrer el arbol PostOrden\n"
                        + "5. Buscar un nodo en el árbol\n"
                        + "6. Eliminar un nodo en el árbol\n"
                        + "7. Salir\n"
                        + "Eligen una opción...", "Arboles Bnarios",
                         JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el número del nodo...", "Agregando el nodo",
                                 JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null,
                                "Ingresa el nombre del nodo...", "Agregando el nodo",
                                JOptionPane.QUESTION_MESSAGE);
                        arbol1.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbol1.estaVacio()) {
                            System.out.println();
                            arbol1.entreOrden(arbol1.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbol1.estaVacio()) {
                            System.out.println();

                            arbol1.preOrden(arbol1.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbol1.estaVacio()) {
                            System.out.println();
                            arbol1.postOrden(arbol1.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        if (!arbol1.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el número del nodo buscado...", "Buscando el nodo",
                                     JOptionPane.QUESTION_MESSAGE));
                            if (arbol1.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el árbol",
                                        "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nodo encontrado, la info es: "+
                                        arbol1.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        if (!arbol1.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el número del nodo eliminar...", "Eliminando el nodo",
                                     JOptionPane.QUESTION_MESSAGE));
                            if (arbol1.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "El nodo no se encuentra en el árbol",
                                        "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                            JOptionPane.showMessageDialog(null, "El nodo se eliminó del arbol",
                                    "¡Nodo eliminado!", JOptionPane.INFORMATION_MESSAGE);

                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El árbol está vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 7);
    }

}
