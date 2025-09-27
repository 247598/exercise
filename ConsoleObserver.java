package exercise2;



public class ConsoleObserver implements ScheduleObserver {
    @Override
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}