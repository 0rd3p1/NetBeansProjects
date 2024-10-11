package encapsulamento;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class classControle implements interControle {
    
    private int volume;
    private boolean ligado;
    private boolean passandoPrograma;
    
    public classControle() {
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }
    
    public boolean getPassandoPrograma() {
        return passandoPrograma;
    }

    public void setPassandoPrograma(boolean p) {
        this.passandoPrograma = p;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta aberto?" + this.getLigado());
        System.out.println("Esta passando algum programa?" + this.getPassandoPrograma());
        System.out.println("Volume: " + this.volume);
        
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.printf("|");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.printf("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getPassandoPrograma())) {
            this.setPassandoPrograma(true);
        } else {
            System.out.println("Não foi possivel reproduzir!");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && !(this.getPassandoPrograma())) {
            this.setPassandoPrograma(false);
        } else {
            System.out.println("Não foi possivel pausar!");
        }
    }
    
}
