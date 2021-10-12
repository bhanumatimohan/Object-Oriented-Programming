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
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class DoorColor extends Applet implements MouseListener {
Color color = Color.blue;
@Override
public void init()
{
    addMouseListener(this);
}
@Override
   public void paint(Graphics g)
{

int [] xCoords = { 40, 250, 460 };
int [] yCoords = { 200, 50, 200 };

super.paint(g);

g.drawRect(80, 200, 330, 260);
g.drawPolygon(xCoords , yCoords , 3);


g.setColor(this.color);
g.fillRect(190, 330, 100, 130);
}
@Override
   public void mouseClicked(MouseEvent e)
{
    this.color = Color.red;
    this.repaint();

}
@Override
public void mouseEntered(MouseEvent e) {}
@Override
public void mouseExited(MouseEvent e) {}
@Override
public void mousePressed(MouseEvent e) {}
@Override
public void mouseReleased(MouseEvent e) {}
}
