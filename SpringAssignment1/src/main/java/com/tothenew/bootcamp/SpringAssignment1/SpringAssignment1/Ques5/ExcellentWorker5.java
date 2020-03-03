package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExcellentWorker5 implements Worker5{
    @Override
    public void dowork() {

        System.out.println("Excellent Worker Class");
    }
}
