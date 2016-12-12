/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String name;
        String age;

        int month;
        int days;
        int hour;
        int age_1;

        name = JOptionPane.showInputDialog("Escriba su nombre: ");
        age = JOptionPane.showInputDialog("Escriba su edad: ");

        age_1 = Integer.parseInt(age);

        month = (age_1 * 12);
        days = (age_1 * 365);
        hour = (days * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + month, "Numero de meses vividos de " + name, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + days, "Numero de días vividos de " + name, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hour, "Numero de horas vividos de " + name, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
