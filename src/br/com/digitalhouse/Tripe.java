package br.com.digitalhouse;

public class Tripe {
    //Attributes
    private Boolean dobrado;
    private Integer alturaMinima;
    private Integer alturaMaxima;
    private Integer alturaAtual;

    //Constructor
    public Tripe(Boolean dobrado, Integer alturaMinima, Integer alturaMaxima, Integer alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }

    //Class methods
    public void definirAltura(Integer novaAltura) {
        this.alturaAtual = novaAltura;
        System.out.println("Altura alterada para: " + this.alturaAtual);
    }

    public void dobrar() {
        this.dobrado = true;
        System.out.println("Tripe dobrado.");
    }

    public void desdobrar() {
        this.dobrado = false;
        System.out.println("Tripe desdobrado.");
    }

    public void guardar() {
        if (this.prontoParaGuardar()) {
            System.out.println("Tripe guardado.");
        } else {
            System.out.println("Tripe não está pronto para ser guardado.");
        }
    }

    public Boolean prontoParaGuardar() {
        return this.alturaAtual == this.alturaMinima && this.dobrado;
    }

    public void usar() {
        if (this.prontoParaUsar()) {
            System.out.println("Usando o tripe.");
        } else {
            System.out.println("Tripe não está pronto para ser usado.");
        }
    }

    public Boolean prontoParaUsar() {
        return this.alturaAtual >= this.alturaMaxima / 2 && !this.dobrado;
    }

}
