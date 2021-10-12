/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

import java.util.*;

class Area
{
    float area(float a){
    return a*a;
    }
    float area(float x, float y)
    {
     return x *y;   
    }
    double area(double r)
    {
     return 3.14*r*r;
    }
}
public class AreaofShapes {
    public static void main(String args[])
    {
        Area ar = new Area();
        float a,x,y;
        double r;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the side of the square :");
        a=s.nextFloat();
        System.out.println("enter the length and breadth of rectangle : ");
        x=s.nextFloat();
        y=s.nextFloat();
        System.out.println("enter the radius of circle :");
        r=s.nextDouble();
        float sq=ar.area(a);
        float rec=ar.area(x, y);
        double cir=ar.area(r);
        System.out.println("Area of square is "+sq);
        System.out.println("Area of rectangle is "+rec);
        System.out.println("Area of circle is "+cir); 
    }
}
