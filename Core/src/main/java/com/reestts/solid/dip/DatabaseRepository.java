package com.reestts.solid.dip;

public class DatabaseRepository implements PersonRepository {

    // Hibernate entity manager to handle the communication towards the Database.
    private EntityManager entityManager;

    @Override
    public Person findById(final Long id) {
        return null;
    }

    @Override
    public Person create(final Long id, final String name) {
        return null;
    }
}
