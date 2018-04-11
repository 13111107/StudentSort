package userInput;

import domin.Student;
import userOutput.OutputService;
import userOutput.OutputServiceImpl;
import util.SortStudent;
import util.SortStudentImpl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/4/7.
 */
public class InputServiceImpl implements InputService {
    public void userInput(List<Student> studentList) {
        List<Student> arrayList = new ArrayList<Student>();
        SortStudent sortStudent = new SortStudentImpl();
        InputJudgement inputJudgement = new InputJudgementImpl();
        OutputService outputService = new OutputServiceImpl();
        int kind = 0;
        int flag = 0;
        int returnKind, returnFlag = 0;
        boolean judgeFlag = false;

        System.out.println("请用户输入排序种类（1学号排序，2年龄排序，3成绩排序):");
        while (true) {
            Scanner sc = new Scanner(System.in);


            kind = sc.nextInt();
//            switch(kind){
//                case 1 : kind = StudentType.stu_id;break;
//                case 2 : kind = StudentType.stu_age;break;
//                case 3 : kind = StudentType.stu_score;break;
//                default:break
//            }
            if (!inputJudgement.inputKindJudge(kind)) {
                continue;
            }
            System.out.println("请用户输入排序类型(1正序,2逆序):");
            while (!judgeFlag) {
                flag = sc.nextInt();
                if (!inputJudgement.inputFlagJudge(flag)) {
                    continue;
                } else judgeFlag = true;
            }
            List<Student> outputList = sortStudent.sortStudentInfo(studentList,kind,flag);
            outputService.outputConsole(outputList);
            outputService.outputFile(new File("test1.csv"),outputList);

            System.out.println("请选择是否继续：(1继续，其他任意键结束):");
            String enterLine  = sc.nextLine();
            String s  = sc.nextLine();
            if (!inputJudgement.inputEnterJudge(s)) {
                break;
            }

            System.out.println("请用户输入排序种类（1学号排序，2年龄排序，3成绩排序):");
            judgeFlag = false;

        }
    }
}
