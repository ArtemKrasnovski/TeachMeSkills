package teachmeskills.lesson7.homework.Prog2;

public class Director implements PrintJobTitle {

    String jobTitle;
    String name;

    Director(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void print() {
        System.out.println("Сотрудник: " + name + " , " + "Должность: " + jobTitle);
    }
}
