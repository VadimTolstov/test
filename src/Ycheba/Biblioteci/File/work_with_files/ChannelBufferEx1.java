package Ycheba.Biblioteci.File.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
https://cloud.mail.ru/public/2ivK/2NNL8oJHY/9.%20Работа%20с%20файлами%20IO%20и%20NIO/11.%20Введение%20в%20Channel%20и%20Buffer.%20Чтение%20из%20файла.mp4
Buffer - Это блок памяти, в который мы можем записывать информацию, а также читать ее.
В отличие от стримов Channel может как читать файл, так и записывать в него.
Чтение файла: Channel читает информацию из файла и записывает в Buffer.
Запись в файл: Channel читает информацию из Buffer и записывает ее в файл.
- .flip() меняет режим буфера из режима записи в режим чтения и меняем позицию на ноль для чтения с начала буфера
- .clear() переходим на нулевую позицию и переводит буфер в режим записи, не очищает буфер записываются новые данные поверх старых затирая их
- .get() получаем значения с буфера
- .hasRemaining() сообщает есть ли еще что-то в буфере между текущей позицией и конечной
-  ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length) узнаем размер байт у текста для создания буфера под весь текст сразу и создали буфер
-  buffer2.put(text.getBytes()) записали данные в буфер
 */
public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(25);//создали буфер
            StringBuilder strix = new StringBuilder();

            int byteRead = channel.read(buffer);//прочитали данные из файла и записали в буфер
            while (byteRead > 0) {//проверяем что байт больше нуля что не пуста
                System.out.println("Read " + byteRead);

                buffer.flip();//переводим буфир в режим чтение и переходим на нулевую позицию

                while (buffer.hasRemaining()) {
                    strix.append((char) buffer.get());//читаем из буфира информацию и присоединяем его к нашему StringBuilder
                }
                buffer.clear();//переносим позицию на нулевую ячейку
                byteRead = channel.read(buffer);// и опять читаем информацию из файла и записываем в буфер

            }
            System.out.println(strix);

            String text = "\nThere are only two ways to live your life. One is as though nothing is a miracle." +
                          " The other is as though everything is a miracle.";
//1 вариант
//            ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);//создаем буфер размером под цитату
//            buffer2.put(text.getBytes());//запишем цитату в буфер
//            buffer2.flip();             // переводим буфер в режим чтения
//            channel.write(buffer2);      //записываем информацию из буфера в файл

//2 вариант лучше
    ByteBuffer buffer3 = ByteBuffer.wrap(text.getBytes());// метод wrap записывает информацию из текста в буфер, сам создает буфер нужного размера
    channel.write(buffer3);// пишем с буфера в файл
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
