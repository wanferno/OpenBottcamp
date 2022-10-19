/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.*/
class Main {
    public static void main(String[] args) {

        int resultad, a=1, b=2, c=3;
        resultad= Suma(a,b,c);
        System.out.println("El resultado de la suma es igual a: " + resultad);

        Coche micoche= new Coche();
        System.out.println("A continuación la informacion del coche");
        micoche.mostrar_puertas();
        System.out.println("A continuacion se añadira una puerta al coche");
        micoche.anadir_puertas(1);
        System.out.println("------- FIN -------");
    }

    public static int Suma(int a, int b, int c){
        int resultado;
        resultado= (a+b+c);
        return resultado;
    }
}
class Coche{
    int numero_puertas = 4;


    public void mostrar_puertas(){
        System.out.println("El numero de puertas del coche son: "+numero_puertas);
    }
    public void anadir_puertas(int a){
        this.numero_puertas=this.numero_puertas + a;
        System.out.println("El numero de puertas que se añadio es:" + a);
        mostrar_puertas();
        //System.out.println("El total de puertas es: "+ numero_puertas);
    }
}
