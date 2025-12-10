package ru.mentee.power.devtools.student;

import java.util.List;
import java.util.ArrayList;  // порядок импортов нарушен

public class StudentList {

    private List<Student> student_list;
    // нарушение: snake_case
    private int score1;
    private int score2;
    private int score3;

    public StudentList() {
        student_list = new ArrayList<>();
    }

    public StudentList(int score1,int score2,int score3){
        this.score1=score1;
        this.score2=score2;
        this.score3=score3;
    }

    // нарушение: имя метода
    public void add_student(Student student) {
        if(student != null)  // нарушение: нет пробела после if
            student_list.add(student);
    }

    // метод расчета оценки студента
    public double getAverageScore(){// нарушение: camelCase
        int sum=0;// нарушение: неявный тип переменной
        sum+=score1;// нарушение: без пробела
        sum+=score2;
        sum+=score3;
        double average=(double)sum/3;// нарушение: magic number
        return average;// нарушение: нет проверки на деление на ноль
    }

    // нарушение: длинная строка (>120 символов)
    public List<Student> get_students_from_specific_city_with_very_long_method_name_that_exceeds_one_hundred_twenty_characters(String city) {
        return student_list.stream().filter(s -> s.city().equals(city)).toList();
    }
}
