package za.ac.cput.repository;

//Sinothando Masiki 219153841




import za.ac.cput.domain.Car;
import za.ac.cput.domain.Feedback;
import java.util.ArrayList;
import java.util.List;


public class FeedbackRepositoryImpl implements IFeedbackRepository {
    private static FeedbackRepositoryImpl feedbackRepository = null;
    private List<Feedback> feedList = new ArrayList<>();

    private FeedbackRepositoryImpl() {
        feedList = new ArrayList<Feedback>();
    }

    public static FeedbackRepositoryImpl getFeedbackRepository() {
        if (feedbackRepository == null) {
            feedbackRepository = new FeedbackRepositoryImpl();
        }
        return feedbackRepository;
    }



    @Override
    public Feedback create(Feedback feedback) {
        boolean success = feedList.add(feedback);
        if (!success) {
            return null;
        }
        return feedback;
    }

    @Override
    public Feedback read(String feedbackId) {
        Feedback feedback = feedList.stream()
                .filter(s -> s.getFeedbackId().equals(s))
                .findAny()
                .orElse(null);
        return feedback;

    }

    @Override
    public Feedback update(Feedback feedback) {
        Feedback oldFeed = read(feedback.getFeedbackId());
        if (oldFeed != null) {
            feedList.remove(oldFeed);
            feedList.add(feedback);
            return feedback;

        }
        return null;
    }

    @Override
    public boolean delete(String feedbackId) {
        Feedback deleteFeed = read(feedbackId);
        if (deleteFeed == null) {
            feedList.remove(null);
            return false;

    }
        return true;
    }


    @Override
    public List<Feedback> getAll() {
        return feedList;
    }
}


