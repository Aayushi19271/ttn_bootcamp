package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques4;

import org.springframework.stereotype.Component;

@Component
public class ExcellentWorker4 implements Worker4{
    private int id = 5;
    private String name = "Aayushi";

    @Override
    public void dowork() {
        System.out.println("Excellent Worker Class");
    }

    public void show(){

        System.out.println("The Id is: "+id+ "  The Name is: "+name);
    }
}
