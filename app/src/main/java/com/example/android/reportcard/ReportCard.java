package com.example.android.reportcard;

/**
 * {@link ReportCard} represents a the grades imported for a student.
 * It contains the grades for a specific student
 */

public class ReportCard {

    // Subject for Student
    private String mSubject;

    // Grade for math;
    private double mGrade;

    public ReportCard( String subject, double grade){
        mSubject = subject;
        mGrade = grade;
    }

    public String getSubject(){
        return mSubject;
    }


    @Override
    public String toString() {
        return "ReportCard{" +
                "Grade= " + mGrade +
                '}';
    }
}
