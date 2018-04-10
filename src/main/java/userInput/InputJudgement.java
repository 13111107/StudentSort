package userInput;

/**
 * Created by Administrator on 2018/4/10.
 */
public interface InputJudgement {
    public boolean  inputKindJudge(int kind);//判断用户输入一级条件
    public boolean  inputFlagJudge(int flag);//判断用户输入二级条件
    public boolean  inputEnterJudge(String flag);//判断用户是否继续输入
}
