public class ManipulacionCadenas2 {
    public static void main (String[] args) {
        String frase = "Es un dia excelente para aprender a programar en JAVA";

        String frase_resumen = frase.substring(25, frase.length());
        
        System.out.println("La nueva frase es: " + frase_resumen);
    }
}
