package com.mcl.Excepciones;

public class FormatoFormacion extends RuntimeException {
    public FormatoFormacion() {
        super("La formación no es adecuada");
    }
}
