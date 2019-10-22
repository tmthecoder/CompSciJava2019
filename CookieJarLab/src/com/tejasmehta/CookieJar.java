/****
 * Name: Tejas Mehta
 * Date: September 20th, 2019
 * Lab Name: CookieJarLab
 * Extra: Same as on main
 */
package com.tejasmehta;

import java.awt.*;

public class CookieJar {
    //Private vars
    private int capacity;
    private int cookies = 0;
    //Constructor
    CookieJar(int capacity) {
        this.capacity = capacity;
    }
    //Checks if it is full, returns said value
    boolean isFull() {
        if (cookies >= capacity) {
            return true;
        } else {
            return false;
        }
    }
    //Add cookies on given value
    int addCookies(int cookies) {
        this.cookies += cookies;
        //beep value
        if (this.cookies > capacity) {
            Toolkit.getDefaultToolkit().beep();
        }
        return this.cookies;
    }
    //Get the space left
    int spaceLeft() {
        return Math.max(capacity - cookies, 0);
    }
}
