import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    protected List<LibraryCard<Integer, String>> books;

    public Library(){
        this.books = new ArrayList<>();
    }

    public <T> void addBook(Book<T> book, int cardNum,String autor){
        LibraryCard<Integer, String> card = new LibraryCard<>(cardNum, "Автор" + autor);
        books.add(card);
    }

    public LibraryCard<Integer, String> returnBook (int cardNum){
        for (LibraryCard<Integer, String> card : books){
            if (card.getCardNum() == cardNum){
                return card;
            }
        }
        return null;
    }

    public void bookDemonstration(){
        for (LibraryCard<Integer, String> card : books){
            System.out.println("Номер карты: " + card.getCardNum() + "Название книги: " + card.getInfo());
        }
    }
}