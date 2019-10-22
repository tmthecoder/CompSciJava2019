/****
 * Name: Tejas Meha
 * Date: September 12, 2019
 * Lab Name: TelevisionLab
 * Extra: Added a volume decrement/increment setter to ask how much to lower/increase the volume by
 */
package com.tejasmehta;

public class Television {
    private String manufacurer;
    private int screenSize;
    private boolean powerOn;
    private int channel;
    private int volume;
    //Initial constructor(set all variables to default values)
    public Television(String brand, int size) {
        manufacurer = brand;
        screenSize = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }
    //Channel setter
    public void setChannel(int station) {
        channel = station;
    }
    //Power flipper(flip from true to false and vice versa
    public void power() {
        powerOn = !powerOn;
    }
    //Increase volume bu 1
    public void increaseVolume(int amnt) {
        volume+=amnt;
    }
    //Decrease Volume by 1
    public void decreaseVolume(int amnt) {
        volume -= amnt;
    }
    //Get the channel
    public int getChannel() {
        return channel;
    }
    //Get the volume
    public int getVolume() {
        return volume;
    }
    //Get the manufacturer
    public String getManufacturer() {
        return manufacurer;
    }
    //Get the screen size
    public int getScreenSize() {
        return screenSize;
    }
}
