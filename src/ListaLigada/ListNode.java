package ListaLigada;

public class ListNode <T>{
    private int size;
    private Node<T> start;
    private Node<T> end;

    public void addElement(T element){
        Node<T> node = new Node<T>(element);

        if(this.size == 0){
            this.start = node;
        }else {
            this.end.setNext(node);
        }

        this.end = node;
        this.size++;
    }

    public T removeFirstElement(){
        if(this.size == 0){
            throw new RuntimeException("Posição invalida paizão");
        }

        T element = this.start.getData();
        this.start = this.start.getNext();
        this.size--;

        if(this.size == 0){
            this.end = null;
        }

        return element;
    }

    public void remove(T element){

    }


    @Override
    public String toString() {
        if(this.size == 0)
            return "[]";


        StringBuilder builder = new StringBuilder();
        Node<T> current = this.start;

        builder.append("[");

        for(int i = 0; i < this.size - 1; i++){
            builder.append(current.getData() + ",");
            current = current.getNext();

        }
        builder.append(current.getData());

        builder.append("]");

        return builder.toString();
    }
}
