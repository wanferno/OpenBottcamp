public class Ejercicio_Tema_9 {

    public static void main(String[] args){

        Cliente Cliente_Oro = new Cliente();
        Trabajador Trabajador_Oro = new Trabajador();

        System.out.println("Los datos del cliente son:");

        Cliente_Oro.setNombre("Juan");
        System.out.println("El nombre del cliente es: "+ Cliente_Oro.getMombre());

        Cliente_Oro.setEdad(20);
        System.out.println("La edad del cliente es " + Cliente_Oro.getEdad());

        Cliente_Oro.setTelefono("0945625478");
        System.out.println("El telefono del cliente es: "+ Cliente_Oro.getTelefono());

        Cliente_Oro.setCredito(1000);
        System.out.println("El credito del cliente es: " + Cliente_Oro.getCredito());

        System.out.println("Los datos del trabajadora son");

        Trabajador_Oro.setNombre("Mabel");
        System.out.println("El nombre de la trabajadora es " + Trabajador_Oro.getMombre());

        Trabajador_Oro.setEdad(35);
        System.out.println("La edad de la trabajadora es "+ Trabajador_Oro.getEdad());

        Trabajador_Oro.setTelefono("0984759630");
        System.out.println("El telefono de la trabajador es "+ Trabajador_Oro.getTelefono());

        Trabajador_Oro.setSalario(500);
        System.out.println("El salario de la trabajadora es "+ Trabajador_Oro.getSalario());

    }
}

class Persona{
    int edad;
    String mombre;
    String telefono;

    //Methods Getters and Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String mombre) {
        this.mombre = mombre;
    }
    public String getMombre(){
        return this.mombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}

class Cliente extends Persona {
    int credito;

    //Methods Getters and Setters
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}

class Trabajador extends Persona {
    int salario;

    //Methods Getters and Setters
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario(){
        return this.salario;
    }

}


