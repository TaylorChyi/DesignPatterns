package basicKnowledge.cohesiveness;

import java.util.Random;

public class Employee {
    private String name;
    private int age;

    private double experienceRank;
    private float baseSalary;

    public Employee(){
        this.name = getRandomString((int)(Math.random() * 10));
        this.age = (int) (Math.random() * 70);
        this.experienceRank = Math.random() * 5;
        this.baseSalary = (float) (Math.random() * 1000);
    }

    public float doSalary() {
        float salary = (float) (baseSalary * experienceRank);
        System.out.println(name + " - " + age + " - " + salary);
        return salary;
    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(52);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
