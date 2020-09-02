package lesson.l10.lambda;

public class Start {
    private Task task;

    public Start(Task task) {
        this.task = task;
    }

    public void run(){
        task.task();
    }
}
