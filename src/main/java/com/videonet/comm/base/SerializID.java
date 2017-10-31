package com.videonet.comm.base;

import com.videonet.util.UuidUtil;

import java.io.Serializable;

/**
 * Created by tangjinhui on 2017/10/30.
 */
public class SerializID implements Serializable {

    private  String  id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SerializID() {
        this.id = UuidUtil.getUUID();
    }
}
