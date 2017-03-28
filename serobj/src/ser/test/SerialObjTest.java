package ser.test;

import ser.obj.User;
import ser.pub.SerialObjectUtil;

/**
 * 对象序列化与反序列化
 */
public class SerialObjTest {

  public static void main(String[] agrs) {

    try {
      User uobj = new User();
      uobj.setUname("夏雨");
      uobj.setAlias("小雨");
      uobj.setUage(Integer.valueOf(17));

      String path = "d:/objserial.obj";

      SerialObjectUtil.writeObjToFile(uobj, path);

      User user = (User) SerialObjectUtil.readObjFromFile(path);
      System.out.println("姓名：" + user.getUname() + "；--别名：" + user.getAlias()
          + "；--年龄：" + user.getUage() + "；--标识：" + User.INDETIFIED + "；");
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

}
