public class Computadores {
    private final static int PESO_BASE=5;
    private final static char CONSUMO_W_BASE ='F' ;
    private final static double PRECIO_BASE = 100.0 ;
    protected  int peso;
    protected  char consumoW;
    protected  double precioBase;

    public Computadores() {
        peso = PESO_BASE;
        consumoW = CONSUMO_W_BASE;
        precioBase = PRECIO_BASE;
    }

    public Computadores(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso=peso;
        consumoW = CONSUMO_W_BASE;
        
    }

    public Computadores(Double precioBase, Integer peso, char consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    // Metodos
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

        if (peso<19 && peso>=0){
            adicion+=10;
        }else{
            if (peso<49 && peso>=20){
                adicion+=50;
            }
            else{
                if (peso<=79 && peso>=50){
                    adicion+=80;
                }
                else{
                    if (peso>=80){
                        adicion+=100;
                    }
                }
            }
        }
        

        return adicion + precioBase;
    }

  

}