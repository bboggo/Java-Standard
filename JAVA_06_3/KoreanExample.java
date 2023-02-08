package JAVA_06_3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("김민지", "111111-111111");
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
    }
}
