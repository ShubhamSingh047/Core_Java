package com.emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String altEmila;

    //Construct to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //Ask for department
    public String getDepartment(){
        System.out.println("Enter the department \n1 for sales \n2 for Development \n3 for Accounting \n0 for none");
        Scanner s=new Scanner(System.in);
        int sel=s.nextInt();
       switch (sel){
           case 1:
               this.department="Sales";
               break;
           case 2:
               this.department="Development";
               break;
           case 3:
               this.department="Accounting";
               break;
           default:
               this.department="Invalid Department";
               break;
       }
       if(sel>=0 && sel <=3){
           System.out.println(firstName+" belog to "+department);
       }
        else {
           System.out.println("User not found or "+ this.department);
       }
        return department;
    }

    //Generate a random password;


    //Set the mailBox capacity

    //Change the password;

}
