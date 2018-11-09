package nio;

import lombok.Cleanup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBasic {
    public void fileChannelToBuffer() throws IOException {
        //创建这个文件的目的是为了getChannel()  getChannel()是为了得到
        RandomAccessFile randomAccessFile = new RandomAccessFile("./test.txt","rw");
        @Cleanup  FileChannel fileChannel = randomAccessFile.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int index = fileChannel.read(buffer);
        while(index!=-1){
            System.out.println("读取内容"+index);
            buffer.flip();
            while(buffer.hasRemaining()){
                System.out.println(buffer.get());
            }
            buffer.clear();
            index = fileChannel.read(buffer);
        }
    }
}
