import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class Homework8 {
    public static void main(String[] args) {
        boolean id = true;
        boolean pw = true;
        Scanner sc = new Scanner(System.in);
        Map<String, String> user = new HashMap<>();
        user.put("myId","myPass");
        user.put("myId2","myPass2");
        user.put("myId3","myPass3");
        String userId = "";
        while(pw) {
            while(id) {
                System.out.printf("id와 password를 입력해주세요.\nid : ");
                userId = sc.next().trim();
                if (user.containsKey(userId)) {
                    id = false;
                } else {
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                }
            }
            System.out.printf("password : ");
            String userPassword = sc.next().trim();
            if (userPassword.equals(user.get(userId))) {
                System.out.printf("id와 비밀번호가 일치합니다.");
                pw = false;
            }
            else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                id = true;
            }
        }
    }
}