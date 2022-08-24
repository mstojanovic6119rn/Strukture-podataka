package com.mihajlo.strukturepodataka.primeri;

import com.mihajlo.strukturepodataka.StrukturaPodataka;

class Stablo<E extends Comparable<E>> implements StrukturaPodataka<E> {

    private E element;
    private Stablo<E> desno;
    private Stablo<E> levo;

    public Stablo(E element) {
        this.element = element;
    }

    @Override
    public void dodaj(E element) {

        Stablo<E> novoStablo = new Stablo<>(element);

        if(this.element.compareTo(element)<0){
            if(desno == null){
                this.desno = novoStablo;
            }else{
                this.desno.dodaj(element);
            }
        }else{
            if(levo == null){
                this.levo = novoStablo;
            }else{
                this.levo.dodaj(element);
            }
        }
    }

    @Override
    public void obrisi(E element) {

    }

    @Override
    public int velicina() {
        return 0;
    }
}
