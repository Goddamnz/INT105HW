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
public class FailedStd extends Student {

    String level;
    String FailedadvisorName;

    public FailedStd() {
    }

    public FailedStd(double score, String FailedadvisorName) {
        this.level = level;
        this.FailedadvisorName = FailedadvisorName;
    }

    public FailedStd(String level, String FailedadvisorName, long id, String name, int credit,String yearAdvisorName) {
        super(id, name, credit,yearAdvisorName);
        this.level = level;
        this.FailedadvisorName = FailedadvisorName;
    }

    @Override
    public String toString() {
        return super.toString()+"FailedStd\n" + "\nlevel : " + level + "\nFailedadvisorName : " + FailedadvisorName;
    }
    
    @Override
    public boolean equals(Object obj) {
        FailedStd temp;
        if (obj != null && obj instanceof Student) {
            temp = (FailedStd) obj;
            if (this.level.equals(temp.level) && this.FailedadvisorName.equals(temp.FailedadvisorName)) {
                return true;
            }

        }

        return false;
    }

    

}