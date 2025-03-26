public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] listado = { 10, 21, 5, 8, -1, 0 };

        MetodoBurbuja mB = new MetodoBurbuja();
        System.out.println("Metodo Burbuja");
        mB.imprimirArreglo(listado);
        System.out.println("Ordenar ascendente");
        mB.ordenar(listado, true);
        mB.imprimirArreglo(listado);
        mB.ordenar(listado, false);
        mB.imprimirArreglo(listado);
        System.out.println();

        int[] array = { 10, 15, 5, 8, -1, 0 };

        MetodoSeleccion mS = new MetodoSeleccion();
        System.out.println("Metodo Seleccion");
        System.out.println("Arreglo");
        mS.printArray(array);
        System.out.println("Ordenar Descendente");
        mS.ordenar(array, false);

        mS.printArray(array);
        System.out.println("Ordenar Ascendente");
        mS.ordenar(array, true);

        mS.printArray(array);
        System.out.println("Se acabo");
        System.out.println(

        );
        int[] datos = { 10, 15, 5, 8, -1, 0 };
        metodoInsercion mI = new metodoInsercion();
        System.out.println("Metodo Intersecion");

        System.out.println("Arreglo sin ordenar:");
        mI.printArray(datos);
        System.out.println("Arreglo Ordenado con pasos ");
        mI.printArray(datos);
        mI.ordenarAscendente(datos, true);
        mI.printArray(datos);

    }
}
