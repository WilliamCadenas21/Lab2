/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.Vista;

/**
 *
 * @author Guest
 */
public class Laboratory2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        vista.setVisible(true);
    }

    public static void showMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (j != m.length - 1) {
                    System.out.print(m[i][j] + ",");
                } else {
                    System.out.print(m[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
