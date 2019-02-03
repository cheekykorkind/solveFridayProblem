package com.jiho.app;

import model.*;
import task.*;
import view.*;

/**
 * Maven프로젝트 시작점
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
