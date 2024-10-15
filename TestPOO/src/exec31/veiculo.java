/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec31;

/**
 *
 * @author Aluno
 */
public abstract class veiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    
    public veiculo(String ma, String mo, int a) {
        this.marca = ma;
        this.modelo = mo;
        this.ano = a;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public abstract void addSeguro();
    public abstract void apresentar();
    
}
