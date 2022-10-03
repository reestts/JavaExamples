package com.reestts.deepcopy;

public class Engine {

    private int hp;
    private String type;

    public Engine(final int hp, final String type) {
        this.hp = hp;
        this.type = type;
    }

    public Engine(Engine engine) {
        this(engine.getHp(), engine.getType());
    }

    public int getHp() {
        return hp;
    }

    public void setHp(final int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "hp=" + hp +
                ", type='" + type + '\'' +
                '}';
    }
}
