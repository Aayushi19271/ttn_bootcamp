package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques3;

import org.springframework.stereotype.Component;

@Component
public class ExcellentWorker3 implements Worker3{
    @Override
    public void dowork() {
        System.out.println("Excellent Worker Class");
    }

}
