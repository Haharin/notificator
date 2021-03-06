import java.time.LocalDateTime;
import java.util.List;

public class Task {

//    private User ownerUser;

    private String name;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime notificationDateTime;
    private String description;

    public Task() {
    }

//    public User getOwnerUser() {
//        return ownerUser;
//    }

//    public void setOwnerUser(User ownerUser) {
//        this.ownerUser = ownerUser;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public LocalDateTime getNotificationDateTime() {
        return notificationDateTime;
    }

    public void setNotificationDateTime(LocalDateTime notificationDateTime) {
        this.notificationDateTime = notificationDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
//        sb.append("ownerUser=").append(ownerUser);
        sb.append("name='").append(name).append('\'');
        sb.append(", startDateTime=").append(startDateTime);
        sb.append(", endDateTime=").append(endDateTime);
        sb.append(", notificationDateTime=").append(notificationDateTime);
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
