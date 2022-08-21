class ClaseMath {
    public static void main (String[] args) {
        int numero = 81;
        double raiz = Math.sqrt(numero);

        System.out.println("La raiz de " + numero + " es: " + raiz);

        float num1 = 5.49f ;
        int resultado = Math.round(num1); // redonde hacia arriba despues de 0,5 o hacia abajo cuando es menor a 0.49.

        System.out.println("El numero " + num1 + " redondeado es " + resultado);


        // ejemplo con exponenete --pow
        
        double base = 5;
        double exponente = 3;
        int resultado2 = (int)Math.pow(base, exponente);

        System.out.println("El resultado de elevar " + base + " a la " + exponente + " nos da un valor de " + resultado2);  
    }
}