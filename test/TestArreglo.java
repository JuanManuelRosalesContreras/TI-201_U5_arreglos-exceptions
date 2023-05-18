public class TestArreglo {
    public static void main(String ... args){
        System.out.println("PROBLEMA 1: Arreglo inicializado con 0-----");
        Arreglo a1 = new Arreglo(3);
        a1.print();
        
        Arreglo a2 = new Arreglo(0);
        a2.print();
        
        Arreglo a3 = new Arreglo(-1);
        a3.print();
        
        System.out.println("PROBLEMA 2: Ingresar n numeros en un arreglo-----");
        Arreglo a4 = new Arreglo(5);
        a4.ingresar(1);
        a4.ingresar(3);
        a4.ingresar(3);
        a4.ingresar(5);
        a4.ingresar(7);
        a4.print();
        
        System.out.println("PROBLEMA 3: Sumar los elementos de un arreglo-----");
        System.out.println("P3 Suma: " + a4.sumar());
        
        System.out.println("PROBLEMA 4: Multiplicar los elementos de un arreglo-----");
        System.out.println("P4 Multiplicacion: " + a4.multiplicar());
        
        System.out.println("PROBLEMA 5: Invertir los elementos de un arreglo-----");
        a4.invertir();
        a4.print();
        
        System.out.println("PROBLEMA 6: Ordenar de forma descendente un arreglo-----");
        a4.ordenarDescendente();
        a4.print();
        
        System.out.println("PROBLEMA 7: Ordenar de forma ascendente un arreglo-----");
        a4.ordenarAscendente();
        a4.print();
        
    }
}
