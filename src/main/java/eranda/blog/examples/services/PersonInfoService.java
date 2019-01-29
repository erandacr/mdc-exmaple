package eranda.blog.examples.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eranda.blog.examples.entities.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PersonInfoService {

  private static final Logger logger = LoggerFactory.getLogger(PersonInfoService.class);

  public Person getPersonInfo(String personId) {
    // generate a sample person info
    Person person = new  Person(personId, "John", 27);

    ObjectMapper mapper = new ObjectMapper();
    try {
      logger.info("Person info retrieved. Content: " + mapper.writeValueAsString(person));
    } catch (JsonProcessingException e) {
      logger.error("error while logging", e);
    }

    return person;
  }
}
