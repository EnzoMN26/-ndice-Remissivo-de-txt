

/**
 * Esta classe guarda os numeros das paginas em que uma palavra ocorre.
 * @author Isabel H. Manssour
 */
public class ListaDeOcorrencias {
        
    // Classe interna Node
    private class Node {
        public int numeroDaPagina;
        public Node next;    
        public Node(int n) {
            numeroDaPagina = n;
            next = null;
        }
    }
    
    // Atributos
    private Node head;
    private Node tail;
    private int count;

    // Metodos 
    public ListaDeOcorrencias() {
        head = null;
        tail = null;
        count = 0;
    }
    
   
    public boolean isEmpty() {
        return (head == null);
    }   
    
  
    public int size() {
        return count;
    }  

 
    public boolean add(int numPagina)  {
        Node aux = head;
        for (int i = 0; i < count; i++) {
            if(aux.numeroDaPagina == numPagina){
                return false;
            }
            aux = aux.next;
        }
        Node n = new Node(numPagina);
        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
        return true;
    }  
    
 
    public Integer getElement(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == count-1){
            return tail.numeroDaPagina;
        }
        Node aux = head;
        int c = 0;
        while (c < index) {
            aux = aux.next;
            c++;
        }
        return (aux.numeroDaPagina);
    }
    

    public boolean contains(int numPagina) {
        if(head == null){
            return false;
        }
        Node aux = head;
        for (int i = 0; i < count; i++) {
            if(aux.numeroDaPagina == numPagina){
                return true;
            }
            aux = aux.next;
        }
        return false;
    }    
    
    @Override
    public String toString() {
        String a = "";
        Node aux = head;
        for (int i = 0; i < count; i++) {
            a += aux.numeroDaPagina + " ";
            aux = aux.next;
        }
        return a;
    }
}