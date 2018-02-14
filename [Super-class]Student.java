/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework;

/**
 *
 * @author User
 */
public class Student {

    private long id;
    private String name;
    private int credit;
    private String yearAdvisorName;

    public Student() {
    }

    public Student(long id, String name, int credit,String yearAdvisorName) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.yearAdvisorName = yearAdvisorName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getYearAdvisorName() {
        return yearAdvisorName;
    }

    public void setYearAdvisorName(String yearAdvisorName) {
        this.yearAdvisorName = yearAdvisorName;
    }

    
    
    @Override
    public String toString() {
        return "Student id : " + id + "Student name : " + name + "Student sum credit : " + credit + "Student year advisor name : "+ yearAdvisorName;
    }

   
    
    
    

}
