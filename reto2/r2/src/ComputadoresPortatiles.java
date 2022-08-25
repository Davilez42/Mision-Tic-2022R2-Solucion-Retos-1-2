public class ComputadoresPortatiles extends Computadores {

    private final static Integer PULGADAS_BASE = 20;
    private int pulgadas;
    private boolean camaraITG;

    // Constructor
    public ComputadoresPortatiles() {
        pulgadas = PULGADAS_BASE;
        camaraITG =false;
    }

    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        camaraITG =false;
    }

    // Constructor
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas,
            boolean camaraITG) {
                this.precioBase = precioBase;
                this.peso = peso;
                this.pulgadas=pulgadas;
                this.consumoW = consumoW;
                this.camaraITG = camaraITG;
    }

    // Métodos
    public Double calcularPrecio() {
        // Método Código return adicion;
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
        if(pulgadas>40){
            double ad = precioBase*0.3;
            adicion +=ad;
        }
        if(camaraITG){
            adicion+=50;
        }

        return precioBase+adicion;
    }

}
