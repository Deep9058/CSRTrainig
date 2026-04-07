package com.csrTraining.arrays;

public class TwoDArrayDemo {
    static void main() {
        int totalStudents=3;
        int totalSubjects=6;
        String[][] studentsMarks=new String[3][6];
        studentsMarks[0][0]="Ayush";
        studentsMarks[0][1]="88";
        studentsMarks[0][2]="87";
        studentsMarks[0][3]="89";
        studentsMarks[0][4]="95";
        studentsMarks[0][5]="97";

        studentsMarks[1][0]="Deep";
        studentsMarks[1][1]="88";
        studentsMarks[1][2]="87";
        studentsMarks[1][3]="82";
        studentsMarks[1][4]="84";
        studentsMarks[1][5]="95";

        studentsMarks[2][0]="Prakhar";
        studentsMarks[2][1]="78";
        studentsMarks[2][2]="87";
        studentsMarks[2][3]="79";
        studentsMarks[2][4]="78";
        studentsMarks[2][5]="75";

//        System.out.println(Arrays.deepToString(studentsMarks));

        for (int i = studentsMarks.length - 1; i >= 0; i--){
            for (int j=0;j<studentsMarks[i].length;j++)
            {
                System.out.print(studentsMarks[i][j]+"   ");
            }
            System.out.println();

        }

    }
}
