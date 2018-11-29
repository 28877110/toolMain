import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.out.println("hello world");
//        ChannelBasic channelBasic = new ChannelBasic();
//        channelBasic.fileChannelToBuffer();
        String a = "asdaws啊山东阿萨德";
        System.out.println(stringFilter(a));

    }

    private static String stringFilter(String str) {
        return str.replaceAll("[^\u4E00-\u9FA5\u3000-\u303F\uFF00-\uFFEF\u0000-\u007F\u201c-\u201d]", " ");
    }

}