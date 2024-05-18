class NumerosImparesFor {
    private int limite;

    public NumerosImparesFor(int limite) {
        this.limite = limite;
    }

    public void mostrarImpares() {
        for (int i = 1; i <= limite; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
