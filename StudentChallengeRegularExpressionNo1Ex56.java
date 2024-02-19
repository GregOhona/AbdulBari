
package stringpractice;

public class StudentChallengeRegularExpressionNo1Ex56 {
    
    public static void main(String[] args) {
        
        //MyVersion
//        String str = "programmer@gmail.com";
//        
//        System.out.println(str.contains("gmail"));
//        
//        System.out.println(str.indexOf("@"));
//        String username = (str.substring(0, 10));
//        System.out.println("Username is: "+username);
//        String domain = (str.substring(11));
//        System.out.println("Domain is: "+domain);
        
        //His Version
        
        String str = "programmer@gmail.com";
        
        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        System.out.println("Username: "+uname);
        
        String domain = str.substring(i+1,str.length());
        System.out.println("Domain: "+domain);
        
        int j = domain.indexOf(".");
        String name=domain.substring(0,j);
        System.out.println(name.equals("gmail"));
    }
    
}
