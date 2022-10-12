package com.reestts.solid.dip;

/**
 * Dependency Inversion Principle (DIP).
 * We should invert the classic dependency between higher level modules and lower level modules, by abstracting their interaction.
 * In this way, the high-level PersonService doesn't care if you are using a LocalDatabase for development or a real database for production.
 * And for example, you can change your Hibernate implementation to another solution without your high-level service knowing what's going on.
 * We must use classes over interfaces.
 */
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
}
