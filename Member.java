import java.util.HashSet;
import java.util.Scanner;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName+"회원님의 아이디는 "+memberId+"입니다.";
    }

    //id를 기준으로 중복 객체인지 검사
    public int hashCode() {
        return ((Integer)memberId).hashCode();
    }

    public boolean equals(Object obj) {
        if(memberId == ((Member)obj).memberId) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
