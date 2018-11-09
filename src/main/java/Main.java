import nio.ChannelBasic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        ChannelBasic channelBasic = new ChannelBasic();
        channelBasic.fileChannelToBuffer();
    }

}