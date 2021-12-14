package com.base;

import com.ui.MainUI;
import com.db.Conn;

public class App {
    public static void main(String[] args){
        System.out.println( "Hello World!" );

        Conn.main();
        //MainUI.main();
    }
}
