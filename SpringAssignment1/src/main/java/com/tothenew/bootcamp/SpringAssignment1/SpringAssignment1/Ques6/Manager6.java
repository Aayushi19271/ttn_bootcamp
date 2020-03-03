package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager6 {
    public Worker6 worker6;

    @Autowired
    Manager6(Worker6 worker6)
    {
        this.worker6 =worker6;
    }

    public void managework(){
        worker6.dowork();
    }
}
