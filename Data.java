package jp.ac.asojuku.st.familyapps;

/**
 * Created by matsunagatakuya on 2016/10/07.
 */
public class Data {
    private int number;
    private int addition;
    private String comment;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAddition(int addition) {

        this.addition = addition;
    }

    public Data(int number, int addition, String comment) {
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return number;
    }

    public int getComment() {
        return number;
    }

}
