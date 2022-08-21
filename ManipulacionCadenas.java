public class ManipulacionCadenas {
    public static void main (String[] args){

        String nombre = "Diego Fabian Rico Castro";
        System.out.println("Mi nombre es: " + nombre);

        System.out.println("Mi nopmbre tiene " + nombre.length()); // Tener en cuenta que los espacios tambien cuentan como un caracter.
        System.out.println("Mi primer nombre es: " + nombre.substring(0, 5));
        System.out.println("La primer letra de mi nombre es: "+ nombre.charAt(0));
        int ultima_letra;
        ultima_letra = nombre.length();
        System.out.println("La ultima letra del nombre --"+nombre+"-- es: " + nombre.charAt(ultima_letra-1));
    }
}
