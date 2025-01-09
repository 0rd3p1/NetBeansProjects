package Model;

import java.util.ArrayList;

public class Calculator {
    
    ArrayList<Float> val;
    ArrayList<String> hist;

    public Calculator(ArrayList<Float> val, ArrayList<String> hist) {
        this.val = val;
        this.hist = hist;
    }

    public ArrayList<Float> getVal() {
        return val;
    }

    public void setVal(ArrayList<Float> val) {
        this.val = val;
    }

    public ArrayList<String> getHist() {
        return hist;
    }

    public void setHist(ArrayList<String> hist) {
        this.hist = hist;
    }
        
}
