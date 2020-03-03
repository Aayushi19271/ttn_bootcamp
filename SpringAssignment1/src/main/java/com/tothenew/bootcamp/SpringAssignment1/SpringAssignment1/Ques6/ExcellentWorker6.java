package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExcellentWorker6 implements Worker6 {
    @Override
    public void dowork() {
        System.out.println("Excellent Worker Class");
    }
}
