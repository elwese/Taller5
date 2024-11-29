package Cliente;

public class SimpleTask implements Task {
    private String title;
    private boolean completed;

    public SimpleTask(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isComplete() {
        return completed;
    }

    @Override
    public void complete() {
        this.completed = true;
    }
}