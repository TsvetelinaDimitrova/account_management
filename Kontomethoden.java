package Kontoverwaltung;

public interface Kontomethoden {
    public abstract double zinsberechnung();
    /** Nachdem ein Interface nur aus abstrakten Methoden besteht, 
     * kann public abstract weggelassen werden.
     */
    void ausgabeKontoeigenschaften();
    
}
