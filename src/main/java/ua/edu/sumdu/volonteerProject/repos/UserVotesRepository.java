package ua.edu.sumdu.volonteerProject.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.edu.sumdu.volonteerProject.model.City;
import ua.edu.sumdu.volonteerProject.model.UserVote;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface UserVotesRepository extends JpaRepository<UserVote, UUID>
{
    public List<UserVote> getUserVotesByDateOfAnswerGreaterThanAndChatLocation_CityName(Date date, City city);
}