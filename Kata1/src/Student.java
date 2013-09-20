import java.util.Date;

public class Student {

    private String name;
    private Date birthdate;

    private Student(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getAge(Date birthdate) {
        return (int) 
                getYearsInDays(
                getDaysInHours(
                getHoursInMinutes(
                getMinutesInSeconds(
                getSecondsInMilliseconds(
                    today().getTime() - birthdate.getTime()
                )))));
    }

    private Date today() {
        return new Date();
    }

    private long getSecondsInMilliseconds(long milliseconds) {
        return milliseconds / 1000;
    }

    private long getMinutesInSeconds(long seconds) {
        return seconds / 60;
    }

    private long getHoursInMinutes(long minutes) {
        return minutes / 60;
    }

    private long getDaysInHours(long hours) {
        return hours / 24;
    }

    private double getYearsInDays(long days) {
        return days / 365.25;
    }
}
