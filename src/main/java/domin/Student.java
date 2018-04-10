package domin;

/**
 * Created by Administrator on 2018/4/7.
 */
public class Student {
    private String studentId;
    private int age;
    private float score;

    public Student(){

    }

    public Student(String studentId, int age, float score) {
        this.studentId = studentId;
        this.age = age;
        this.score = score;
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
