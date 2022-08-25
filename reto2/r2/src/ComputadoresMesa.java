public class ComputadoresMesa extends Computadores {

    private int almacenamiento;
    private final static Integer ALMACENAMIENTO_BASE = 50;

    // Constructor
    public ComputadoresMesa() {
        almacenamiento = ALMACENAMIENTO_BASE;
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        almacenamiento = ALMACENAMIENTO_BASE;
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
        this.almacenamiento = almacenamiento;
    
    }

    // Métodos
    public Double calcularPrecio() {
        double adicion = 0;
        switch (consumoW) {
            case 'A':
                adicion += 100;
                break;
            case 'B':
                adicion += 80;
                break;
            case 'C':
                adicion += 60;
                break;
            case 'D':
                adicion += 50;
                break;
            case 'E':
                adicion += 30;
                break;
            case 'F':
                adicion += 10;
                break;
        }

        if (peso < 19 && peso >= 0) {
            adicion += 10;
        } else {
            if (peso < 49 && peso >= 20) {
                adicion += 50;
            } else {
                if (peso <= 79 && peso >= 50) {
                    adicion += 80;
                } else {
                    if (peso >= 80) {
                        adicion += 100;
                    }
                }
            }
        }
        if (almacenamiento > 100) {
            adicion += 50;
        }
        return precioBase + adicion;
    }

    public Integer getCarga() {
        return almacenamiento;
    }

}
