package com.mihajlo.strukturepodataka.primeri;

import com.mihajlo.strukturepodataka.StrukturaPodataka;

class Lista<E extends Comparable<E>> implements StrukturaPodataka<E> {

    static <E extends Comparable<E>> Lista<E> napraviGlavu() {
        return new Lista<>(null);
    }

    private E element;

    private Lista<E> sledeci;

    private Lista(E element) {
        this.element = element;
    }

    @Override public void dodaj(E element) {
        Lista<E> lista = new Lista<>(element);
        if (this.sledeci == null)
            this.sledeci = lista;
        else if (this.sledeci.element.compareTo(element) < 0)
            this.sledeci.dodaj(element);
        else {
            lista.sledeci = this.sledeci;
            this.sledeci = lista;
        }
    }

    @Override public void obrisi(E element) {
        if (this.sledeci == null)
            return;
        while (this.sledeci.element.equals(element))
            this.sledeci = this.sledeci.sledeci;
    }

    @Override public int velicina() {
        if (this.element == null)
            return this.sledeci.velicina();
        return 1 + this.sledeci.velicina();
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Lista<E> getSledeci() {
        return sledeci;
    }

    public void setSledeci(Lista<E> sledeci) {
        this.sledeci = sledeci;
    }
}
