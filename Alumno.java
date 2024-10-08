public class Alumno { //creación de clases
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) { //constructor, utiliza la p. reservada this, para iodnetificar la variable
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre(){ //metodo, procedimiento sin retorno
        System.out.println("Hola, soy un alumno y se decir mi nombre");
    }

    public void saberAprobado (double calificacion){ //metodo, procedimento, recibiendo un párametro
        if (calificacion >=6) {
            System.out.println("Aprobo la matería");
        }
        else{
            System.out.println("Desaprobo");
        }
    }
}
