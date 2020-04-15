/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

public class ResultsHashSwig extends ResultsDeviceDetectionSwig {
  private transient long swigCPtr;

  protected ResultsHashSwig(long cPtr, boolean cMemoryOwn) {
    super(DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ResultsHashSwig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        DeviceDetectionHashEngineModuleJNI.delete_ResultsHashSwig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public String getDeviceId() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDeviceId__SWIG_0(swigCPtr, this);
  }

  public String getDeviceId(long resultIndex) {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDeviceId__SWIG_1(swigCPtr, this, resultIndex);
  }

  public int getDifference() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDifference__SWIG_0(swigCPtr, this);
  }

  public int getDifference(long resultIndex) {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDifference__SWIG_1(swigCPtr, this, resultIndex);
  }

  public int getMethod() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getMethod__SWIG_0(swigCPtr, this);
  }

  public int getMethod(long resultIndex) {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getMethod__SWIG_1(swigCPtr, this, resultIndex);
  }

  public int getDrift() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDrift__SWIG_0(swigCPtr, this);
  }

  public int getDrift(long resultIndex) {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getDrift__SWIG_1(swigCPtr, this, resultIndex);
  }

  public String getTrace() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getTrace(swigCPtr, this);
  }

  public int getMatchedNodes() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getMatchedNodes(swigCPtr, this);
  }

  public int getIterations() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getIterations(swigCPtr, this);
  }

  public String getUserAgent(long resultIndex) {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getUserAgent(swigCPtr, this, resultIndex);
  }

  public int getUserAgents() {
    return DeviceDetectionHashEngineModuleJNI.ResultsHashSwig_getUserAgents(swigCPtr, this);
  }

}
