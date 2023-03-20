package model;

public class ResponModel {

    String msg;
    String status;
    String comment;

    public String getMsg() {
        this.msg = msg;
    }

    public void setMsg (String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
    }

    public String getComment() {
        return comment;
    }

    public ResponModel (String msg, String status, String comment) {
        this.msg = msg;
        this.status = status;
        this.comment = comment;
    }
}