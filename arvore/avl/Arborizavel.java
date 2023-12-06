public interface Arborizavel<T> {

    NoTriplo<T> getRaiz();
    void inserir(T dado);
    T apagar(T dado);
    boolean existe(T dado);  
    String imprimirPreOrdem();
    String imprimirEmOrdem();
    String imprimirPosOrdem();
}