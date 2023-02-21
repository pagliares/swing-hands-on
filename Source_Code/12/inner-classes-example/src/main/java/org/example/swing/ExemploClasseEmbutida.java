
package org.example.swing;


public class ExemploClasseEmbutida {

    public Multiplicavel calcular(final int a, final int b) {
        class Interna implements Multiplicavel {

            public int produto() {
                return a * b; //usa a e b que sao constantes
            }
        }
        return new Interna();
    }

    public static void main(String[] args) {
        Multiplicavel m = (new ExemploClasseEmbutida()).calcular(2, 3);
        int produto = m.produto();
        System.out.println(produto);
    }
}