package com.reestts.solid.dip;

import java.util.Map;

public class LocalRepository implements PersonRepository {

    private Map<Long, Person> repository;

    @Override
    public Person findById(final Long id) {
        return null;
    }

    @Override
    public Person create(final Long id, final String name) {
        return null;
    }
}
