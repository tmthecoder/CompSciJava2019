/****
 * Name: Tejas Mehta
 * Date: September 20th, 2019
 * Lab Name: CookieJarLab
 * Extra: Rang the terminal bell if there are too many cookies in the jar
 */
package com.tejasmehta;

public class Main {

    public static void main(String[] args) {
        //Constructor and sample case from lab doc
        CookieJar c = new CookieJar( 3000 ); //sets capacity to 300
        System.out.println( c.isFull( ) ); //cookiejar is not full
        c.addCookies( 500 ); //add 500 items
        System.out.println( c.isFull( ) ); //cookiejar is not full
        System.out.println( c.addCookies( 2000 ) ); //add 2000 items
        System.out.println( c.spaceLeft( ) ); //space left is 500
        System.out.println( c.isFull( ) ); //cookiejar is not full
        System.out.println( c.addCookies( 2000 ) ); //attempt to add 2000
        System.out.println( c.spaceLeft( ) ); //no space left – returns 0
        System.out.println( c.isFull( ) );
    }
}
