package com.alexnguef;

public class SpeakerFactory {
    public Speaker getSpeaker() {
        return new SonySpeaker();
    }
}
