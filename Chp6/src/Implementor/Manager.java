package Implementor;


public class Manager {
    public double calSal(double base, double allowance) {
        double hra = 0.15 * base;
        double da = 0.10 * base;
        return base + hra + da + allowance;
    }
}

