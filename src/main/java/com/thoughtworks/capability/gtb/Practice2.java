package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    if(date.getDayOfWeek().getValue() > 4){
      return LocalDate.ofEpochDay(date.toEpochDay() + date.getDayOfWeek().getValue() - 2);
    }else{
      return LocalDate.ofEpochDay(date.toEpochDay() + 1);
    }
  }
}
