package com.mihajlo.strukturepodataka;

public interface StrukturaPodataka<E> {
    void dodaj(E element);
    void obrisi(E element);
    int velicina();

    default void dodaj(E... elementi) {
        for (E e: elementi)
            this.dodaj(e);
    }

    default void obrisi(E... elementi) {
        for (E e: elementi)
            this.obrisi(e);
    }
}
