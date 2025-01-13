package Model;

public class Calculator implements Operations {
    
    public double val1;
    public double val2;
    
    @Override
    public double som(double val1, double val2) {
        double res = val1 + val2;
        return res;
    }

    @Override
    public double sub(double val1, double val2) {
        double res = val1 - val2;
        return res;
    }

    @Override
    public double div(double val1, double val2) {
        double res = val1 / val2;
        return res;
    }

    @Override
    public double mul(double val1, double val2) {
        double res = val1 / val2;
        return res;
    }

    @Override
    public double rai(double val1) {
        double res = Math.sqrt(val1);
        return res;
    }

    @Override
    public double pot(double val1, double val2) {
        double res = Math.pow(val2, val2);
        return res;
    }
    
}