package za.ac.cput.repository;

//Sinothando Masiki 219153841

import za.ac.cput.domain.Car;
import za.ac.cput.domain.Notification;

import java.util.List;

public interface INotificationRepository extends IRepository<Notification, String> {
        public List<Notification> getAll();
}

