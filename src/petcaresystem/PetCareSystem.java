/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petcaresystem;

import data.Cabinet;

/**
 *
 * @author MY_PC
 */
public class PetCareSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cabinet petCareHospital = new Cabinet();
        petCareHospital.addDog();
        petCareHospital.addDog();
        petCareHospital.addDog();
        petCareHospital.printDogListByIdAsc();
//        petCareHospital.searchDog();
//        petCareHospital.searchDog();
        petCareHospital.Update();
        petCareHospital.printDogListByIdAsc();
        System.out.println("abcdefg...");
<<<<<<< HEAD
         System.out.println("Thuc dep trai vcl");
  System.out.println("Thuc dep trai vcl");
  System.out.println("Thuc dep trai vcl");
=======
>>>>>>> parent of 24ea9fb... aa
    }
    
}
