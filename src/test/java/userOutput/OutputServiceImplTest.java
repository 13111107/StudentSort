package userOutput;

import domin.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/11.
 */
public class OutputServiceImplTest {
    private List<Student> arrayList = new ArrayList<Student>();
    @Before
    public void setUp() throws Exception {
        arrayList.add(new Student("2001",21,90));
        arrayList.add(new Student("2003",26,92));
        arrayList.add(new Student("2004",28,95));
        arrayList.add(new Student("2002",24,94));
        arrayList.add(new Student("2008",23,88));
    }

    @Test
    public void outputConsole() throws Exception {
        OutputService outputService = new OutputServiceImpl();
        outputService.outputConsole(arrayList);
    }

}