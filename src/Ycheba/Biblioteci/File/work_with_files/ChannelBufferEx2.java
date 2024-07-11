package Ycheba.Biblioteci.File.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
- buffer.rewind(); переместит нас на ячейку ноль и можем читать с начало
- buffer.compact(); непрочитанные элементы копируются в начало буфера и их можно будет прочитать
- buffer.mark(); ставим отметку на месте где находимся в буфере
- buffer.reset(); возбраняемся на отмеченную позицию
 */
public class ChannelBufferEx2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.rewind();//перемещаемся на начальную ячейку
            System.out.println((char) buffer.get());

            System.out.println("--------------------------");
            buffer.compact();//копируем не прочитанные элементы в начало буфера
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }

            System.out.println("--------------------------");
            buffer.clear();
            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();//ставим отметку на место где находимся в буфере
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            System.out.println("--------------------------");
            buffer.reset();//возбраняемся на отмеченную позицию
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
