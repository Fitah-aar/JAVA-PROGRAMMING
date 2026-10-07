package Data.EXERCISE2;
import java.util.Date;

class Loan {

    // create private Attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    // constructor with default values
    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    // constructor with parameters
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }

    // getters
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    // Setters
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    // Method xisabiya lacagta bishii la bixinayo (Monthly Payment)
    public double getMonthlyPayment() {
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int totalNumberOfPayments = numberOfYears * 12;

        // Formula: (P * r) / (1 - (1 + r)^(-n))
        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -totalNumberOfPayments));

        return monthlyPayment;
    }

    // Method xisabiya lacagta guud ee la bixinayo (Total Payment)
    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

public class Exer3Loan {
    public static void main(String[] args) {
        // 1. Tijaabada Default Constructor
        Loan loan1 = new Loan();
        System.out.println("----------------------------------");
        System.out.println("Loan Date: " + loan1.getLoanDate());
        System.out.println("Annual Interest Rate: " + loan1.getAnnualInterestRate() + "%");
        System.out.println("Number Of Years: " + loan1.getNumberOfYears());
        System.out.println("Loan Amount: $" + loan1.getLoanAmount());
        System.out.printf("Monthly Payment: $%.2f\n", loan1.getMonthlyPayment());
        System.out.printf("Total Payment: $%.2f\n", loan1.getTotalPayment());

        // 2. Tijaabada Constructor leh qiimayaal aan anagu dooranay
        // AnnualInterestRate: 5.5%, NumberOfYears: 3 sano, LoanAmount: $20,000
        Loan loan2 = new Loan(5.5, 3, 20000.0, new Date());
        System.out.println("----------------------------------");
        System.out.println("Loan Date: " + loan2.getLoanDate());
        System.out.println("Annual Interest Rate: " + loan2.getAnnualInterestRate() + "%");
        System.out.println("Number Of Years: " + loan2.getNumberOfYears());
        System.out.println("Loan Amount: $" + loan2.getLoanAmount());
        System.out.printf("Monthly Payment: $%.2f\n", loan2.getMonthlyPayment());
        System.out.printf("Total Payment: $%.2f\n", loan2.getTotalPayment());
    }
}
