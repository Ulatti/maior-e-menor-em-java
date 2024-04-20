/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nUm;
        int nDois;
        int nTres = 0;
        int menor;
        int maior;

        nUm = Integer.parseInt(JOptionPane.showInputDialog("escolha um numero"));
        nDois = Integer.parseInt(JOptionPane.showInputDialog("escolha outro numero"));
        JOptionPane.showMessageDialog(null, nUm + nDois);
        if (nDois > nUm) {
            maior = nDois;
            menor = nUm;

        } else {
            maior = nUm;
            menor = nDois;

        }
        if (maior > nTres) {
            System.out.println("maior numero" + maior);
        } else {
            System.out.println("maior numero" + nTres);
        }

        if (menor < nTres) {
            System.out.println("maior numero" + menor);
        }else{
        System.out.println("maior numero" + nTres);
        }

    }

}
}
