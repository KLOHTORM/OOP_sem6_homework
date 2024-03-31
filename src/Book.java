public class Book <T>{
    protected T title;

    public Book(T title) {  // Создание названия книги
        this.title = title;
    }

    public T getTitle() {  // Получение названия книги
        return title;
    }

    public void setTitle(T title) {  // Выведение названия книги
        this.title = title;
    }
}
