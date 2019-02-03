package com.jiho.app;

import model.*;
import task.*;
import view.*;

/**
 * Hello world!
 *
 */
public class App 
{
    // new MainFrame();
    public static void main( String[] args )
    {
        NumberGenerater n = new NumberGenerater();
        n.start();
        new NumberChecker(n).start();
    }
}
