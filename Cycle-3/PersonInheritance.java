/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

/**
3. Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers.
 */

import java.util.*;

class Person
{
    String name,gender,address;
    protected int age;
    Person() {}
    Person(String name,String gender,String address,int a)
    {
    this.name=name;
    this.gender=gender;
    this.address=address;
    this.age=a;
    }
    public void displayPerson()
    {
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("address :"+address);
        System.out.println("age :"+age);   
    }      
}
class Employee extends Person
{
    int empid,salary;
    String companyname,qualification;
    Employee(){}
    Employee(String n,String g,String addr,int a,int eid,String cname, String qual,int sal)
    {
    super(n,g,addr,a);
    empid=eid;
    companyname=cname;
    qualification=qual;
    salary=sal;
    }
     public void displayEmployee()
    {
        super.displayPerson();
        System.out.println("employee id :"+empid);
        System.out.println("company name :"+companyname);
        System.out.println("qualification :"+qualification);
        System.out.println("salary :"+salary);   
    }    
}
class Teacher extends Employee 
{
    String subject,department;
    int teacherid;
    Teacher(){}
    Teacher (String n,String g,String addr,int a,int eid,String cname,String qual,int sal,String sub,String dept,int tid)
    {
        super(n,g,addr,a,eid,cname,qual,sal);
        subject=sub;
        department=dept;
        teacherid=tid;
    }

    
    public void displayTeacher()
    {
        super.displayEmployee();
        System.out.println("teacher id :"+teacherid);
        System.out.println("subject :"+subject);
        System.out.println("department : "+department);   
    }   
}
public class PersonInheritance {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x;
        System.out.println("enter the no. of teachers :");
        x=s.nextInt();
        Teacher teacher[]=new Teacher[x];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<x;i++)
        {
        System.out.println("enter the name of teacher :");
        String n=sc.nextLine();
        System.out.println("enter the gender of teacher :");
        String g=sc.nextLine();
        System.out.println("enter the address of teacher :");
        String addr=sc.nextLine();
        System.out.println("enter the age of teacher :");
        int a=s.nextInt();
        System.out.println("enter the empid of teacher :");
        int eid=s.nextInt();
        System.out.println("enter the companyname of teacher :");
        String cn=sc.nextLine();
        System.out.println("enter the qualification of teacher :");
        String qual=sc.nextLine();
        System.out.println("enter the salary of teacher :");
        int sal=s.nextInt();
        System.out.println("enter the id of teacher :");
        int tid=s.nextInt();
        System.out.println("enter the subject of teacher :");
        String sub=sc.nextLine();
        System.out.println("enter the department of teacher :");
        String dept=sc.nextLine();
        Teacher t = new Teacher(n, g, addr, a, eid,cn,qual, sal, sub, dept, tid);
        teacher[i]=t;
        }
        for(Teacher t : teacher)
        {
        t.displayTeacher();
        }
    }
    
}
