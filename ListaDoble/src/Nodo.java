public class Nodo {
    private String data;
    private Nodo next;
    private Nodo anterior;

    public Nodo(String data) {
        this.data = data;
        this.next = null;
        this.anterior = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}