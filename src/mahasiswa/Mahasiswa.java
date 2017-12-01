/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author alam1415
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nim input = new nim();
        nim input2 = new nim();
        nim input3 = new nim();
        nim input4 = new nim();
        nim input5 = new nim();
        nim input6 = new nim();
        input.setNama("yusa'");
        input2.setNim("3130016011");
        input3.setNama("prita");
        input4.setNim("3130016012");
        input5.setNama("bagus");
        input6.setNim("3130016013");
        System.out.println("nama = "+input.getNama()+"\nnim = "+input2.getNim());
        System.out.println("nama = "+input3.getNama()+"\nnim = "+input4.getNim());
        System.out.println("nama = "+input5.getNama()+"\nnim = "+input6.getNim());
    }
    
}
