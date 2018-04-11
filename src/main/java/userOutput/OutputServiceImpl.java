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
}
