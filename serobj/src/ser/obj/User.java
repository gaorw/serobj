package ser.obj;

import java.io.Serializable;

/**
 * 1、对象序列化需要Serializable接口。<br>
 * 2、static、transient修饰变更不能被序列化。<br>
 * 3、对象序列化的使用场景：<br>
 * 3.1、场景一：需要把内存对象保存到文件中或者数据库 。<br>
 * 3.2、场景二：需要通过套接字传输对象。(网络上传送对象字节序列)<br>
 * 3.3、场景三：使用RMI资源远程调用传输对象。(网络上传送对象字节序列)
 */
public class User implements Serializable {

  public final static int INDETIFIED = 6;

  private static final long serialVersionUID = -2382068450336900266L;

  private transient String alias;

  private Integer uage;

  private String uname;

  public String getAlias() {
    return this.alias;
  }

  public Integer getUage() {
    return this.uage;
  }

  public String getUname() {
    return this.uname;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public void setUage(Integer uage) {
    this.uage = uage;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

}
