package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques6;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker6 implements Worker6{
    @Override
    public void dowork() {
        System.out.println("Lazy Worker Class");
    }
}
