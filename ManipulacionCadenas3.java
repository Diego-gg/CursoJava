public class ManipulacionCadenas3 {
    public static void main (String[] args) {
        String alumno1, alumno2;
    alumno1 = "David";
    alumno2 = "david";

    System.out.println(alumno1.equals(alumno2)); // Si afectan las mayusculas al momento de comparar Strings por lo cual arroja FALSE la comparacion.
    System.out.println(alumno1.equalsIgnoreCase(alumno2)); // con este metodo noafectan las mayusculas
    }
}
