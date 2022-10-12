package com.reestts.solid.dip;

public interface PersonRepository {

    Person findById(Long id);

    Person create(Long id, String name);

}
