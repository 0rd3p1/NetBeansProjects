package encapsulamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class mainControle {
    
    public static void main(String[] args) {
        
        classControle c = new classControle();
        
        //c.desligar();
        c.ligar();
        //c.ligarMudo();
        //c.pause();
        c.play();
        c.maisVolume();
        
        c.abrirMenu();
        c.fecharMenu();
        
    }
}
