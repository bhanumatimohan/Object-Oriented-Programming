/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co5;

/**
 *
 * @author hp
 */

import java.applet.Applet;
import java.applet.*;
import java.awt.*;

public class appletdraw extends Applet {
    int x=300,y=100,r=50;
    public void paint(Graphics g){
    g.drawLine(30,20,80,90);
    g.drawString("Line", 10, 10);
    g.drawOval(100,10,50,50);
    g.drawRect(20,100,80,30);
    }
    
}
