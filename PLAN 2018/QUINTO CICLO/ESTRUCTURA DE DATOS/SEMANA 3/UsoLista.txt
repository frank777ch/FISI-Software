package Semana4;
import javax.swing.JOptionPane;
public class UsoLista {
    public static void main(String[] args) {
        Lista lista1 = new Lista();
        int opcion = 0, el;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicio de la lista\n"+
                        "2. Agregar un elemento al final de la lista\n"+
                        "3. Mostrar datos de la lista\n"+
                        "4. Eliminar un elemento del inicio de la lista\n"+
                        "5. Eliminar un elemento del final de la lista\n"+
                        "6. Eliminar un elemento en especifico\n"+
                        "7. Buscar un Elemento en la Lista\n"+
                        "8. Salir","Menú de Opciones",3));
                switch (opcion) {
                    case 1:
                        try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento", 
                                "Insertando al inicio", 3));
                        //agregando el nodo
                        lista1.agregarAlInicio(el);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                    }
                    break;
                    case 2:
                        try {
                        el = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento", 
                                "Insertando al final", 3));
                        //agregando el nodo
                        lista1.agregarAlFinal(el);
                    } catch (NumberFormatException n) {
                        JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                    }
                        break;
                    case 3:
                        lista1.mostrarLista();
                        break;
                    case 4:
                        el=lista1.borrarDelInicio();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: "
                                +el,"Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        el=lista1.borrarDelFinal();
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: "
                                +el,"Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el "+
                                "elemento a eliminar...", "Eliminando nodos en especifico"
                                ,JOptionPane.INFORMATION_MESSAGE));
                        if(lista1.estaEnLaLista(el)){
                        lista1.eliminar(el);
                        JOptionPane.showMessageDialog(null,"El elemento eliminado es: "
                                +el,"Eliminando nodos en especifico", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        JOptionPane.showMessageDialog(null, "El elemento "+el+" no está en la lista",
                                "Nodo no encontrado",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 7:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el "+
                                "elemento a buscar...", "Buscando nodos en la lista"
                                ,JOptionPane.INFORMATION_MESSAGE));
                        if(lista1.estaEnLaLista(el)){
                        JOptionPane.showMessageDialog(null, "El elemento "+el+" Si está en la lista",
                                "Nodo encontrado",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        JOptionPane.showMessageDialog(null, "El elemento "+el+" no está en la lista",
                                "Nodo no encontrado",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Programa Finalizado");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        } while (opcion != 8);
    }
}

