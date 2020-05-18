package com.example.demo;

public class Employee {
    private String firstName;
    private String lastName;
    private String SSN;
    private String DOB;

    public String hideSSN(String SSN){
        String tempString = "";
        for (int i = 0; i<SSN.length(); i++) {
            if (i < SSN.length() - 4) {
                tempString += "#";
            } else{
                tempString+=SSN.charAt(i);
            }
            if((i==2)||(i==4)){
                tempString+="-";
            }
        }
        return tempString;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
