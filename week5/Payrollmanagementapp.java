interface Payable {

    double calculatePayment();
}

abstract class Employee implements Payable {
    private String id;
    private String name;
    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name;
    }
}
class SalariedEmployee extends Employee {

    private double salary;

    SalariedEmployee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public double calculatePayment() {
        return salary;
    }
}
class HourlyEmployee extends Employee {

    private double hours;
    private double rate;

    HourlyEmployee(String id, String name,
                   double hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePayment() {
        return hours * rate;
    }
}
class Invoice implements Payable {

    private String invoiceId;
    private double amount;

    Invoice(String invoiceId, double amount) {
        this.invoiceId = invoiceId;
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice " + invoiceId;
    }
}
class PayrollProcessor {
    private Payable[] payments;
    private int size;
    PayrollProcessor(int capacity) {
        payments = new Payable[capacity];
        size = 0;
    }
    void addPayment(Payable p) {

        if (size < payments.length) {
            payments[size] = p;
            size++;
        }
    }
    double calculateTotalPayment() {

        double total = 0;

        for (int i = 0; i < size; i++) {
            total = total + payments[i].calculatePayment();
        }

        return total;
    }
    Payable findLargestPayment() {
        Payable largest = payments[0];
        for (int i = 1; i < size; i++) {
            if (payments[i].calculatePayment()
                    > largest.calculatePayment()) {
                largest = payments[i];
            }
        }
        return largest;
    }
    void countTypes() {

        int employees = 0;
        int others = 0;

        for (int i = 0; i < size; i++) {

            if (payments[i] instanceof Employee) {
                employees++;
            } else {
                others++;
            }
        }

        System.out.println("Employees: " + employees);
        System.out.println("Non-Employees: " + others);
    }
}


