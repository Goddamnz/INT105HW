/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework;

import Homework.Student;
import Homework.FailedStd;

public class TestHomework {

    public static void main(String[] args) {
       
        Student std1 = new Student(60130500127L,"patipan",18,"Aj.Olarn");
        FailedStd std2 = new FailedStd("high","Aj.umaporn",6013050079L,"cartoon",18,"Aj.Olarn");
        FailedStd std3 = new FailedStd("low","Aj.umaporn",6013050127L,"paitpan",18,"Aj.Olarn");
        
        System.out.println(std2.equals(std3));
        
    }

}
