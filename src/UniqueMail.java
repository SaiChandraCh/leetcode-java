import java.util.HashSet;
import java.util.Set;

class UniqueMail {
    public static int numUniqueEmails() {
        String[] emails = new String[3];
        emails[0] = "test.email+alex@leetcode.com";
        emails[1] = "test.e.mail+bob.cathy@leetcode.com";
        emails[2] = "testemail+david@lee.tcode.com";
        Set set = new HashSet();
        for (String mail: emails) {
            if (mail.split("@")[0].contains("\\+")){
                set.add(mail.split("@")[0].split("\\+")[0].replace(".","")+mail.split("@")[1]);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        numUniqueEmails();
    }

}