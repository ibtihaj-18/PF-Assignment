import java.io.*;

class Employee {
    String name;
    String dept;
    int salary;
    String startDate;
    String[] skills;

    Employee(String name, String dept, int salary, String startDate, String[] skills) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.startDate = startDate;
        this.skills = skills;
    }
}

public class Lab02 {
    public static void main(String[] args) {
        // Data Setup
        Employee[] employees = {
            new Employee("John Smith", "IT", 75000, "2020-01-15", new String[]{"Java", "Python", "SQL"}),
            new Employee("Sarah Johnson", "HR", 65000, "2019-03-01", new String[]{"Recruitment", "Training"})
        };

        writeJSON(employees, "employees.json");
        writeYAML(employees, "employees.yaml");

        System.out.println("Success! Employees saved in JSON and YAML formats.");
    }

    public static void writeJSON(Employee[] employees, String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("[");
            for (int i = 0; i < employees.length; i++) {
                Employee e = employees[i];
                pw.println("  {");
                pw.println("    \"Name\": \"" + e.name + "\",");
                pw.println("    \"Department\": \"" + e.dept + "\",");
                pw.println("    \"Salary\": " + e.salary + ",");
                pw.println("    \"StartDate\": \"" + e.startDate + "\",");
                pw.print("    \"Skills\": [");
                for (int j = 0; j < e.skills.length; j++) {
                    pw.print("\"" + e.skills[j] + "\"" + (j < e.skills.length - 1 ? ", " : ""));
                }
                pw.println("]");
                pw.println(i < employees.length - 1 ? "  }," : "  }");
            }
            pw.println("]");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void writeYAML(Employee[] employees, String fileName) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("employees:");
            for (Employee e : employees) {
                pw.println("  - name: " + e.name);
                pw.println("    department: " + e.dept);
                pw.println("    salary: " + e.salary);
                pw.println("    start_date: " + e.startDate);
                pw.println("    skills:");
                for (String skill : e.skills) {
                    pw.println("      - " + skill);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}