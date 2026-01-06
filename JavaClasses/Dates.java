// java.util.*;
// LocalDate, LocalTime, LocalDateTime, format.DateTimeFormatter

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates{
  public static void main(String[] args){
    // shows current date in YYYY-MM-DD
    LocalDate date1 = LocalDate.now();
    System.out.println(date1);

    // shows current time in hh-mm-ss-ns
    LocalTime time1 = LocalTime.now();
    System.out.println(time1);

    // shows current date and time in yyyy-mm-ddThh-mm-ss-ns
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Before Formatting: " + dateTime);

    // DateTimeFormatter
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yy hh:mm:ss E");
    String formattedDate = dateTime.format(dtf);
    System.out.println("After Formatting: " + formattedDate);

  }
}