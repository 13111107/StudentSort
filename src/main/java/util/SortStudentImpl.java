package util;

import constant.StudentType;
import domin.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public class SortStudentImpl implements SortStudent {
    public List sortStudentInfo(List arrayList,int kind,int flag) {
        switch(kind){
            case StudentType.stu_id:if(flag == 1){    //学号正序
//                System.out.println(11);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o1.getStudentId().compareTo(o2.getStudentId());
                    }
                });
            }else if(flag == 2){     //学号逆序
//                System.out.println(12);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o2.getStudentId().compareTo(o1.getStudentId());
                    }
                });
            } else return null;break;
            case StudentType.stu_age:if(flag == 1){    //年龄正序
//                System.out.println(21);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return (o1.getAge()-o2.getAge());
                    }
                });
            }else if(flag == 2){ //年龄逆序
//                System.out.println(22);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return (o2.getAge()-o1.getAge());
                    }
                });
            }else return null;break;
            case StudentType.stu_score:if(flag == 1){    //成绩正序
//                System.out.println(31);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return Float.compare(o1.getScore(),o2.getScore());
                    }
                });
            }else if(flag == 2){  //成绩逆序
//                System.out.println(32);
                Collections.sort(arrayList, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return Float.compare(o2.getScore(),o1.getScore());
                    }
                });
            } else return null;break;
        }

        return arrayList;
    }
}
