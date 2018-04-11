package util;

import constant.StudentType;
import domin.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/11.
 */
public class SortStudentImplTest {
    private List<Student> arrayList = new ArrayList<Student>();
    private List<Student> outputList = new ArrayList<Student>();
    @Before
    public void setUp() throws Exception {
        arrayList.add(new Student("2001",21,90));
        arrayList.add(new Student("2003",26,92));
        arrayList.add(new Student("2004",28,95));
        arrayList.add(new Student("2002",24,94));
        arrayList.add(new Student("2008",23,88));
    }

    @Test
    public void sortStudentInfo() throws Exception {
        SortStudent sortStudent = new SortStudentImpl();
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_id,1);

        System.out.println("按照学号正序排列：");
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }

        System.out.println("按照学号逆序排列：");
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_id,2);
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }

        System.out.println("按照年龄正序排列：");
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_age,1);
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }

        System.out.println("按照年龄逆序排列：");
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_age,2);
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }

        System.out.println("按照成绩正序排列：");
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_score,1);
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }

        System.out.println("按照成绩逆序排列：");
        outputList = sortStudent.sortStudentInfo(arrayList, StudentType.stu_score,2);
        for(int i=0; i<outputList.size(); i++){
            System.out.println(outputList.get(i).toString());
        }
    }

}