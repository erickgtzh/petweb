package mx.edu.up.petweb.dummy;

/**
 * Created by Erick Gutiérrez on 11/03/2017.
 */

public class RowItem {
    public RowItem(String member_name, int profile_pic_id, String status) {
        this.member_name = member_name;
        this.profile_pic_id = profile_pic_id;
        this.status = status;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String member_name;
    public int profile_pic_id;
    public String status;
}
