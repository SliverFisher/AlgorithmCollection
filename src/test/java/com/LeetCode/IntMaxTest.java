package com.LeetCode;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @Author:Wendy
 * @Date:2020/11/14 11:16
 */
public class IntMaxTest {
    @Test
    public void name() {
        assertThat(Integer.MAX_VALUE+1).isEqualTo(Integer.MIN_VALUE);
        System.out.println("最大："+(Integer.MAX_VALUE));
        System.out.println("最小："+(Integer.toBinaryString(Integer.MIN_VALUE)));
    }


}
