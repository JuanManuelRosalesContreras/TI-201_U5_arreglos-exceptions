public class Arreglo {
    private int [] arreglo;
    private int index;

    public Arreglo (int n){  
        try {
            arreglo = new int[n];
        } catch(Exception e){
            System.out.println("Parametro no valido, se creo un arreglo con ZERO elementos");
            arreglo = new int [0];
        }
    }
    
    //P2 Ingresar n numeros a un arreglo
    public void ingresar(int valor){
        if(index < arreglo.length){
            arreglo[index] = valor;
            index++;
        }
    }
    
    //P3 Sumar los elementos de un arrglo
    public int sumar(){
        int suma = 0;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }
    
    //P4 Multiplicar los elementos de un arreglo
    public int multiplicar(){
        int multiplicacion = 1;
        for(int i = 0; i < arreglo.length; i++){
            multiplicacion *= arreglo[i];
        }
        return multiplicacion;
    }
    
    //P5 Invertir el orden de los elementos de un arreglo
    public void invertir(){
        int mitad = arreglo.length/2;
        int aux;
        for(int i= 0; i< mitad; i++){
            aux=arreglo[i];
            arreglo[i] = arreglo[arreglo.length -1 -i];
            arreglo[arreglo.length -1 -i]=aux;
        }
    }
    
    //P6 Ordenar de mayor a menor los elementos de un arreglo
    public void ordenarDescendente(){
        for(int i= 0; i < arreglo.length; i++){
            int indexMax = i;
            int max = arreglo[i];
            for(int j = i; j < arreglo.length; j++){
               if(arreglo[j]>max){
                   max = arreglo[j];
                   index = j;
               } 
            }
            arreglo[indexMax] = arreglo[i];
            arreglo[i]= max; 
        }
    }
    
    //P7 Ordenar de menor a mayor los elementos de un arreglo
    public void ordenarAscendente(){
        ordenarDescendente();
        invertir();
    }
  
    public void print(){
        System.out.println("ARREGLO-----------");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Arreglo[" + i + "]:" + arreglo[i]);
        }
    }

}
