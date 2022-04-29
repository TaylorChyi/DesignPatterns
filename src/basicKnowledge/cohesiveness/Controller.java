package basicKnowledge.cohesiveness;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 0; i < (int)(Math.random() * 10); i++) {
            employees.add(new Employee());
        }
        Employer employer = new Employer("John", employees);

        employer.appropriateCapital();

    }

}
