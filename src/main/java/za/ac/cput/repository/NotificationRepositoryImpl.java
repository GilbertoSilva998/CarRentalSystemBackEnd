package za.ac.cput.repository;


//Sinothando Masiki 219153841



import za.ac.cput.domain.Notification;
import java.util.ArrayList;
import java.util.List;



public class NotificationRepositoryImpl implements INotificationRepository {

    private static NotificationRepositoryImpl notificationRepository = null;
    private List <Notification> notiList = new ArrayList<>();

    private NotificationRepositoryImpl(){notiList = new ArrayList<Notification>();}

    public static NotificationRepositoryImpl  getNotificationRepository(){
        if (notificationRepository == null) {
            notificationRepository = new NotificationRepositoryImpl();
        }
        return notificationRepository;
    }

    @Override
    public Notification create(Notification notification) {
        boolean success = notiList.add(notification);
        if (!success) {
            return null;
        }
        return notification;
    }

    @Override
    public Notification read(String notificationId) {
        Notification notification = notiList.stream()
                .filter(s -> s.getNotificationId().equals(notificationId))
                .findAny()
                .orElse(null);
        return notification;
    }

    @Override
    public Notification update(Notification notification) {
        Notification oldNoti = read(notification.getNotificationId());
        if (oldNoti != null) {
            notiList.remove(oldNoti);
            notiList.add(notification);
            return notification;
        }
        return null;
    }

    @Override
    public boolean delete(String notificationId) {
        Notification deleteNoti = read(notificationId);
        if (deleteNoti == null) {
            notiList.remove(null);
            return false;
        }
        return true;
    }

    @Override
    public List<Notification> getAll() {
        return notiList;
    }

}


