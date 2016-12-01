package hrapplication.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import hrapplication.model.Person;

import org.springframework.batch.item.ItemProcessor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
        final String firstName = person.getFirstName().toUpperCase();
        final String lastName = person.getLastName().toUpperCase();
        final String color = person.getColor().toUpperCase();

        final Person transformedPerson = new Person(firstName, lastName, color);

        return transformedPerson;
    }

}
