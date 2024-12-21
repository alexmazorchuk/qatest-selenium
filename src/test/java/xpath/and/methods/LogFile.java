package xpath.and.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Date;

public class LogFile {
    private static Logger logger = LogManager.getLogger(LoggingsInfo.class);
    public static void LogIntoFile(String MsgToFileTrue,String MsgToFileFalse, boolean res) throws IOException {

        Date date = new Date();
        String pass = (char) 27 + "[32m";
        String fail = (char) 27 + "[35m";
        File f1 = new File("log.txt");
        FileWriter fw = new FileWriter(f1, true);  // Залишити коментар
        PrintWriter pw = new PrintWriter(fw);
        if (res == true){
            System.out.print(pass);
//            logger.info("Pass");
            System.out.println(date +" "+ MsgToFileTrue);
        }else {
            System.out.print(fail);
//            logger.error("Fail");
            System.out.println(date +" "+ fail + MsgToFileFalse);
        }
        pw.flush();
        pw.close();
    }

    public static void main(String[] args) {
        Date date = new Date();
        String pass = (char) 27 + "[32m";

        System.out.println(pass + date);
    }
}
