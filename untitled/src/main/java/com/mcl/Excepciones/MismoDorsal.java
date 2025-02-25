package com.mcl.Excepciones;

public class MismoDorsal extends RuntimeException {
    public MismoDorsal() {
        super("No puedes usar el dorsal de otro jugador");
    }
}
