package com.james;

public class Main {

    public static void main(String[] args) {
        /*int lime[][][] = new int[4][5][6];
        for (int i = 0; i < 4; i++) {
            lime[i][0][0] = 1;
            System.out.println(lime[i][0][0]);
            for (int j = 0; j < 5; j++) {
                lime[0][j][0] = 2;
                lime[1][j][0] = 3;
                lime[2][j][0] = 4;
                lime[3][j][0] = 5;
                System.out.println(lime[i][j][0]);
                for (int k = 0; k < 6; k++) {
                    lime[0][0][k] = 6;
                    lime[0][0][k] = 7;
                    lime[0][0][k] = 8;
                    lime[0][0][k] = 9;
                    lime[0][0][k] = 10;
                    lime[0][0][k] = 11;
                    System.out.println(lime[i][j][k]);
                }
            }
        }*/
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println(students[i].name);
        }
        Student newStudent = new Student();
        newStudent.name = "Trey";
        Student newStudent2 = students[0];
        newStudent2.name = "BATMAN";
        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].name);
        }
    }
}
