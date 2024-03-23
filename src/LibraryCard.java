public class LibrsryCard <K, V>{
    protected K card;
    protected V info;


    public K getCard() {
        return card;
    }
    public V getInfo() {
        return info;
    }


    public void setCard(K card) {
        this.card = card;
    }
    public void setInfo(V info) {
        this.info = info;
    }


    public LibrsryCard(K card, V info) {
        this.card = card;
        this.info = info;
    }
}
