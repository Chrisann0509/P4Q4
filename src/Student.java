/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisann Lee
 */
public class Student {
   private String studentId;
   private String name;
   private int noOfQuiz;
   private int totalScore;
    
    public Student(){
        
    }
    public Student(String studentId,String name){
        
    }
    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
    
    public void setName(String name){
        this.name=name;
    }
   
   
    public String getStudentId(){
        return studentId;
    }
    public String getname(){
        return name;
    }
    public int getNoOfQuiz(){
        return noOfQuiz;
    }
     public int getTotalScore(){
        return totalScore;
    }
   
    public void addQuiz(int score){
      
           noOfQuiz++;
      totalScore+=score;
          
    }
   
    public double getAverageScore(){
        return totalScore/noOfQuiz;
    }
    
    
  
    
    
}
