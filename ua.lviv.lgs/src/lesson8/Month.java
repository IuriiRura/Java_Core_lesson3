package lesson8;

import java.util.Scanner;

enum Seasons { WINTER, SPRING, SUMMER, AUTUMN
}

public enum Month {
    JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER), JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN), OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    int days;

    Seasons season;

    Month(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeason() {
        return season;
    }


    static void menu() {
        System.out.println("Press 1 to Check month exists");
        System.out.println("Press 2 to see all monthes in choosen season ");
        System.out.println("Press 3 to see monthes with entered amount of days");
        System.out.println("Press 4 to see monthes with less days");
        System.out.println("Press 5 to see monthes with more days");
        System.out.println("Press 6 to see next season");
        System.out.println("Press 7 to see previous season");
        System.out.println("Press 8 to see monthes with pair amount of days");
        System.out.println("Press 9 to see monthes with unmatched amount of days");
        System.out.println("Press 10 to check parity of days in entered month");
    }


    public static void main(String[] args) {
        Month[] mas = Month.values();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            switch (sc.next()) {
                case "1": {
                    System.out.println("Enter month name");
                    Scanner sc1 = new Scanner(System.in);
                    String month = sc1.next().toUpperCase();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.name().equals(month)) {
                            System.out.println("This month exists");
                            flag = true;
                        }
                    }
                    if (!flag) {
                        System.out.println("This month does not exists");
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter season's name");
                    Scanner sc3 = new Scanner(System.in);
                    String seasonSc = sc3.next().toUpperCase();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.getSeason().name().equals(seasonSc)) {
                            flag = true;

                        }

                    }
                    if (flag) {
                        //Seasons s = Seasons.valueOf(seasonSc); ??
                        for (Month m : mas) {
                            if (m.getSeason().name().equals(seasonSc)) {
                                System.out.println(m);
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Month does not exists");
                    }
                    break;
                }
                case "3": {
                    System.out.println("Enter amount of days to see mounthes with same amount of days");
                    Scanner sc4 = new Scanner(System.in);
                    int daysSc = sc4.nextInt();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.getDays() == (daysSc)) {
                            flag = true;
                        }

                    }
                    if (flag) {
                        for (Month m : mas) {
                            if (m.getDays() == (daysSc)) {
                                System.out.println(m + " " + m.getDays());
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("There is no Monthes with entered amount of days");
                    }
                }
                case "4": {
                    for (Month m : mas) {
                        if (m.getDays() <= (30)) {
                            System.out.println(m + " " + m.getDays());
                        }
                    }
                }
                case "5": {
                    for (Month m : mas) {
                        if (m.getDays() > (30)) {
                            System.out.println(m + " " + m.getDays());
                        }

                    }


                }
                case "6": {
                    System.out.println("Enter name of a season");
                    Scanner sc5 = new Scanner(System.in);
                    String NextSeason = sc5.nextLine().toUpperCase();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.getSeason().name().equalsIgnoreCase(NextSeason)) {
                            flag = true;

                        }
                    }
                    if (flag) {

                        for (Month m : mas) {

                            int ordinal = (m.ordinal());

                            if (m.getSeason().name().equalsIgnoreCase(NextSeason)) {
                                if (ordinal == (mas.length - 1)) {
                                    ordinal = 3;
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                } else if (ordinal == (mas.length - 2) || ordinal == (mas.length - 3)) {
                                    ordinal = 0;
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                } else {
                                    ordinal = (m.ordinal() + 3);
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                }
                            }

                        }

                    }
                    if (!flag) {
                        System.out.println("Enter one of the following season:" +
                                " winter, spring, summer, autumn");
                    }


                }
                case "7": {
                    System.out.println("Enter name of a season");
                    Scanner sc5 = new Scanner(System.in);
                    String NextSeason = sc5.nextLine().toUpperCase();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.getSeason().name().equalsIgnoreCase(NextSeason)) {
                            flag = true;

                        }
                    }
                    if (flag) {

                        for (Month m : mas) {

                            int ordinal = (m.ordinal());

                            if (m.getSeason().name().equalsIgnoreCase(NextSeason)) {
                                if (ordinal == (2)) {
                                    ordinal = 0;
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                } else if (ordinal == (0) || ordinal == (1)) {
                                    ordinal = 10;
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                } else {
                                    ordinal = (m.ordinal() - 3);
                                    System.out.println(mas[ordinal].getSeason());
                                    break;
                                }
                            }

                        }

                    }
                    if (!flag) {
                        System.out.println("Enter one of the following season:" +
                                " winter, spring, summer, autumn");
                    }

                }
                break;
                case "8": {
                    for (Month m : mas) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m + " " + m.getDays());
                        }

                    }
                }
                break;
                case "9": {
                    for (Month m : mas) {
                        if (m.getDays() % 2 != 0) {
                            System.out.println(m + " " + m.getDays());
                        }

                    }
                }
                break;
                case "10": {
                    System.out.println("Enter month to check it parity");
                    Scanner sc6 = new Scanner(System.in);
                    String month = sc6.nextLine();
                    boolean flag = false;
                    for (Month m : mas) {
                        if (m.name().equalsIgnoreCase(month)) {
                            flag = true;
                        }
                    }
                    if (flag) {
                        for (Month m : mas) {
                            if (m.name().equalsIgnoreCase(month)) {
                                if (m.getDays() % 2 == 0) {
                                    System.out.println("Entered month " + m + " has parity number of days");
                                } else {
                                    System.out.println("Entered month " + m + " has unmatched number of days");
                                }
                            }
                        }
                    }
                    if (!flag) {
                        System.out.println("Entered month does not exist");
                    }
                }

            }

        }

    }
}


