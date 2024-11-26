package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void savePerson(Person person){
        personRepository.save(person);
    }



    public Person getPersonByEmployeeId(String employeeId){
        return personRepository.findByEmployeeId(employeeId);
    }

    // Placeholder method to retrieve a person by employeeId
   /* public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Person();
    }*/
}
