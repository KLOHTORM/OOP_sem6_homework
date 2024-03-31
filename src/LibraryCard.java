public class LibraryCard<K, V>{
    protected K cardNum;
    protected V info;


    public K getCardNum() {  // Получения номера карты
        return cardNum;
    }
    public V getInfo() {  // Получение информации о книги
        return info;
    }


    public void setCard(K cardNum) {  // Выведение номера карты
        this.cardNum = cardNum;
    }
    public void setInfo(V info) {  // Выведение информации о книге
        this.info = info;
    }


    public LibraryCard(K cardNum, V info) {  // Выведение карты
        this.cardNum = cardNum;
        this.info = info;
    }
}
