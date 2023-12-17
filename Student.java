package Models;

import java.sql.SQLOutput;

public class Student {
    String names;
    int ages;
    int[] mark;
    int grades;



    public Student(String name, int age, int[]marks, int grade){
        this.names = name;
        this.ages = age;
        this.grades = grade;
        this.mark = marks;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public void display_result(){
        int total_marks = 0;
        for(int i=0;i<5;i++){
            total_marks = this.mark[i]+ total_marks;
        }
        int total = total_marks/5;
        float percent;
         String result = "";

         if(total<100& total>90){
             result = "A+";
         }
        if(total<90& total>80){
            result = "A";
        }

        if(total<80& total>70){
            result = "B+";
        }
        if(total<70& total>60){
            result = "B";
        }
        if(total<60& total>50){
            result = "C+";
        }
        if(total<50& total>40){
            result = "C";
        }
        if(total<40& total>30){
            result = "D";
        }
        if(total<30){
            result = "FAIL";
        } else if (total>100) {
            result = "Wrong input";
        }

        System.out.println("Name:"+this.names);
        System.out.println("Age:"+this.ages);
        System.out.println("Grade:"+this.grades);
        System.out.println("Subject\t"+ "Marks");
        System.out.println("English:\t"+ this.mark[0]);
        System.out.println("Nepali\t"+ this.mark[1]);
        System.out.println("Maths\t"+ this.mark[2]);
        System.out.println("Physics\t"+ this.mark[3]);
        System.out.println("Chemistry\t"+ this.mark[4]);
        System.out.println("Total marks:\t"+ total);
        System.out.println("Grade Point Average(GPA):\t"+result);
    }
}
