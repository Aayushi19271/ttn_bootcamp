package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager4 {

    @Autowired
    public Worker4 worker4;

    Manager4(Worker4 worker4)
    {
        this.worker4 =worker4;
    }

    public void managework(){
        worker4.show();
    }
}

