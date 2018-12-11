package boletin_14_1;

public class ConversorTemperaturas {
    private final float temperatura = 80;
    
    public float centigradosAFahrenheit(float celsius) throws TemperaturaErradaExcepcion{
        if(celsius < temperatura){
            throw new TemperaturaErradaExcepcion("temp no puede ser menor que " + temperatura);
        }else{
            return 9 / 5 * celsius + 32.4f;
        }
    }
    
    public float centigradosAReamur(float celsius){
        return 4 / 5 * celsius;
    }
}
