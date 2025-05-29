package q5;


public class Salary {
    public void calculatesalaray(double baseSalary, int yearsOfExperience) {
        double bonus = 0.05 * yearsOfExperience * baseSalary;
        double totalSalary = baseSalary + bonus;
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Calculated Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}



public class Doctor extends Salary {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.calculatesalaray(134557, 13);
    }
}
