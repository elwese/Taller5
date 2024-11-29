public class TaskManagerFacade {
    private List<Task> tasks = new ArrayList<>();
    private TaskViewStrategy viewStrategy;

    public TaskManagerFacade(TaskViewStrategy viewStrategy) {
        this.viewStrategy = viewStrategy;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void completeTask(Task task) {
        task.complete();
        notifyObservers(task);
    }

    public void changeView(TaskViewStrategy strategy) {
        this.viewStrategy = strategy;
    }

    public void renderTasks() {
        viewStrategy.renderView(tasks);
    }

    private void notifyObservers(Task task) {
        
    }
}