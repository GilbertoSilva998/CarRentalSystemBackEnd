package za.ac.cput.repository;
//Sinothando Masiki 219153841


import za.ac.cput.domain.Feedback;
import java.util.List;

public interface IFeedbackRepository extends IRepository<Feedback, String> {
    public List<Feedback> getAll();


}
