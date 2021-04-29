package com.LeetCode.backTracking;

/**
 * @Author:Wendy
 * @Date:2021/1/3 21:58
 */
public class Input {
    private Direction direction;
    private KeyBoardState keyBoardState;

    public Input(Direction direction, KeyBoardState keyBoardState) {
        this.direction = direction;
        this.keyBoardState = keyBoardState;
    }

    public Direction getDirection() {
        return direction;
    }

    public KeyBoardState getKeyBoardState() {
        return keyBoardState;
    }
}

enum Direction {
    LEFT, RIGHT, TOP, DOWN;
}

enum KeyBoardState {
    UP, DOWN
}

enum BallState {
    TOUCHING, ALONE
}

class Ball {
    private String color;
    private BallState ballState;

    /**
     * 碰撞回调
     */
    public void touch(Input input) {
        if (this.ballState == BallState.TOUCHING) {
            if (input.getKeyBoardState() == KeyBoardState.DOWN) {
                this.color = "yellow";
            } else {
                this.color = "green";
            }
        } else {
            if (input.getKeyBoardState() == KeyBoardState.DOWN) {
                this.color = "red";
            } else {
                this.color = "green";
            }
        }
    }
}
