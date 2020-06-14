package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String operation = "enc";
        String message = "";
        int key = 0;
        String inputFileName = "";
        String outPutFileName = "";
        String alg = "shift";

        if (args.length % 2 == 1) {
            System.out.println("Invalid Number of Arguments Error!");
            return;
        }

        for (int i = 0; i < args.length; i += 2) {
            final String arg = args[i];
            final String val = args[i + 1];
            if ("-mode".equals(arg)) {
                operation = val;
            } else if ("-key".equals(arg)) {
                key = Integer.parseInt(val);
            } else if ("-data".equals(arg)) {
                message = val;
            } else if ("-in".equals(arg)) {
                inputFileName = val;
            } else if ("-out".equals(arg)) {
                outPutFileName = val;
            } else if ("-alg".equals(arg)) {
                alg = val;
            }
        }

        Cipher cipher = new Cipher();
        if ("shift".equals(alg)) {
            cipher.setAlgorithm(Algorithm.caesar(key));
        } else {
            cipher.setAlgorithm(Algorithm.unicode(key));
        }

        final String result;
        if ("enc".equals(operation)) {
            result = cipher.encryptMsg(readMsgOrFile(inputFileName, message));
        } else {
            result = cipher.decryptedMsg(readMsgOrFile(inputFileName, message));
        }

        if (outPutFileName.isEmpty()) {
            System.out.println(result);
        } else {
            final File file = new File(outPutFileName);
            try (PrintWriter printWriter = new PrintWriter(file)) {
                printWriter.println(result);
            } catch (FileNotFoundException e) {
                System.out.println("-out file not found Error!");
            }
        }
    }

    public static String readMsgOrFile(String fileName, String message) {
        if (message.isEmpty()) {
            return readTextFile(fileName);
        } else {
            return message;
        }
    }

    private static String readTextFile(String fileName) {
        final File file = new File(fileName);
        String message = null;
        try (Scanner scanner = new Scanner(file)) {
            message = scanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("-in file doesn't exists Error!");
        }
        return message;
    }

}

class Cipher {
    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String encryptMsg(String msg) {
        return algorithm.encrypt(msg);
    }

    public String decryptedMsg(String msg) {
        return algorithm.decrypt(msg);
    }
}

abstract class Algorithm {

    protected final int key;

    Algorithm(int key) {
        this.key = key;
    }

    public static Algorithm caesar(int key) {
        return new CaesarShift(key);
    }

    public static Algorithm unicode(int key) {
        return new UnicodeShift(key);
    }

    public String encrypt(String msg) {
        final char[] chars = msg.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i]);
        }
        return new String(chars);
    }

    public String decrypt(String msg) {
        final char[] chars = msg.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = unShift(chars[i]);
        }
        return new String(chars);
    }

    abstract char shift(char c);

    abstract char unShift(char c);
}

class CaesarShift extends Algorithm {

    CaesarShift(int key) {
        super(key);
    }

    @Override
    char shift(char c) {
        if (Character.isLetter(c)) {
            final char z = Character.isUpperCase(c) ? 'Z' : 'z';
            final char a = Character.isUpperCase(c) ? 'A' : 'a';
            c = ((char) (c + key % 26));
            if (c > z) {
                c = (char) (a + c - z - 1);
            }
        }
        return c;
    }

    @Override
    char unShift(char c) {
        if (Character.isLetter(c)) {
            final char z = Character.isUpperCase(c) ? 'Z' : 'z';
            final char a = Character.isUpperCase(c) ? 'A' : 'a';
            c = ((char) (c - key % 26));
            if (c < a) {
                c = (char) (z - (a - c) + 1);
            }
        }
        return c;
    }

}

class UnicodeShift extends Algorithm {

    UnicodeShift(int key) {
        super(key);
    }

    @Override
    char shift(char c) {
        return (char) (c + key);
    }

    @Override
    char unShift(char c) {
        return (char) (c - key);
    }

}
