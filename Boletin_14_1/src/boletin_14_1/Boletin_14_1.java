package boletin_14_1;

import javax.swing.JOptionPane;

public class Boletin_14_1 {
    private static ConversorTemperaturas conversor = new ConversorTemperaturas();
    
    public static void main(String[] args) {
        float t = 0;
        do{
            try{
                t = Float.parseFloat(JOptionPane.showInputDialog(null,"Introduzca temperatura (ºC):","Conversor",3));
                JOptionPane.showMessageDialog(null,"- Grados Fahrenheit: " + conversor.centigradosAFahrenheit(t) + "ºF\n- Grados Réaumur: " + conversor.centigradosAReamur(t) + "ºR","Conversor",1);
            }catch(NullPointerException e){
                System.exit(0);
            }catch(TemperaturaErradaExcepcion e1){
                JOptionPane.showMessageDialog(null,e1.getMessage(),"Conversor",0);
            }catch(NumberFormatException e2){
                JOptionPane.showMessageDialog(null,"Formato incorrecto.","Conversor",0);
            }
        }while(t < 80);
    }
}
