package userOutput;

import domin.Student;

import java.io.File;
import java.util.List;

/**
 * Created by Administrator on 2018/4/7.
 */
public interface OutputService {
    public void outputConsole(List<Student> arrayList);
    public boolean outputFile(File file, List<Student> arrayList);
}
