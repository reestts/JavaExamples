package com.reestts.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Week {

    MONDAY(1, "Monday", "Понедельник"),
    TUESDAY(2, "Tuesday", "Вторник"),
    WEDNESDAY(3, "Wednesday", "Среда"),
    THURSDAY(4, "Thursday", "Четверг"),
    FRIDAY(5, "Friday", "Пятница"),
    SATURDAY(6, "Saturday", "Суббота"),
    SUNDAY(7, "Sunday", "Воскресенье");

    private final int order;
    private final String nameEng;
    private final String nameRus;

}
