/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Aluno
 */
public class Criptografia {

    public static final String SHA256 = "SHA-256";
    public static final String MD5 = "MD5";

    protected String informacao;
    protected String padrao;

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String i) {
        this.informacao = i;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String p) {
        this.padrao = p;
    }

    public Criptografia(String i, String p) {
        this.informacao = i;
        this.padrao = p;
    }
    
    public String criptografar() {
        String informacao = getInformacao();   
        // Busca a informacao que sera criptografada
        MessageDigest messageDigest;           
        // O codigo que cria o objeto MessageDigest que é responsavel por gerar a hash 
        StringBuilder hexString = null;        
        // Declarando uma variavel chamada hexString que pode armazenar um objeto do tipo StringBuilder e o String BUilder pode ir sendo adicionado caracteres, numeros e outras Strings

        try {
            messageDigest = MessageDigest.getInstance(getPadrao()); 
            // O metodo get Padrao define qual algoritimo de hash vai ser usado (MD5, SHA256) Cada algoritimo cria um hash diferente
            byte[] hash = messageDigest.digest(informacao.getBytes(StandardCharsets.UTF_8)); 
            // A informacao e convertida em bytes e passada para o metodo digest(), que calcula o hash e retorna um Array de bytes
            hexString = new StringBuilder(2 * hash.length);     
            // Pegando o Array de bytes do hash e convertendo para uma representacao hexadecimal, que e mais facil de ler e de usar. 
            // E como transformar aqueles bytes e, um codigo de letras e numeros
            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // O codigo inclui um bloco try-catch para lidar com a excessao NoSuchAlgorithmException, que ocorre caso o algoritimo de hash especifico nao seja encontrado
        }
        return hexString.toString().toUpperCase();
    }

}
