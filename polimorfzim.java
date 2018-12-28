package com.company;

public class polimorfzi {
    XX[] tab = new XX[3];
    tab[0] = new X1();
    tab[1] = new X2();
    // i tak dalej
    tab[2] = new XX100();

    void pewnaMetoda(){
        for(XX x:tab)
            x.doSomething();
    }



}
