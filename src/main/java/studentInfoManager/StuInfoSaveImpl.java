package studentInfoManager;

import domin.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public class StuInfoSaveImpl implements StuInfoSave {
    public List<Student> arrayList = new ArrayList<Student>();
    BufferedReader br = null;
    public List saveStuInfo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.csv"));
            String line = null;
            while ((line = br.readLine()) != null) {
                Student student = new Student();
                String info[] = line.split(",");
                student.setStudentId(info[0]);
                student.setAge(Integer.parseInt(info[1]));
                student.setScore(Float.parseFloat(info[2]));
                arrayList.add(student);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(br!=null){
                try {
                    br.close();
                    br=null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return null;
    }
}
