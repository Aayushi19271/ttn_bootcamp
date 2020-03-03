package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager3 {
    @Autowired
    public Worker3 worker3;

    Manager3(Worker3 worker3)
    {
        this.worker3 =worker3;
    }

    public void managework(){
        worker3.dowork();
    }
}