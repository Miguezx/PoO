//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno(); //creacion de objeto, y llamado al constructor
        Alumno alu2 = new Alumno(1723189369, "Maria", "Perez");


        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());

        alu1.setId(1724317183);
        alu1.setNombre("Marcos");
        alu2.setApellido("Inca");
        System.out.println("------------------------------------------------");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());

        alu2.setId(35); //sobrescribir
        System.out.println("------------------------------------------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
    }
}