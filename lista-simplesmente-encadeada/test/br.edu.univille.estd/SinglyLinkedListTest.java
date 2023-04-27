package br.edu.univille.estd;

import estd.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void listaVazia(){
        var list = new SinglyLinkedList();
        assertEquals(0,list.size(),"Tamanho da lista deve ser 0");
        assertTrue(list.isEmpty(),"Lista deve estar vazia");
    }

    @Test
    void obterPrimeiroElementoDeListaVazia(){
        var list = new SinglyLinkedList();
        try{
            list.getFirst();
            fail("Deve lançar a exceção SinglyLinkedList.NoSuchElementException ao obter um elemento em um lista vazia.");
        }catch (SinglyLinkedList.NoSuchElementException ignored){}
    }

    @Test
    void obterUltimoElementoDeListaVazia(){
        var list = new SinglyLinkedList();
        try{
            list.getFirst();
            fail("Deve lançar a exceção SinglyLinkedList.NoSuchElementException ao obter um elemento em um lista vazia.");
        }catch (SinglyLinkedList.NoSuchElementException ignored){}
    }

    @Test
    void removerPrimeiroElementoDeListaVazia(){
        var list = new SinglyLinkedList();
        try{
            list.removeFirst();
            fail("Deve lançar a exceção SinglyLinkedList.NoSuchElementException ao remover um elemento em um lista vazia.");
        }catch (SinglyLinkedList.NoSuchElementException ignored){}
    }


    @Test
    void removerUltimoElementoDeListaVazia(){
        var list = new SinglyLinkedList();
        try{
            list.removeLast();
            fail("Deve lançar a exceção SinglyLinkedList.NoSuchElementException ao remover um elemento em um lista vazia.");
        }catch (SinglyLinkedList.NoSuchElementException ignored){}
    }

    @Test
    void adicionarUmElementoNaLista(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        assertEquals(1,list.size(),"Tamanho da lista deve ser 1");
        assertFalse(list.isEmpty(),"Lista não deve estar vazia");
    }

    @Test
    void obterPrimeiroElementoDaListaComUmElementoAdicionadosNaCabeca(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        assertEquals(1,list.getFirst(),"O primeiro elemento deve ser o 1");
    }

    @Test
    void obterPrimeiroElementoDaListaComVariosElementosAdicionadosNaCabeca(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        assertEquals(4,list.getFirst(),"O primeiro elemento deve ser o 4");
        assertEquals(4,list.size(),"O Tamanho da lista deve ser o 4");
    }

    @Test
    void obterPrimeiroElementoDaListaComUmElementoAdicionadosNaCauda(){
        var list = new SinglyLinkedList();
        list.addLast(1);
        assertEquals(1,list.getFirst(),"O primeiro elemento deve ser o 1");
    }

    @Test
    void obterPrimeiroElementoDaListaComVariosElementosAdicionadosNaCauda(){
        var list = new SinglyLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        assertEquals(1,list.getFirst(),"O primeiro elemento deve ser o 1");
        assertEquals(4,list.size(),"O Tamanho da lista deve ser o 4");
    }

    @Test
    void obterUltimoElementoDaListaComUmElemento(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        assertEquals(1,list.getLast(),"O ultimo elemento deve ser o 1");
    }


    @Test
    void obterUltimoElementoDaListaComVariosElementos(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        assertEquals(1,list.getLast(),"O ultimo elemento deve ser o 1");
        assertEquals(5,list.size(),"O Tamanho da lista deve ser o 5");
    }

    @Test
    void obterElementosDaListaComElementosAdicionadosNaCaudaECabeca(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        list.addFirst(5);
        assertEquals(4,list.getLast(),"O ultimo elemento deve ser o 4");
        assertEquals(5,list.getFirst(),"O ultimo primeiro deve ser o 5");
        assertEquals(5,list.size(),"O Tamanho da lista deve ser o 5");
    }

    @Test
    public void obterUltimoElementoNaListaComElementosAdicionadosNasDuasPontas(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(4);
        list.addLast(5);
        assertEquals(5,list.getLast(),"O ultimo elemento deve ser o 5.");
        assertEquals(4,list.getFirst(),"O primeiro elemento deve ser o 4.");
    }

    @Test
    public void transFormarAListaEmTexto(){
        var list = new SinglyLinkedList();
        assertEquals("[]",list.toString(),"A lista deve ser []");
        list.addFirst(1);
        assertEquals("[1]",list.toString(),"A lista deve ser [1]");
        list.addFirst(2);
        assertEquals("[2,1]",list.toString(),"A lista deve ser [2,1]");
        list.addLast(3);
        assertEquals("[2,1,3]",list.toString(),"A lista deve ser [2,1,3]");
        list.addLast(5);
        assertEquals("[2,1,3,5]",list.toString(),"A lista deve ser [2,1,3,5]");
        list.addFirst(8);
        assertEquals("[8,2,1,3,5]",list.toString(),"A lista deve ser [8,2,1,3,5]");
    }
    @Test
    void removerDaCabecaEDeixarAListaVazia(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(1);
        list.removeFirst();
        list.removeFirst();
        assertTrue(list.isEmpty(),"A lista deve estar vazia");
        assertEquals(0,list.size(),"O Tamanho da lista deve ser  0");
    }


    @Test
    void removerDaCaudaEDeixarAListaVazia(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(1);
        list.removeLast();
        list.removeLast();
        assertTrue(list.isEmpty(),"A lista deve estar vazia");
        assertEquals(0,list.size(),"O Tamanho da lista deve ser  0");
    }

    @Test
    void conferirElementoRemovidoDaCabeca(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        var removido = list.removeFirst();
        assertEquals(2,removido,"O elemento removido deve ser o 2.");
    }


    @Test
    void conferirElementoRemovidoDaCauda(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        var removido = list.removeLast();
        assertEquals(1,removido,"O elemento removido deve ser o 1.");
    }

    @Test
    void removerDaCaudaECabeca(){
        var list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(4);
        list.addLast(5);
        list.addFirst(6);
        list.removeLast();
        list.removeFirst();
        assertEquals(3,list.getLast(),"O ultimo elemento deve ser o 3.");
        assertEquals(4,list.getFirst(),"O primeiro elemento deve ser o 4.");
    }

}