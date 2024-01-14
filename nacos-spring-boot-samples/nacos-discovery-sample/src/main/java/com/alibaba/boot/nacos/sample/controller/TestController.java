package com.alibaba.boot.nacos.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class TestController {


    @GetMapping("/hello")
    Hello loadbalancerGetHello(){
        return new Hello("zhoufudun");
    }

    public static class Hello {

        private String message;

        Hello() {
        }

        Hello(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Hello that = (Hello) o;
            return Objects.equals(message, that.message);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message);
        }

    }
}
