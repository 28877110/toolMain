package nio;

import lombok.Cleanup;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBasic {
    public void fileChannelToBuffer() throws IOException {
        //创建这个文件的目的是为了getChannel()  是为了得到getChannel()
        RandomAccessFile randomAccessFile = new RandomAccessFile("./test.txt", "rw");
        @Cleanup FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(10);
        int index = fileChannel.read(buffer);
        while (index != -1) {
            System.out.println("读取内容" + index);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            index = fileChannel.read(buffer);
        }
    }


}
