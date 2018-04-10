package userInput;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/10.
 */
public class InputJudgementImplTest {
    InputJudgement inputJudgement = new InputJudgementImpl();
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void inputKindJudge() throws Exception {
        int kind = 1;
        int kind1 = 3;
        int kind2 = 5;
        System.out.println(inputJudgement.inputKindJudge(kind));
        System.out.println(inputJudgement.inputKindJudge(kind1));
        System.out.println(inputJudgement.inputKindJudge(kind2));
    }

    @org.junit.Test
    public void inputFlagJudge() throws Exception {
        int flag = 1;
        int flag1 = 2;
        int flag2 = 4;

        System.out.println(inputJudgement.inputFlagJudge(flag));
        System.out.println(inputJudgement.inputFlagJudge(flag1));
        System.out.println(inputJudgement.inputFlagJudge(flag2));
    }

    @org.junit.Test
    public void inputEnterJudge() throws Exception {
        String enter = "1";
        String enter1 = "ss";

        System.out.println(inputJudgement.inputEnterJudge(enter));
        System.out.println(inputJudgement.inputEnterJudge(enter1));
    }

}