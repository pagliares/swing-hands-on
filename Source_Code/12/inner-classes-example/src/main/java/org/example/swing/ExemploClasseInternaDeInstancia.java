package org.example.swing;

public class ExemploClasseInternaDeInstancia {

    public int campoUm;
    
    private class Interna {
        public int campoUm;
        public int campoDois;

        public void metodoInterno() {
            this.campoUm = 10; //Externa.campoUm
            System.out.println("Atributo campoUm da classe externa: " + this.campoUm);
            
            Interna.this.campoUm = 15;
            System.out.println("Atributo campoUm da classe interna acessado internamente: " + campoUm);
            
            this.campoDois = 50;
            System.out.println("Atributo campoDois da classe externa acessado internamente: " + campoDois);
        }
        
        public int getCampoUmClasseExterna() {
        	return this.campoUm;
        }
        
       
    } //fim da classe interna

   
    
    public static void main(String[] args) {
    	ExemploClasseInternaDeInstancia e = new ExemploClasseInternaDeInstancia();
        Interna i = e.new Interna();
        i.metodoInterno();
        System.out.println("CampoUm da classe interna acessado externamente..: "  + i.campoUm);
        System.out.println("CampoDois da classe interna acessado externamente..: "  + i.campoDois);
        System.out.println("CampoUm da classe externa acessado externamente..: "  + i.getCampoUmClasseExterna());

    }
} //fim da classe externa