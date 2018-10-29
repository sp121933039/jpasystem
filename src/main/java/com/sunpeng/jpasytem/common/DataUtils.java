package com.sunpeng.jpasytem.common;

import java.util.UUID;

public class DataUtils {

    public String getUid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
