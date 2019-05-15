package lv.sda.spring.springboot.service;

import lv.sda.spring.springboot.entity.RegistrationFields;

import java.util.List;
import java.util.Optional;

public interface RegistrationService {

    List<RegistrationFields> getAllRegFields();
    List<RegistrationFields> getnotAllRegFields();
    Optional<RegistrationFields> getUserById (Long id);
    void save (RegistrationFields registrationFields);
    void delete (RegistrationFields registrationFields);

}
