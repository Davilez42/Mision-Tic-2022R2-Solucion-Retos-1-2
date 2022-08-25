public class PrecioTotal {
    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    // Constructor
    PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales() {
        // Código
        for (Computadores comp : listaComputadores) {
            String clase = comp.getClass() + "";
            if (clase.equals("class ComputadoresMesa")) {
                totalComputadoresMesa += comp.calcularPrecio();
                totalComputadores+=comp.calcularPrecio();
            }
            if (clase.equals("class ComputadoresPortatiles")) {
                totalComputadoresPortatiles += comp.calcularPrecio();
                totalComputadores+=comp.calcularPrecio();
            }
            if (clase.equals("class Computadores")) {
                totalComputadores += comp.calcularPrecio();
            }
        }

        // Mostramos los resultados
        System.out.println("La suma del precio de los computadores es de " +totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }

 
}
