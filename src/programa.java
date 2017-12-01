import java.util.Scanner;


public class programa {

    public static void main(String[] arg) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        int valor;
        Scanner texto = new Scanner(System.in);

        System.out.println(" Insertando los siguientes valores a lo loco : ");
        for (int i = 1; i <= 7; i++) {
            valor = (int) (Math.random() * 100);
            System.out.print(valor + " ");
            abo.agregar(valor);
        }

        do {


            System.out.println(" ");
            System.out.println(" ");
            System.out.println("seleccione una opcion ");


            System.out.println(" ");
            System.out.println(" ");
            System.out.println("1.- Cantidad de nodos del arbol");
            System.out.println("2.- Altura del arbol");
            var = texto.nextInt();
            switch (var) {
                case 1:
                    System.out.println("Cantidad de nodos del árbol:" + abo.cantidad());
                    break;

                case 2:
                    System.out.println("La alturra del arbol es:" + abo.retornarAltura());
                    break;

            }
        } while (var != 0);

    }
}
