package com.alexnguef;

public class WheelFactory {
    public Wheel getWheel() {
        return new MichelinWheel();
    }
}
