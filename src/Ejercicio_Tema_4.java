/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:
-Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
-Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    -Incrementar el valor de la variable en uno cada vez que se ejecute.
    -Mostrarlo por pantalla cada vez que se ejecute.
-Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
-Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
-Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

import java.sql.SQLOutput;

class Ejercicio_Tema_4 {
        public static void main(String[] args) {
            int numeroIf=0;

            System.out.println(" Usando if, else if y else");

            if(numeroIf>0) {
                System.out.println("El numero es positivo");
            }else if(numeroIf<0){
                System.out.println("El numero es negativo");
            }else{
                System.out.println("El numero es igual a 0");
            }

            System.out.println(" Usando el bucle While ");

            int numeroWhile=0;

            while (numeroWhile < 3){
                System.out.println("El numero es " + numeroWhile);
                numeroWhile++;
            }

            System.out.println(" Usando el bucle Do-While ");
            do{
                System.out.println("El numero es " + numeroWhile);
            }while(numeroWhile < 3);

            System.out.println(" Usando el bucle for ");

            for(int numeroFor=0; numeroFor <= 3; numeroFor++){
                System.out.println("El numero es " + numeroFor);
            }

            System.out.println(" Usando la sentencia Switch ");

            String estacion= "LLuvioso";

            switch(estacion){
                case "Verano":
                    System.out.println("La estacion es Verano");
                    break;
                case "Invierno":
                    System.out.println("La estacion es Invierno ");
                    break;
                case "Otoño":
                    System.out.println("La estacion es Otoño ");
                    break;
                case "Primavera":
                    System.out.println("La estacion es Primavera ");
                    break;
                default:
                    System.out.println("Disculpa la informacion que ingresó no forma parte de las estaciones ");

            }


        }
    }


