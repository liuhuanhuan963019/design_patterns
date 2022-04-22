package com.lhh.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/4/22 21:14
 */
public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
    public void add(Animal animal) {
        nodeList.add(animal);
    }

}
