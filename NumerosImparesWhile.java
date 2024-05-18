class NumerosImparesWhile {
    private int limite;

    public NumerosImparesWhile(int limite) {
        this.limite = limite;
    }

    public void mostrarImpares() {
        int i = 1;
        while (i <= limite) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }
}
