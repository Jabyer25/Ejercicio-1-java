class ComparadorNumeros {
    private int numero1;
    private int numero2;

    public ComparadorNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int determinarMayor() {
        if (numero1 > numero2) {
            return numero1;
        } else if (numero2 > numero1) {
            return numero2;
        } else {
            return 0; // Indica que son iguales
        }
    }
}
