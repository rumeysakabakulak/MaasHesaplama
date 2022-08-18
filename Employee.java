public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary <= 1000) {
            return salary;

        } else {
            double tax = this.salary * 0.03;
            return tax;
        }
    }

    public double bonus() {
        double bonus;
        if (this.workHours > 40) {
            bonus = (workHours - 40) * 30;
            return bonus;

        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        double raise;
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("Geçersiz bir başlangıç yılı girdiniz, lütfen tekrar deneyin.");
        } else {
            int totalYear = 2021 - this.hireYear;

            if (totalYear < 10) {
                raise = this.salary * 0.5;
                return raise;

            } else if (totalYear >= 10 && totalYear < 20) {
                raise = this.salary * 0.10;
                return raise;

            } else if (totalYear >= 20) {
                raise = this.salary * 0.15;
                return raise;

            } else {
                raise = 0;
            }
        }
        return 0;
    }
    public void printEmployee(){
        double taxableSalary = salary - tax() + bonus();
        double totalSalary = salary - tax() + bonus() + raiseSalary();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Veregi ve Bonuslar ile Birlikte Maaş : " + taxableSalary);
        System.out.println("Toplam Maaş : " + totalSalary);
    }

}