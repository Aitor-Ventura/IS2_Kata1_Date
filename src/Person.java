import java.util.Date;

public class Person {
    private String name;
    private Date birthDate;


    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public long getAge(){
        return getYearsInDays(
            getDaysInHours(
                getHoursInMinutes(
                    getMinutesInSeconds(
                        getSecondsInMilliseconds(
                            (today().getTime() - birthDate.getTime()))))));
    }

    private Date today(){
        return new Date();
    }

    private long getSecondsInMilliseconds(long milliseconds){
        return milliseconds / 1000;
    }

    private long getMinutesInSeconds(long seconds){
        return seconds / 60;
    }

    private long getHoursInMinutes(long minutes){
        return minutes / 60;
    }

    private long getDaysInHours(long hours){
        return hours / 24;
    }

    private long getYearsInDays(long days){
        return (long) (days / 365.25);
    }
}
