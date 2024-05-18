class Factorial {
    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }

    public int calcular() {
        int resultado = 1;
        int i = 1;
        while (i <= numero) {
            resultado *= i;
            i++;
        }
        return resultado;
    }
}
