import java.util.Scanner;

class Payroll {
    int empId;
    String empName;
    double basic, hra, da, pf, tax;
    double gross, net;

    void addSalary() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();

        System.out.print("Enter PF Deduction: ");
        pf = sc.nextDouble();

        System.out.print("Enter Tax Deduction: ");
        tax = sc.nextDouble();
    }

    void calculate() {
        gross = basic + hra + da;
        net = gross - (pf + tax);
    }

    void payslip() {
        System.out.println("\n----- PAYSLIP -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + gross);
        System.out.println("PF Deduction  : " + pf);
        System.out.println("Tax Deduction : " + tax);
        System.out.println("Net Salary    : " + net);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Payroll p = new Payroll();

        p.addSalary();
        p.calculate();
        p.payslip();
    }
}