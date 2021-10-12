/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
Create a class ‘Employee’ with data members Empid, Name, Salary, Address and
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the
properties of class employee and contain its own data members department, Subjects taught
and constructors to initialize these data members and also include display function to
display all the data members. Use array of objects to display details of N teachers.
 */

import java.util.*;

class Employee
{
    int empid;
    String name;
    double salary;
    String address;
    Employee() {}
    Employee(int empid,String name,double salary,String address)
    {
    this.empid=empid;
    this.name=name;
    this.salary=salary;
    this.address=address;
    }
}

class Teacher extends Employee {
    String department,subjects;
    Teacher(int empid,String name,double salary,String address,String department,String subjects)
    {
        super(empid,name,salary,address);
        this.department=department;
        this.subjects=subjects;
    }
    public void display()
    {
        System.out.println("teacher's id :"+empid);
        System.out.println("teacher's name :"+name);
        System.out.println("teacher's salary :"+salary);
        System.out.println("teacher's address :"+address);
        System.out.println("teacher's department :" +subjects);
    }  
}
public class ArrayofTeachers
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the no. of teachers:");
    int n=s.nextInt();
    Teacher teacher[]=new Teacher[n];
    int tid,i;
    String name,address,department,subjects;
    double salary;
    for(i=0;i<n;i++)
    {
     System.out.println("\nenter the delails of teacher" +i+"\n");
     System.out.println("enter the teacher's id :");
     tid=s.nextInt();
     System.out.println("enter the teacher's name :");
     name=s.next();
     System.out.println("enter the teacher's salary :");
     salary=s.nextDouble();
     System.out.println("enter the teacher's address :");
     address=s.next();
     System.out.println("enter the teacher's department :");
     department=s.next();
     System.out.println("enter the teacher's subjects :");
     subjects=s.next();
     Teacher t= new Teacher(tid,name,salary,address,department,subjects);
     teacher[i]=t;
    }
    System.out.println("teachers are :\n");
    for (Teacher x :teacher){
        x.display();
    }
    }
}