public class Book <T>{
    protected T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }
}
