public abstract class AbstractNumbersPrintTask implements Task {

    protected int from;
    protected int to;

    public AbstractNumbersPrintTask(int from, int to) {
        if (from > to) {
            System.out.println("Неверный диапазон");
            return;
        }
        this.from = from;
        this.to = to;
    }

    @Override
    public abstract void complete();
}
