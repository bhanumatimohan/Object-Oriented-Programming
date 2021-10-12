/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

/**
Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a student. 
 */

interface Student
{
int score=10;
void displayStudentScore();
}
interface Sports
{
int score=25;
void displaySportScore();
}
 class Result implements Student , Sports 
{
  public void displayStudentScore()
  {
      System.out.println("Academics scores :"+Student.score);
  } 
   public void displaySportsScore()
  {
      System.out.println("Sports scores :"+Sports.score);
  } 

    @Override
    public void displaySportScore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class AcademicSportResult 
{
    public static void main(String args[])
    {
        Result r= new Result();
        r.displayStudentScore();
        r.displaySportsScore();
    }  
}
