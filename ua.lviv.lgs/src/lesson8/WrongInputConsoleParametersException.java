package lesson8;

public class WrongInputConsoleParametersException extends Exception {
    private String monthName;
    private int amountOfDays;
    private String nameOfSeason;

    public WrongInputConsoleParametersException(String monthName, int amountOfDays, String nameOfSeason) {
        this.monthName = monthName;
        this.amountOfDays = amountOfDays;
        this.nameOfSeason = nameOfSeason;
    }

    public WrongInputConsoleParametersException(String message) {
        super(message);
    }

    public String getMonthName() {
        return monthName;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public String getNameOfSeason() {
        return nameOfSeason;
    }
}
