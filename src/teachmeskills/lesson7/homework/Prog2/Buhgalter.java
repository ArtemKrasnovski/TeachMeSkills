package teachmeskills.lesson7.homework.Prog2;

public class Buhgalter implements PrintJobTitle {

    private final String jobTitle;
    private final String name;

    protected Buhgalter(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void print() {
        System.out.println("Сотрудник: " + name + " , " + "Должность: " + jobTitle);
    }
}
