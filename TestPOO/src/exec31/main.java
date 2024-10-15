/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec31;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {

        moto m1 = new moto("Honda", "Titan", 2024, 120);
        caminhao c1 = new caminhao("Scania", "Br340", 2023, 40000);
        
        c1.addSeguro();
        c1.apresentar();
        
        //m1.addSeguro();
        m1.apresentar();
        
    }
    
}
