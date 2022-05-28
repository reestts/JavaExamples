package com.reestts.streamapi.anystreams.util;

import com.reestts.streamapi.anystreams.model.Specialist;
import com.reestts.streamapi.anystreams.model.Specialty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OldApproachUtil {
    public static List<Specialist> getSpecialists() {
        List<Specialist> result = new ArrayList<>();
        result.add(new Specialist("Ivan Ivanov", new BigDecimal(5000), Specialty.ENGINEER));
        result.add(new Specialist("Alexander Alexandrov", new BigDecimal(4000), Specialty.ENGINEER));
        result.add(new Specialist("Sergey Sergeev", new BigDecimal(3000), Specialty.DEVOPS));
        result.add(new Specialist("Fedor Fedorov", new BigDecimal(2000), Specialty.DEVOPS));
        result.add(new Specialist("Kirill Kirillov", new BigDecimal(10000), Specialty.MANAGER));
        result.add(new Specialist("Petr Petrov", new BigDecimal(10000), Specialty.MANAGER));

        return result;
    }

    // Поиск по специальности
    public static List<Specialist> filterBySpecialty(List<Specialist> specialists, Specialty specialty) {
        List<Specialist> result = new ArrayList<>();
        for (Specialist spec : specialists) {
            if (spec.getSpecialty().equals(specialty)) {
                result.add(spec);
            }
        }
        return result;
    }

    // Проверка совпадений все инженеры
    public static boolean matchAllEngineers(List<Specialist> specialists) {
        for (Specialist spec : specialists) {
            if (!spec.getSpecialty().equals(Specialty.ENGINEER)) {
                return false;
            }
        }
        return true;
    }

    // Проверка совпадений - есть ли инженеры
    public static boolean matchAnyEngineer(List<Specialist> specialists) {
        for (Specialist spec : specialists) {
            if (spec.getSpecialty().equals(Specialty.ENGINEER)) {
                return true;
            }
        }
        return false;
    }

    // Проверка совпадений - все ли имеют ЗП выше указанной
    public static boolean matchAllSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
        for (Specialist spec : specialists) {
            if (spec.getSalary().compareTo(salary) < 0) {
                return false;
            }
        }
        return true;
    }

    // Проверка совпадений - никто не имеет ЗП выше указанной
    public static boolean matchNoneSalaryMoreThen(List<Specialist> specialists, BigDecimal salary) {
        for (Specialist spec : specialists) {
            if (spec.getSalary().compareTo(salary) > 0) {
                return false;
            }
        }
        return true;
    }

    // Вывод в консоль
    public static void printSpecialists(List<Specialist> specialists) {
        specialists.forEach(System.out::println);
    }

    // Группировка по специалистов специальности
    public static Map<Specialty, List<Specialist>> groupBySpecialty(List<Specialist> specialists) {
        Map<Specialty, List<Specialist>> result = new HashMap<>();
        Specialty[] specialties = Specialty.class.getEnumConstants();
        for (Specialty spec : specialties) {
            result.put(spec, new ArrayList<>());
        }

        /// ... many many many redundant code ...

        return result;
    }
}
