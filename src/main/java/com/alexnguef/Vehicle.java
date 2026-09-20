package com.alexnguef;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// This code example shows how it's cumbersome for developers to create
// manualy objects and to manage them without using an Inversion of Control (IoC).
// This code is highly coupled with different depending on classes and hard to maintain.
public class Vehicle {

    public void makeVehicle(){
        //SonySpeaker speaker = new SonySpeaker();
        Speaker speaker = new SpeakerFactory().getSpeaker();
        System.out.println(speaker.makeSound());

        //MichelinWheel wheel = new MichelinWheel();
        Wheel wheel = new WheelFactory().getWheel();
        System.out.println(wheel.moveVehicle());
    }
    static void main() {
        Vehicle vehicle = new Vehicle();
        vehicle.makeVehicle();
    }
}
