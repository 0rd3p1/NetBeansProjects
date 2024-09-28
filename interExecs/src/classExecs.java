import java.util.Scanner;


public class classExecs implements interExecs {

    private int saldo;
    
    public int getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(int s) {
        this.saldo = s;
    }
    
    @Override
    public void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor para depositar: ");
        double valor = sc.nextDouble();
        this.saldo += valor;
        System.out.print("Saldo: " + this.getSaldo() + "\n");
    }

    @Override
    public void sacar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor para sacar: ");
        double valor = sc.nextDouble();
        this.saldo -= valor;
        System.out.print("Saldo: " + this.getSaldo() + "\n");
    }
    
}
