package com.boolck.dev.event;


import com.boolck.dev.model.Order;

// event request interface to support all required order ops
public interface InputEvent extends Comparable<InputEvent> {

    enum RequestType{
        NEW,UPDATE,CANCEL
    }

    RequestType getRequestType();

    Order getOrder();

    @Override
    default int compareTo(InputEvent other) {
        return this.getOrder().compareSeqNum(other.getOrder());
    }

}
