package excomposition1;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ExComposition1 {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Enter departament's name:");
        String departamentName = sc.nextLine();
        System.out.println("Enter Work Data:");
        System.out.print("Name:");
        String workerName = sc.nextLine();
        System.out.print("Level:");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary:");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        System.out.print("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date: (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour");
            double valuePerHour = sc.nextDouble();
            System.out.print("Durations (Hours)");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter the mounth and year (MM/YYYY) to caculate income:");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament" + worker.getDepartament().getName());
        System.out.println("Income for:" + monthAndYear + ": " + String.format("%2.f", worker.income(year, month)));

        sc.close();

    }

}
