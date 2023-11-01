public interface Stack {
    // liefert true, falls Keller leer, sonst false
    boolean isEmpty();

    // legt neues Element x auf den Keller
    void push(int x);

    // liefert das oberste Kellerelement
    int peek();

    // löscht das oberste Kellerelement und gibt es zurück
    int pop();
}
