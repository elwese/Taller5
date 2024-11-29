package Cliente;

public class ListViewStrategy implements TaskViewStrategy {
    @Override
    public void renderView(List<Task> tasks) {
        for (Task task : tasks) {
            System.out.println(task.getTitle());
        }
    }
}