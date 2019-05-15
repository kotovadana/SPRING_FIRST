package lv.sda.spring.springboot.repository;

import lv.sda.spring.springboot.entity.RegistrationFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersRepository extends JpaRepository<RegistrationFields, Long> {
    @Query(value = "SELECT i FROM RegistrationFields i WHERE privateInfo = false")
    List<RegistrationFields> findAllNonPrivateUsers();
    List<RegistrationFields> findAllPrivateUsers(boolean privateInfo);
    List<RegistrationFields> findAllByEmail(String email);

}
