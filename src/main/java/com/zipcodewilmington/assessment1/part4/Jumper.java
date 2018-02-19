package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    public int jumps(int heightOfFlag, int jumpHeight) {

        if(jumpHeight == heightOfFlag) {
            return 1;
        } else if (jumpHeight > heightOfFlag || jumpHeight == 1) {
            return heightOfFlag;
        }

        return jumpsHigherThanFlag(heightOfFlag, jumpHeight);
    }

    public int jumpsHigherThanFlag(int flagHeight, int jumpHeight) {
        int type2Jump = (int)Math.floor(flagHeight/jumpHeight);
        return type2Jump + (flagHeight - (type2Jump * jumpHeight));
    }
}
