package ser.pub;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 1、对象序列化：把Java内存对象转换为字节序列的过程。<br>
 * 2、对象反序列：把字节序列恢复为内存Java对象的过程。<br>
 * 3、对象序列保存到objserial.obj文件中。<br>
 * 4、对象序列化为输入流。
 */
public class SerialObjectUtil {

  /**
   * 从文件中进行对象反序列化
   */
  public static Object readObjFromFile(String path) throws Exception {
    ObjectInputStream in = null;
    Object obj = null;
    try {
      in = new ObjectInputStream(new FileInputStream(path));
      obj = in.readObject();
    }
    catch (Exception e) {
      throw new Exception(e);
    }
    finally {
      if (in != null) {
        in.close();
      }
    }
    return obj;
  }

  /**
   * 对象序列化保存到文件中
   */
  public static void writeObjToFile(Object obj, String path) throws Exception {
    ObjectOutputStream out = null;
    try {
      out = new ObjectOutputStream(new FileOutputStream(path));
      out.writeObject(obj);
      out.flush();
    }
    catch (Exception e) {
      throw new Exception(e);
    }
    finally {
      if (out != null) {
        out.close();
      }
    }
  }

}
