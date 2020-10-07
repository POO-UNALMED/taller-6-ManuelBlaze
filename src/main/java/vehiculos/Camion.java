/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Manuel
 */
public class Camion extends Vehiculo {
    private int ejes;
    private static int totalCamion;

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getTotalCamion() {
        return totalCamion;
    }

    public static void setTotalCamion(int totalCamion) {
        Camion.totalCamion = totalCamion;
    }
    public Camion (String placa,String nombre,int precio,int peso,Fabricante fabricante,int ejes) {
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.setEjes(ejes);
        totalCamion++;
    }
}