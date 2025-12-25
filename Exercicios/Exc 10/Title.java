public class Title {
    private String name;
    private int yearOfRelease;
    private int durationInMinutes;

    public Title(String name, int yearOfRelease, int durationInMinutes) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
