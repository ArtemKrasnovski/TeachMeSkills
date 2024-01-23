package teachmeskills.lesson7.homework.Prog2;

public class Director implements PrintJobTitle {

    private final String jobTitle;
    private final String name;

    protected Director(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void print() {
        System.out.println("Сотрудник: " + name + " , " + "Должность: " + jobTitle);
    }
}
