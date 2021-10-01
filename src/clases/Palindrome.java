package clases;

import javax.swing.JOptionPane;

public class Palindrome {

    public String cadena1;
    public String cadena2;
    public boolean isPalindrome = false;

    public Palindrome(String cadena1, String cadena2) {
        
        this.cadena1 = cadena1;
        this.cadena2 = cadena2;
        
    }

    public boolean getPalidrome() {

        String cadenaR;
        
        cadena1.toLowerCase();
        cadena2.toLowerCase();

        if (!cadena1.trim().equals(cadena2.trim())) {

            JOptionPane.showMessageDialog(null, "No son iguales las cadenas");

        } else {
            
            JOptionPane.showMessageDialog(null, "Son iguales las cadenas");

            cadenaR = new StringBuilder(cadena1).reverse().toString();

            if (cadena1.trim().equals(cadenaR)) {

                isPalindrome = true;
                
            }

        }

        return isPalindrome;
    }

}
