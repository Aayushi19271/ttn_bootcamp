package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques5;

import com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques3.Worker3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager5 {
    @Autowired
    public Worker5 worker5;

    Manager5(Worker5 worker5)
    {
        this.worker5 =worker5;
    }

    public void managework(){
        worker5.dowork();
    }
}
