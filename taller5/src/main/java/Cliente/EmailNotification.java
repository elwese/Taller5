package Cliente;

public class EmailNotification implements Observer {
    @Override
    public void update(Task task) {
        System.out.println("Email: Task " + task.getTitle() + " updated.");
    }
}