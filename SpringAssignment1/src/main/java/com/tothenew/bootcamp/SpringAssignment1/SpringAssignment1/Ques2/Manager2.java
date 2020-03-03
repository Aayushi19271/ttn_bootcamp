package com.tothenew.bootcamp.SpringAssignment1.SpringAssignment1.Ques2;

public class Manager2 {
    Worker2 worker2;

    Manager2(Worker2 worker2)
    {
        this.worker2=worker2;
    }

    void work(){
        worker2.dowork();
    }
}
