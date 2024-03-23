public class LibraryCard<K, V>{
    protected K cardNum;
    protected V info;


    public K getCardNum() {
        return cardNum;
    }
    public V getInfo() {
        return info;
    }


    public void setCard(K cardNum) {
        this.cardNum = cardNum;
    }
    public void setInfo(V info) {
        this.info = info;
    }


    public LibraryCard(K cardNum, V info) {
        this.cardNum = cardNum;
        this.info = info;
    }
}
