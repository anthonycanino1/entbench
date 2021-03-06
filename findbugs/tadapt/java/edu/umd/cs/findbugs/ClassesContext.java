package edu.umd.cs.findbugs;

import edu.umd.cs.findbugs.classfile.ClassDescriptor;

import java.util.List;

public class ClassesContext@mode<?->X> {

  private mcase<int> HACK = mcase<int> { low:0; mid:0; high:0; };

  public List<ClassDescriptor> appClassList;

  attributor {
    int size = appClassList.size();
    if (size < 1000) {
      return @mode<low>;
    } else if (size < 2600) {
      return @mode<mid>;
    } else {
      return @mode<high>;
    }
  }

  ClassesContext(List<ClassDescriptor> appClassList) {
    this.appClassList = appClassList;
  }
}
