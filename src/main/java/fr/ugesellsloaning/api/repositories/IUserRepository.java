package fr.ugesellsloaning.api.repositories;

import fr.ugesellsloaning.api.entities.RequestBorrow;
import fr.ugesellsloaning.api.entities.User;
import fr.ugesellsloaning.api.entities.WaitingList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserRepository extends CrudRepository<User, Long> {
    List<User> findAllByLogin(String login);
    User findByEmail(String email);
    User findById(long id);

}
