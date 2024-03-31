public class Main {
    public static void main(String[] args) {
        Library library = new Library();   // Создание библиотеки

        // Ниже для каждой книги выделеы части кода для создания тайтла, его карточки и добавление в библиотеку

        Book<String> book1 = new Book<>("Дорохедоро");
        library.addBook(book1, 1, "Автор Дорохедоро");
        LibraryCard<Integer, String> card1 = library.returnBook(1);

        Book<String> book2 = new Book<>("Доктор Стоун");
        library.addBook(book1, 2, "Автор Доктора Стоуна");
        LibraryCard<Integer, String> card2 = library.returnBook(2);

        Book<String> book3 = new Book<>("Страна самоцветов");
        library.addBook(book1, 3, "Автор Страны самоцветов");
        LibraryCard<Integer, String> card3 = library.returnBook(3);

        library.bookDemonstration(); // Использование метода демонстрации библиотеки
    }
}




//Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.
// Каждая книга должна содержать параметр типа T для ее названия.
//Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную
//карточку для определенной книги. Каждая карточка должна содержать параметры
// типов K для номера карточки и V для информации о книге.
//Создайте класс Library, который будет представлять библиотеку.
//У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
//Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.