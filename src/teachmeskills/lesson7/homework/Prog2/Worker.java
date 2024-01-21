package teachmeskills.lesson7.homework.Prog2;

public class Worker implements PrintJobTitle {

    String jobTitle;
    String name;

    Worker(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void print() {
        System.out.println("Сотрудник: " + name + " , " + "Должность: " + jobTitle);
    }
}
