package main;

import domin.Student;
import studentInfoManager.StuInfoSave;
import studentInfoManager.StuInfoSaveImpl;
import userInput.InputService;
import userInput.InputServiceImpl;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/4/7.
 */
public class Main {

    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<Student>();
        List<Student> outputList = new ArrayList<Student>();
        //读取并保存学生信息到list中；
        StuInfoSave stuInfoSave = new StuInfoSaveImpl();
        arrayList = stuInfoSave.saveStuInfo();

        InputService inputService = new InputServiceImpl();
        inputService.userInput(arrayList);

    }
}
