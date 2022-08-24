package com.mihajlo.strukturepodataka;

/**
 * Interfejs koji definise sve vrste struktura podataka
 * @param <E> tip koji struktura podataka sadrzi
 */
public interface StrukturaPodataka<E> {

    /**
     * Dodavanje elementa u strukturu
     * @param element element koji se dodaje
     */
    void dodaj(E element);

    /**
     * Brisanje elementa iz strukture
     * @param element element koji se brise
     */
    void obrisi(E element);

    /**
     * Metoda koja vraca velicinu strukture
     * @return velicina strukture
     */
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
