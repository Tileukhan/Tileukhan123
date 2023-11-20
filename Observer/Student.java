package Observer;

public class Student implements CourseObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " received update: " + message);
    }
}
