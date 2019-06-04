package Sample;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Sample.*;
import jio.System.Collections.Generic.*;

public class Robot {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setNumberOfArms(java.lang.Integer value) {
    try {
      javonetHandle.set("NumberOfArms", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumberOfArms() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfArms");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setType(RobotType value) {
    try {
      javonetHandle.set("Type", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RobotType getType() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return RobotType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String param) {
    try {
      javonetHandle.set("Name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Robot(java.lang.String name) {
    try {
      javonetHandle = Javonet.New("Sample.Robot", name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Robot(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SayMyName() {
    try {
      javonetHandle.invoke("SayMyName");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void WaveHello() {
    try {
      Javonet.getType("Sample.Robot").invoke("WaveHello");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<java.lang.Integer> GenerateList(java.lang.Integer start, java.lang.Integer count) {
    try {
      Object res = javonetHandle.invoke("GenerateList", start, count);
      if (res == null) return null;
      return new List<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer[] GenerateArray(
      java.lang.Integer start, java.lang.Integer count, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GenerateArray", start, count);
      if (res == null) return null;
      return (java.lang.Integer[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public List<IntWrapper> GenerateListObject(java.lang.Integer start, java.lang.Integer count) {
    try {
      Object res = javonetHandle.invoke("GenerateListObject", start, count);
      if (res == null) return null;
      return new List<IntWrapper>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IntWrapper[] GenerateArrayObject(
      java.lang.Integer start, java.lang.Integer count, Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GenerateArrayObject", start, count);
      if (res == null) return null;
      return (IntWrapper[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
