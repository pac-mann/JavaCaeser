package ke.co.safaricom;

public class Process {

    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String encode(String message, int key){
        char[] chars = message.toCharArray();
        String output = "";
        for(char c: chars){
            int pos = ALPHABETS.indexOf(c);
            int newPos = pos + key;
            char replacement = ALPHABETS.charAt(newPos);
            output= output + replacement;
        }

        return output;
    }

    public static String decode(String message, int key){
        char[] chars = message.toCharArray();
        String output = "";
        for(char c: chars){
            int pos = ALPHABETS.indexOf(c);
            int newPos = pos - key;
            char replacement = ALPHABETS.charAt(newPos);
            output= output + replacement;
        }

        return output;
    }

    public static String run(Data data){
        if(data.getProcess() == 1){
            return Process.encode(data.getMessage(), data.getKey());
        } else if (data.getProcess() == 2){
            return Process.decode(data.getMessage(), data.getKey());
        } else {
            return null;
        }
    }
}
