public class Ejercicio_Tema_5 {

    public static void main(String[] args){
        int edad;
        String nombre;
        String telefono;

        persona Primogenito = new persona();

        Primogenito.setNombre("Mikael");
        nombre = Primogenito.getNombre();
        System.out.println("El nombre de la persona es "+ nombre);

        Primogenito.setEdad(15);
        edad = Primogenito.getEdad();
        System.out.println("La eda de la persona es " + edad );

        Primogenito.setTelefono("0989641523");
        telefono = Primogenito.getTelefono();
        System.out.println("El telefono de la persona es " + telefono);
    }

}

class persona{
    private int edad;
    private String nombre;
    private String telefono;

    //Constructor
    public void persona(int edad, String nombre, String telefono){
        this.edad=edad;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    //Methods Getters and Setters
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}