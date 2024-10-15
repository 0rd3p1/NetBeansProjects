/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec3;

/**
 *
 * @author Aluno
 */
public class veiculo {
    
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

    public void setMarca(String ma) {
        this.marca = ma;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        this.ano = a;
    }
    
}
