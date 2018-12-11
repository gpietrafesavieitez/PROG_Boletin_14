package boletin_14_1;

import javax.swing.JOptionPane;

public class Boletin_14_1 {
    
    public static void main(String[] args) {
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        float t = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca temperatura (ºC):","Conversor",3));
        try{
            JOptionPane.showMessageDialog(null,"- " + conversor.centigradosAFahrenheit(t) + " F\n- " + conversor.centigradosAReamur(t) + " R","Conversor",1);
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin do programa");
    }
    
}
