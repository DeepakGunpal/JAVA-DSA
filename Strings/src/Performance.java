public class Performance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            //print a-z
            char ch = (char) ('a'+i);
            series += ch;
        }
            System.out.println(series);//"a-z"
    }
}
