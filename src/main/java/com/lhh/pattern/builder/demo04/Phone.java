package com.lhh.pattern.builder.demo04;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/16 19:45
 * @Description
 */
public class Phone {

    private String cpu;

    private String screen;

    private String memory;

    private String mainBoard;

    public Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainBoard = builder.mainBoard;
    }

    public static final class Builder {
        private String cpu;

        private String screen;

        private String memory;

        private String mainBoard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Phone createPhone() {
            return new Phone(this);
        }
    }
}
