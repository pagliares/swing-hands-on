package org.example.swing;

 public class ExemploClasseInternaEstatica {
 
    public static class InternaUm {

        public static int campoInterna1;

        public static void metodoInterno() {
            System.out.println("Dentro de Interna 1");
            System.out.println("Atribuindo campoInterna1 para 15");
            campoInterna1 = 15;
        }
    }

    public static class InternaDois extends InternaUm {

        public static int campoInterna2;

        public static void metodoInterno() {
            System.out.println("Dentro de Interna 2");
            System.out.println("Atribuindo campoInterna2 para 55");
            campoInterna2 = 55;
        }
    }
    

    public static void main(String[] args) {
        InternaUm.metodoInterno();
        System.out.println(InternaUm.campoInterna1);

        InternaDois.metodoInterno();
        System.out.println(InternaDois.campoInterna2);
    }
}