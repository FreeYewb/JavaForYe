package com.bo.wen.ye.isthis;

public class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}
