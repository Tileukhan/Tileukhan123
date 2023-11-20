package Observer;

import java.util.ArrayList;
import java.util.List;

public class CourseSubject {
    private List<CourseObserver> observers = new ArrayList<>();
    public void addObserver(CourseObserver observer)
    {
        observers.add(observer);
    }
    public void removeObserver(CourseObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (CourseObserver observer : observers) {
            observer.update(message);
        }
    }
}
