package Model;

import java.util.ArrayList;

public class Calculator implements Operations{
    
    ArrayList<Double> hist;
    
    public double val1;
    public double val2;
    
    @Override
    public void som() {
        double res = val1 + val2;
        hist.add(res);
        while(val2 > 0) {
            res = val1 + val2;
            hist.add(res);
        }
        hist.add(res);
    }

    @Override
    public void sub() {
        double res = val1 - val2;
        hist.add(res);
        while(val2 > 0) {
            res = val1 - val2;
            hist.add(res);
        }
        hist.add(res);
    }

    @Override
    public void div() {
        double res = val1 / val2;
        hist.add(res);
        while(val2 > 0) {
            res = val1 / val2;
            hist.add(res);
        }
        hist.add(res);
    }

    @Override
    public void mul() {
        double res = val1 * val2;
        hist.add(res);
        while(val2 > 0) {
            res = val1 * val2;
            hist.add(res);
        }
        hist.add(res);
    }

    @Override
    public void rai() {
        double res = Math.sqrt(val1);
        hist.add(res);
    }

    @Override
    public void pot() {
        double res = Math.pow(val2, val2);
        hist.add(res);
        while(val2 > 0) {
            res = Math.pow(val1, val2);
            hist.add(res);
        }
        hist.add(res);
    }
    
}