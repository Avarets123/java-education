public class Main {
    public static   void main(String[] args) {
        EvenNumbersPrintTask evens = new EvenNumbersPrintTask(3, 20);
        OddNumbersPrintTask odds = new OddNumbersPrintTask(4, 17);

        Task[] tasks = {evens, odds};

        completeAllTasks(tasks);
    }

    public static void completeAllTasks(Task[] tasks) {
        for (Task task : tasks) {
            task.complete();
        }
    }
}