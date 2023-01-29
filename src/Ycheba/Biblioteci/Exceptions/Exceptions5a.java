package Ycheba.Biblioteci.Exceptions;

import java.io.*;

//аналог Exceptions5 но намного короче
//Здесь у нас всего один try. Для того чтобы разобраться, с каким именно
// файлом проблемы или какая кодировка плоха, мы используем метод исключений
// getMessage(), который объявлен в классе Throwable, а значит у всех Error-ов
// и Exception-ов.
class Exceptions5a {

    /* И здесь все удобно, не падает,
      а рассказывает по-русски, почему не получилось */
    private static boolean copyFileUsingStream(String sourceFilename, String sourceEnc,
                                               String destFilename, String descEnc) {

        try (Reader fis = new InputStreamReader(new FileInputStream(new File(sourceFilename)), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(new File(sourceFilename)), sourceEnc)) {
            /* все открылось, можно копировать */

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Не удалось открыть файл " + ex.getMessage());
            return false;
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Указана неизвестная кодировка " + ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.out.println("Возникла ошибка при копировании");
            return false;
        }
        return true;
    }
}

