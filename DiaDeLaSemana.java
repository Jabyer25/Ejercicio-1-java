class DiaDeLaSemana {
    private int numero;

    public DiaDeLaSemana(int numero) {
        this.numero = numero;
    }

    public void mostrarDia() {
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Número no válido. Por favor, introduce un número del 1 al 5.");
                break;
        }
    }
}
