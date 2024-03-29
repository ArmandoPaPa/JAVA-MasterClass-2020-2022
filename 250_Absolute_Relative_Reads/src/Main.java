import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main {
    public static void main(String[] args) {

//        try{
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//
//            Files.write(dataPath, "\nLine 5".getBytes("UTF-8"),
//                    StandardOpenOption.APPEND);
//
//            List<String> lines = Files.readAllLines(dataPath);
//            for (String line: lines){
//                System.out.println(line);
//            }

        try (FileOutputStream binFile = new FileOutputStream("data.dat");
             FileChannel binChannel = binFile.getChannel()) {

            byte[] outputBytes = "Hello World!".getBytes();
//            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
            buffer.put(outputBytes);



            buffer.flip();

            int numBytes = binChannel.write(buffer);
            System.out.println("numBytes written was: " + numBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);

            intBuffer.flip();
            intBuffer.putInt(-98765);
            intBuffer.flip();
            numBytes = binChannel.write(intBuffer);
            System.out.println("numBytes written was: " + numBytes);


//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);


            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            outputBytes[0] = 'a';
            outputBytes[1] = 'b';
            buffer.flip();
            FileChannel channel = ra.getChannel();
            long numBytesRead = channel.read(buffer);

            if(buffer.hasArray()){
                System.out.println("byte buffer = " + new String(buffer.array()));
//                System.out.println("byte buffer = " + new String(outputBytes));
            }

            // ABSOLUTE READ

            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            System.out.println(intBuffer.getInt(0));
            intBuffer.flip();
            numBytesRead = channel.read(intBuffer);
            intBuffer.flip();
            System.out.println(intBuffer.getInt(0)); // absolute read
            System.out.println(intBuffer.getInt()); // relative read



            // RELATIVE READ

//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytes = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());

            channel.close();
            ra.close();


//            System.out.println("outputBytes = " + new String(outputBytes));



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}