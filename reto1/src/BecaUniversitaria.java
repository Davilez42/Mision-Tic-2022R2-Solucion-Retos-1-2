import java.nio.channels.Pipe;
import java.math.*;

public class BecaUniversitaria {

    //
    // Atributos
    int pTiempo;
    double pMonto;
    double pInteres;

    //
    // ...
    //
    // Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public BecaUniversitaria() {
        pTiempo = 0;
        pMonto = 0;
        pInteres = 0;
    }


    
   
    // Métodos
    //
    public double calcularInteresSimple() {
        return Math.round(pMonto * (pInteres / 100) * pTiempo);
    }



    public double calcularInteresCompuesto() {
        return Math.round(pMonto * (Math.pow((1 + (pInteres / 100)), pTiempo) - 1));
    }

    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pInteres = pInteres;
        this.pMonto = pMonto;
        this.pTiempo = pTiempo;   
        double diferencia = calcularInteresCompuesto()-calcularInteresSimple();
        if (pInteres!=0 && pMonto !=0 && pTiempo!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+diferencia ;
        }
        else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
    }

    public String compararInversion() {
        double diferencia = Math.round(calcularInteresCompuesto()-calcularInteresSimple());
        if (pInteres!=0 && pMonto !=0 && pTiempo!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $"+diferencia ;
        }
        else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }





}