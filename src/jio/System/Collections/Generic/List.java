package jio.System.Collections.Generic;

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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.*;

public class List<T>
    implements jio.System.Collections.Generic.IList<T>,
        jio.System.Collections.Generic.ICollection<T>,
        jio.System.Collections.Generic.IEnumerable<T>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<T>,
        IReadOnlyCollection<T>,
        Iterable<T> {
  protected NObject javonetHandle;

  @Override
  public Iterator<T> iterator() {
    return (Iterator<T>) this.GetEnumerator();
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public List(Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.List`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public List(java.lang.Integer capacity, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.List`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GenericConstructor */

  @MethodTypeAnnotation(type = "GetField")
  public List(jio.System.Collections.Generic.IEnumerable<T> collection, Class<?> T) {
    try {
      javonetHandle =
          Javonet.getType("System.Collections.Generic.List`1", getReturnObjectName(T)).create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public List(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Enumerator<T> GetEnumerator() {
    try {
      Object res = javonetHandle.invoke("GetEnumerator");
      if (res == null) return null;
      return new Enumerator<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsReadOnly() {
    try {
      java.lang.Boolean res = javonetHandle.get("IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public jio.System.Collections.IEnumerator IEnumerable_GetEnumerator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerable")
              .invoke("GetEnumerator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public Object getItem(java.lang.Integer index) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_Item", index);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "Method")
  public void setItem(java.lang.Integer index, Object value) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.IList")
          .invoke("set_Item", index, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Add(Object item) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Add", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Contains(Object item) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Contains", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIList_IsReadOnly() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsReadOnly");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsFixedSize() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("get_IsFixedSize");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer IndexOf(Object item) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("IndexOf", item);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Insert(java.lang.Integer index, Object item) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Insert", index, item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Remove(Object item) {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IList").invoke("Remove", item);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CopyTo(java.lang.reflect.Array array, java.lang.Integer arrayIndex) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Collections.ICollection")
          .invoke("CopyTo", array, arrayIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getSyncRoot() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_SyncRoot");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsSynchronized() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Collections.ICollection")
              .invoke("get_IsSynchronized");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public static class Enumerator<T> extends ValueType
      implements jio.System.Collections.Generic.IEnumerator<T>,
          IDisposable,
          jio.System.Collections.IEnumerator,
          Iterator<T> {
    protected NObject javonetHandle;

    @Override
    public boolean hasNext() {
      return (java.lang.Boolean) this.MoveNext();
    }

    @Override
    public T next() {
      return (T) this.getCurrent();
    }

    public Enumerator(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public java.lang.Boolean MoveNext() {
      try {
        java.lang.Boolean res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("MoveNext");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public T get_Current(Class<?> returnType) {
      try {
        Object res = javonetHandle.invoke("get_Current");
        if (res == null) return null;
        return (T) Convert(res, returnType);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** ExplicitSetProperty */

    @MethodTypeAnnotation(type = "GetField")
    public Object getCurrent() {
      try {
        Object res =
            javonetHandle
                .explicitInterface("jio.System.Collections.IEnumerator")
                .invoke("get_Current");
        if (res == null) return null;
        return ConvertToConcreteInterfaceImplementation(res);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return null;
      }
    }
    /** Method */

    @MethodTypeAnnotation(type = "Method")
    public void Reset() {
      try {
        javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
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
