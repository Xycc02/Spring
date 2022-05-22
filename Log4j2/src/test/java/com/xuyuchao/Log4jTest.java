package com.xuyuchao;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: xuyuchao
 * @Date: 2022-04-26-23:32
 * @Description:
 */
public class Log4jTest {
    private static final Logger log = LoggerFactory.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        log.info("Hello log4j2");
        log.warn("Hello log4j2");
    }
}
