package com.main;

import com.models.Person;
import com.utils.JsonUtils;

public class Main {
    static void main(String[] args) {

        Person person = new Person("Angela", 23, "Rocco");

        JsonUtils.serializeToJson(person);
    }
}
