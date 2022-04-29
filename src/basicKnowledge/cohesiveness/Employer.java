package basicKnowledge.cohesiveness;

import java.util.ArrayList;
import java.util.List;

public class Employer {
    private String name;
    private List<Employee> employees = new ArrayList<Employee>();
    private float capital = 10000;

    public Employer(String name, List<Employee> employees){
        this.name = name;
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void appropriateCapital(){
        for (int i = 0; i < this.employees.size(); i++) {
            capital -= this.employees.get(i).doSalary();
        }

        System.out.println(this.name + " - " + capital);
    }
}
