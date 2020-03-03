package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques5;

import org.springframework.stereotype.Component;

@Component
public class LazyWorker5 implements Worker5{
    @Override
    public void dowork() {
        System.out.println("Lazy Worker Class");
    }
}
