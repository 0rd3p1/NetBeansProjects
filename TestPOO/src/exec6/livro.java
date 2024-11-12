/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exec6;

/**
 *
 * @author Aluno
 */
public class livro {

    protected String titulo;
    protected String autor;
    protected boolean disponivel;

    public livro(String t, String a, boolean d) {
        this.titulo = t;
        this.autor = a;
        this.disponivel = d;
    }

    public void emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("Livro emprestado!");
        } else {
            System.out.println("Livro indisponivel!");
        }
    }
    
    public void devolver() {
        do {
            if (this.disponivel == false) {
                this.disponivel = true;
                System.out.println("Livro devolvido!");
            } else {
                System.out.println("Algo deu errado! Tente novamente");
            }
        } while (this.disponivel == false);
    }
    
}
