package eranda.blog.examples.controllers;

import eranda.blog.examples.entities.Person;
import eranda.blog.examples.services.PersonInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

  private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

  @Autowired
  private PersonInfoService personInfoService;

  @GetMapping("/person")
  public Person getPerson(@RequestParam("personId") String personId) {

    logger.info("Request received at the controller. PersonId: " + personId);

    return personInfoService.getPersonInfo(personId);

  }

}
