package br.com.digitalhouse;

public class Exercicio4 {
    public static void main(String[] args) {
        Tripe tripeProntoParaUsar = new Tripe(false,1,4,2);
        Tripe tripeProntoParaGuardar = new Tripe(true,1,4,1);

        tripeProntoParaGuardar.guardar(); //true
        tripeProntoParaGuardar.usar(); //false

        tripeProntoParaUsar.guardar(); //false
        tripeProntoParaUsar.usar(); //true

        tripeProntoParaGuardar.desdobrar();
        tripeProntoParaGuardar.definirAltura(2);

        tripeProntoParaUsar.dobrar();
        tripeProntoParaUsar.definirAltura(1);

        tripeProntoParaGuardar.guardar(); //false
        tripeProntoParaGuardar.usar(); //true

        tripeProntoParaUsar.guardar(); //true
        tripeProntoParaUsar.usar(); //false

    }
}
