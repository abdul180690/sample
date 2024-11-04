package com.java.oops.concepts.boot;

import com.java.oops.concepts.SwitchBoard;

public class InnerClassDemo {
    public static void main(String[] args) {
        SwitchBoard sb=new SwitchBoard();
        sb.getBoardDetails();
        SwitchBoard.Switch ss=new SwitchBoard.Switch();
        ss.off();
    }
}
