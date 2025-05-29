package Implementor;



public class Emp {
    public double calSal(double base) {
        double hra = 0.10 * base;
        double da = 0.05 * base;
        return base + hra + da;
    }
}
