package saolei;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Record {

    BufferedReader br;
    FileReader in;

    public Record() {

    }

    // ��ȡɨ�׼���
    public String readLevel() {
        String s = "";
        int c;
        try {
            in = new FileReader("/record/level.txt");
            br = new BufferedReader(in);
            while ((c = br.read()) != -1) {
                s = s + (char) c;
            }
            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    // ��ȡ�Զ��巽����������
    public String readLevel4() {
        String s = "";
        int c;
        try {
            in = new FileReader("/record/level4.txt");
            br = new BufferedReader(in);
            while ((c = br.read()) != -1) {
                s = s + (char) c;
            }
            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
