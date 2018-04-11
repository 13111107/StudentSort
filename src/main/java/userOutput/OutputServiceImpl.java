package userOutput;

import domin.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public class OutputServiceImpl implements OutputService {
    public void outputConsole(List<Student> arrayList) {
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i).toString());
        }
    }

    public boolean outputFile(File file, List<Student> arrayList) {
        boolean isSucess=false;
        FileOutputStream out=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;
        try {
            out = new FileOutputStream(file);
            osw = new OutputStreamWriter(out);
            bw =new BufferedWriter(osw);
            if(arrayList!=null && !arrayList.isEmpty()){
                for(Student stu : arrayList){
                    bw.append(stu.getStudentId() + ",").append(stu.getAge()+"" + ",").append(stu.getScore()+"").append("\r");;
                }
            }
            isSucess=true;
        } catch (Exception e) {
            isSucess=false;
        }finally{
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return isSucess;
    }
}
