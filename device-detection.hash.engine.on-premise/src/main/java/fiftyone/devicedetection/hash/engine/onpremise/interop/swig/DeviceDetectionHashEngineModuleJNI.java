/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fiftyone.devicedetection.hash.engine.onpremise.interop.swig;

import fiftyone.devicedetection.hash.engine.onpremise.flowelements.DeviceDetectionHashEngine;
import fiftyone.pipeline.engines.fiftyone.flowelements.interop.LibLoader;

public class DeviceDetectionHashEngineModuleJNI {
  public final static native long new_MapStringStringSwig__SWIG_0();
  public final static native long new_MapStringStringSwig__SWIG_1(long jarg1, MapStringStringSwig jarg1_);
  public final static native long MapStringStringSwig_Iterator_getNextUnchecked(long jarg1, MapStringStringSwig.Iterator jarg1_);
  public final static native boolean MapStringStringSwig_Iterator_isNot(long jarg1, MapStringStringSwig.Iterator jarg1_, long jarg2, MapStringStringSwig.Iterator jarg2_);
  public final static native String MapStringStringSwig_Iterator_getKey(long jarg1, MapStringStringSwig.Iterator jarg1_);
  public final static native String MapStringStringSwig_Iterator_getValue(long jarg1, MapStringStringSwig.Iterator jarg1_);
  public final static native void MapStringStringSwig_Iterator_setValue(long jarg1, MapStringStringSwig.Iterator jarg1_, String jarg2);
  public final static native void delete_MapStringStringSwig_Iterator(long jarg1);
  public final static native boolean MapStringStringSwig_isEmpty(long jarg1, MapStringStringSwig jarg1_);
  public final static native void MapStringStringSwig_clear(long jarg1, MapStringStringSwig jarg1_);
  public final static native long MapStringStringSwig_find(long jarg1, MapStringStringSwig jarg1_, String jarg2);
  public final static native long MapStringStringSwig_begin(long jarg1, MapStringStringSwig jarg1_);
  public final static native long MapStringStringSwig_end(long jarg1, MapStringStringSwig jarg1_);
  public final static native int MapStringStringSwig_sizeImpl(long jarg1, MapStringStringSwig jarg1_);
  public final static native boolean MapStringStringSwig_containsImpl(long jarg1, MapStringStringSwig jarg1_, String jarg2);
  public final static native void MapStringStringSwig_putUnchecked(long jarg1, MapStringStringSwig jarg1_, String jarg2, String jarg3);
  public final static native void MapStringStringSwig_removeUnchecked(long jarg1, MapStringStringSwig jarg1_, long jarg2, MapStringStringSwig.Iterator jarg2_);
  public final static native void delete_MapStringStringSwig(long jarg1);
  public final static native long new_VectorStringSwig__SWIG_0();
  public final static native long new_VectorStringSwig__SWIG_1(long jarg1, VectorStringSwig jarg1_);
  public final static native long VectorStringSwig_capacity(long jarg1, VectorStringSwig jarg1_);
  public final static native void VectorStringSwig_reserve(long jarg1, VectorStringSwig jarg1_, long jarg2);
  public final static native boolean VectorStringSwig_isEmpty(long jarg1, VectorStringSwig jarg1_);
  public final static native void VectorStringSwig_clear(long jarg1, VectorStringSwig jarg1_);
  public final static native long new_VectorStringSwig__SWIG_2(int jarg1, String jarg2);
  public final static native int VectorStringSwig_doSize(long jarg1, VectorStringSwig jarg1_);
  public final static native void VectorStringSwig_doAdd__SWIG_0(long jarg1, VectorStringSwig jarg1_, String jarg2);
  public final static native void VectorStringSwig_doAdd__SWIG_1(long jarg1, VectorStringSwig jarg1_, int jarg2, String jarg3);
  public final static native String VectorStringSwig_doRemove(long jarg1, VectorStringSwig jarg1_, int jarg2);
  public final static native String VectorStringSwig_doGet(long jarg1, VectorStringSwig jarg1_, int jarg2);
  public final static native String VectorStringSwig_doSet(long jarg1, VectorStringSwig jarg1_, int jarg2, String jarg3);
  public final static native void VectorStringSwig_doRemoveRange(long jarg1, VectorStringSwig jarg1_, int jarg2, int jarg3);
  public final static native void delete_VectorStringSwig(long jarg1);
  public final static native long new_RequiredPropertiesConfigSwig__SWIG_0();
  public final static native long new_RequiredPropertiesConfigSwig__SWIG_1(long jarg1, VectorStringSwig jarg1_);
  public final static native long new_RequiredPropertiesConfigSwig__SWIG_2(String jarg1);
  public final static native void delete_RequiredPropertiesConfigSwig(long jarg1);
  public final static native long RequiredPropertiesConfigSwig_getProperties(long jarg1, RequiredPropertiesConfigSwig jarg1_);
  public final static native long new_StringValueSwig();
  public final static native boolean StringValueSwig_hasValue(long jarg1, StringValueSwig jarg1_);
  public final static native String StringValueSwig_getNoValueMessage(long jarg1, StringValueSwig jarg1_);
  public final static native String StringValueSwig_getValue(long jarg1, StringValueSwig jarg1_);
  public final static native void delete_StringValueSwig(long jarg1);
  public final static native long new_BoolValueSwig();
  public final static native boolean BoolValueSwig_hasValue(long jarg1, BoolValueSwig jarg1_);
  public final static native String BoolValueSwig_getNoValueMessage(long jarg1, BoolValueSwig jarg1_);
  public final static native boolean BoolValueSwig_getValue(long jarg1, BoolValueSwig jarg1_);
  public final static native void delete_BoolValueSwig(long jarg1);
  public final static native long new_IntegerValueSwig();
  public final static native boolean IntegerValueSwig_hasValue(long jarg1, IntegerValueSwig jarg1_);
  public final static native String IntegerValueSwig_getNoValueMessage(long jarg1, IntegerValueSwig jarg1_);
  public final static native int IntegerValueSwig_getValue(long jarg1, IntegerValueSwig jarg1_);
  public final static native void delete_IntegerValueSwig(long jarg1);
  public final static native long new_VectorStringValuesSwig();
  public final static native boolean VectorStringValuesSwig_hasValue(long jarg1, VectorStringValuesSwig jarg1_);
  public final static native String VectorStringValuesSwig_getNoValueMessage(long jarg1, VectorStringValuesSwig jarg1_);
  public final static native long VectorStringValuesSwig_getValue(long jarg1, VectorStringValuesSwig jarg1_);
  public final static native void delete_VectorStringValuesSwig(long jarg1);
  public final static native long new_DoubleValueSwig();
  public final static native boolean DoubleValueSwig_hasValue(long jarg1, DoubleValueSwig jarg1_);
  public final static native String DoubleValueSwig_getNoValueMessage(long jarg1, DoubleValueSwig jarg1_);
  public final static native double DoubleValueSwig_getValue(long jarg1, DoubleValueSwig jarg1_);
  public final static native void delete_DoubleValueSwig(long jarg1);
  public final static native void delete_ResultsBaseSwig(long jarg1);
  public final static native int ResultsBaseSwig_getAvailableProperties(long jarg1, ResultsBaseSwig jarg1_);
  public final static native boolean ResultsBaseSwig_containsProperty__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getProperties(long jarg1, ResultsBaseSwig jarg1_);
  public final static native String ResultsBaseSwig_getPropertyName(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValues__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getValues__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValueAsString__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getValueAsString__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValueAsBool__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getValueAsBool__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValueAsInteger__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getValueAsInteger__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValueAsDouble__SWIG_0(long jarg1, ResultsBaseSwig jarg1_, String jarg2);
  public final static native long ResultsBaseSwig_getValueAsDouble__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, int jarg2);
  public final static native long ResultsBaseSwig_getValueAsString__SWIG_2(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native long ResultsBaseSwig_getValues__SWIG_2(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native long ResultsBaseSwig_getValueAsBool__SWIG_2(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native long ResultsBaseSwig_getValueAsInteger__SWIG_2(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native long ResultsBaseSwig_getValueAsDouble__SWIG_2(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native boolean ResultsBaseSwig_containsProperty__SWIG_1(long jarg1, ResultsBaseSwig jarg1_, String jarg2, long jarg3);
  public final static native int Date_getYear(long jarg1, Date jarg1_);
  public final static native int Date_getMonth(long jarg1, Date jarg1_);
  public final static native int Date_getDay(long jarg1, Date jarg1_);
  public final static native void delete_Date(long jarg1);
  public final static native String PropertyMetaDataSwig_getName(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native long PropertyMetaDataSwig_getDataFilesWherePresent(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native String PropertyMetaDataSwig_getType(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native String PropertyMetaDataSwig_getCategory(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native String PropertyMetaDataSwig_getUrl(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getAvailable(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native int PropertyMetaDataSwig_getDisplayOrder(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getIsMandatory(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getIsList(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getIsObsolete(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getShow(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native boolean PropertyMetaDataSwig_getShowValues(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native String PropertyMetaDataSwig_getDescription(long jarg1, PropertyMetaDataSwig jarg1_);
  public final static native void delete_PropertyMetaDataSwig(long jarg1);
  public final static native int ComponentMetaDataSwig_getComponentIdAsInt(long jarg1, ComponentMetaDataSwig jarg1_);
  public final static native long ComponentMetaDataSwig_getComponentId(long jarg1, ComponentMetaDataSwig jarg1_);
  public final static native String ComponentMetaDataSwig_getName(long jarg1, ComponentMetaDataSwig jarg1_);
  public final static native void delete_ComponentMetaDataSwig(long jarg1);
  public final static native long ProfileMetaDataSwig_getProfileId(long jarg1, ProfileMetaDataSwig jarg1_);
  public final static native void delete_ProfileMetaDataSwig(long jarg1);
  public final static native long new_ValueMetaDataKeySwig(String jarg1, String jarg2);
  public final static native String ValueMetaDataKeySwig_getPropertyName(long jarg1, ValueMetaDataKeySwig jarg1_);
  public final static native String ValueMetaDataKeySwig_getValueName(long jarg1, ValueMetaDataKeySwig jarg1_);
  public final static native void delete_ValueMetaDataKeySwig(long jarg1);
  public final static native String ValueMetaDataSwig_getName(long jarg1, ValueMetaDataSwig jarg1_);
  public final static native String ValueMetaDataSwig_getDescription(long jarg1, ValueMetaDataSwig jarg1_);
  public final static native String ValueMetaDataSwig_getUrl(long jarg1, ValueMetaDataSwig jarg1_);
  public final static native void delete_ValueMetaDataSwig(long jarg1);
  public final static native void delete_ComponentMetaDataCollectionSwig(long jarg1);
  public final static native long ComponentMetaDataCollectionSwig_getByKey(long jarg1, ComponentMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long ComponentMetaDataCollectionSwig_getByIndex(long jarg1, ComponentMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long ComponentMetaDataCollectionSwig_getSize(long jarg1, ComponentMetaDataCollectionSwig jarg1_);
  public final static native void delete_PropertyMetaDataCollectionSwig(long jarg1);
  public final static native long PropertyMetaDataCollectionSwig_getByKey(long jarg1, PropertyMetaDataCollectionSwig jarg1_, String jarg2);
  public final static native long PropertyMetaDataCollectionSwig_getByIndex(long jarg1, PropertyMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long PropertyMetaDataCollectionSwig_getSize(long jarg1, PropertyMetaDataCollectionSwig jarg1_);
  public final static native void delete_ProfileMetaDataCollectionSwig(long jarg1);
  public final static native long ProfileMetaDataCollectionSwig_getByKey(long jarg1, ProfileMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long ProfileMetaDataCollectionSwig_getByIndex(long jarg1, ProfileMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long ProfileMetaDataCollectionSwig_getSize(long jarg1, ProfileMetaDataCollectionSwig jarg1_);
  public final static native void delete_ValueMetaDataCollectionSwig(long jarg1);
  public final static native long ValueMetaDataCollectionSwig_getByKey(long jarg1, ValueMetaDataCollectionSwig jarg1_, long jarg2, ValueMetaDataKeySwig jarg2_);
  public final static native long ValueMetaDataCollectionSwig_getByIndex(long jarg1, ValueMetaDataCollectionSwig jarg1_, long jarg2);
  public final static native long ValueMetaDataCollectionSwig_getSize(long jarg1, ValueMetaDataCollectionSwig jarg1_);
  public final static native void delete_MetaDataSwig(long jarg1);
  public final static native long MetaDataSwig_getComponents(long jarg1, MetaDataSwig jarg1_);
  public final static native long MetaDataSwig_getProperties(long jarg1, MetaDataSwig jarg1_);
  public final static native long MetaDataSwig_getProfiles(long jarg1, MetaDataSwig jarg1_);
  public final static native long MetaDataSwig_getValues(long jarg1, MetaDataSwig jarg1_);
  public final static native long MetaDataSwig_getValuesForProperty(long jarg1, MetaDataSwig jarg1_, long jarg2, PropertyMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getValuesForProfile(long jarg1, MetaDataSwig jarg1_, long jarg2, ProfileMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getComponentForProfile(long jarg1, MetaDataSwig jarg1_, long jarg2, ProfileMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getComponentForProperty(long jarg1, MetaDataSwig jarg1_, long jarg2, PropertyMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getDefaultProfileForComponent(long jarg1, MetaDataSwig jarg1_, long jarg2, ComponentMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getDefaultValueForProperty(long jarg1, MetaDataSwig jarg1_, long jarg2, PropertyMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getPropertiesForComponent(long jarg1, MetaDataSwig jarg1_, long jarg2, ComponentMetaDataSwig jarg2_);
  public final static native long MetaDataSwig_getPropertyForValue(long jarg1, MetaDataSwig jarg1_, long jarg2, ValueMetaDataSwig jarg2_);
  public final static native void delete_EngineBaseSwig(long jarg1);
  public final static native void EngineBaseSwig_setLicenseKey(long jarg1, EngineBaseSwig jarg1_, String jarg2);
  public final static native void EngineBaseSwig_setDataUpdateUrl(long jarg1, EngineBaseSwig jarg1_, String jarg2);
  public final static native long EngineBaseSwig_getMetaData(long jarg1, EngineBaseSwig jarg1_);
  public final static native boolean EngineBaseSwig_getAutomaticUpdatesEnabled(long jarg1, EngineBaseSwig jarg1_);
  public final static native long EngineBaseSwig_processBase(long jarg1, EngineBaseSwig jarg1_, long jarg2, EvidenceBaseSwig jarg2_);
  public final static native void EngineBaseSwig_refreshData__SWIG_0(long jarg1, EngineBaseSwig jarg1_);
  public final static native void EngineBaseSwig_refreshData__SWIG_1(long jarg1, EngineBaseSwig jarg1_, String jarg2);
  public final static native void EngineBaseSwig_refreshData__SWIG_2(long jarg1, EngineBaseSwig jarg1_, byte[] jarg2);
  public final static native String EngineBaseSwig_getDataUpdateUrl(long jarg1, EngineBaseSwig jarg1_);
  public final static native long EngineBaseSwig_getPublishedTime(long jarg1, EngineBaseSwig jarg1_);
  public final static native long EngineBaseSwig_getUpdateAvailableTime(long jarg1, EngineBaseSwig jarg1_);
  public final static native String EngineBaseSwig_getDataFilePath(long jarg1, EngineBaseSwig jarg1_);
  public final static native String EngineBaseSwig_getDataFileTempPath(long jarg1, EngineBaseSwig jarg1_);
  public final static native String EngineBaseSwig_getProduct(long jarg1, EngineBaseSwig jarg1_);
  public final static native String EngineBaseSwig_getType(long jarg1, EngineBaseSwig jarg1_);
  public final static native long EngineBaseSwig_getKeys(long jarg1, EngineBaseSwig jarg1_);
  public final static native boolean EngineBaseSwig_getIsThreadSafe(long jarg1, EngineBaseSwig jarg1_);
  public final static native void delete_ConfigBaseSwig(long jarg1);
  public final static native void ConfigBaseSwig_setUseUpperPrefixHeaders(long jarg1, ConfigBaseSwig jarg1_, boolean jarg2);
  public final static native void ConfigBaseSwig_setUseTempFile(long jarg1, ConfigBaseSwig jarg1_, boolean jarg2);
  public final static native void ConfigBaseSwig_setReuseTempFile(long jarg1, ConfigBaseSwig jarg1_, boolean jarg2);
  public final static native void ConfigBaseSwig_setTempDirectories(long jarg1, ConfigBaseSwig jarg1_, long jarg2, VectorStringSwig jarg2_);
  public final static native boolean ConfigBaseSwig_getUseUpperPrefixHeaders(long jarg1, ConfigBaseSwig jarg1_);
  public final static native boolean ConfigBaseSwig_getUseTempFile(long jarg1, ConfigBaseSwig jarg1_);
  public final static native boolean ConfigBaseSwig_getReuseTempFile(long jarg1, ConfigBaseSwig jarg1_);
  public final static native long ConfigBaseSwig_getTempDirectories(long jarg1, ConfigBaseSwig jarg1_);
  public final static native int ConfigBaseSwig_getConcurrency(long jarg1, ConfigBaseSwig jarg1_);
  public final static native void ConfigDeviceDetectionSwig_setUpdateMatchedUserAgent(long jarg1, ConfigDeviceDetectionSwig jarg1_, boolean jarg2);
  public final static native void ConfigDeviceDetectionSwig_setMaxMatchedUserAgentLength(long jarg1, ConfigDeviceDetectionSwig jarg1_, int jarg2);
  public final static native void ConfigDeviceDetectionSwig_setAllowUnmatched(long jarg1, ConfigDeviceDetectionSwig jarg1_, boolean jarg2);
  public final static native boolean ConfigDeviceDetectionSwig_getUpdateMatchedUserAgent(long jarg1, ConfigDeviceDetectionSwig jarg1_);
  public final static native int ConfigDeviceDetectionSwig_getMaxMatchedUserAgentLength(long jarg1, ConfigDeviceDetectionSwig jarg1_);
  public final static native boolean ConfigDeviceDetectionSwig_getAllowUnmatched(long jarg1, ConfigDeviceDetectionSwig jarg1_);
  public final static native void delete_ConfigDeviceDetectionSwig(long jarg1);
  public final static native long new_EvidenceBaseSwig();
  public final static native void delete_EvidenceBaseSwig(long jarg1);
  public final static native void EvidenceBaseSwig_addFromBytes(long jarg1, EvidenceBaseSwig jarg1_, String jarg2, long jarg3, String jarg4, long jarg5);
  public final static native long new_EvidenceDeviceDetectionSwig();
  public final static native void delete_EvidenceDeviceDetectionSwig(long jarg1);
  public final static native void EngineDeviceDetectionSwig_defaultElementDataKey_set(String jarg1);
  public final static native String EngineDeviceDetectionSwig_defaultElementDataKey_get();
  public final static native long EngineDeviceDetectionSwig_processDeviceDetection__SWIG_0(long jarg1, EngineDeviceDetectionSwig jarg1_, long jarg2, EvidenceDeviceDetectionSwig jarg2_);
  public final static native long EngineDeviceDetectionSwig_processDeviceDetection__SWIG_1(long jarg1, EngineDeviceDetectionSwig jarg1_, String jarg2);
  public final static native void delete_EngineDeviceDetectionSwig(long jarg1);
  public final static native String ResultsDeviceDetectionSwig_getDeviceId(long jarg1, ResultsDeviceDetectionSwig jarg1_);
  public final static native String ResultsDeviceDetectionSwig_getUserAgent(long jarg1, ResultsDeviceDetectionSwig jarg1_, long jarg2);
  public final static native int ResultsDeviceDetectionSwig_getUserAgents(long jarg1, ResultsDeviceDetectionSwig jarg1_);
  public final static native void delete_ResultsDeviceDetectionSwig(long jarg1);
  public final static native void delete_ResultsHashSwig(long jarg1);
  public final static native String ResultsHashSwig_getDeviceId__SWIG_0(long jarg1, ResultsHashSwig jarg1_);
  public final static native String ResultsHashSwig_getDeviceId__SWIG_1(long jarg1, ResultsHashSwig jarg1_, long jarg2);
  public final static native int ResultsHashSwig_getDifference__SWIG_0(long jarg1, ResultsHashSwig jarg1_);
  public final static native int ResultsHashSwig_getDifference__SWIG_1(long jarg1, ResultsHashSwig jarg1_, long jarg2);
  public final static native int ResultsHashSwig_getMethod__SWIG_0(long jarg1, ResultsHashSwig jarg1_);
  public final static native int ResultsHashSwig_getMethod__SWIG_1(long jarg1, ResultsHashSwig jarg1_, long jarg2);
  public final static native int ResultsHashSwig_getDrift__SWIG_0(long jarg1, ResultsHashSwig jarg1_);
  public final static native int ResultsHashSwig_getDrift__SWIG_1(long jarg1, ResultsHashSwig jarg1_, long jarg2);
  public final static native String ResultsHashSwig_getTrace(long jarg1, ResultsHashSwig jarg1_);
  public final static native int ResultsHashSwig_getMatchedNodes(long jarg1, ResultsHashSwig jarg1_);
  public final static native int ResultsHashSwig_getIterations(long jarg1, ResultsHashSwig jarg1_);
  public final static native String ResultsHashSwig_getUserAgent(long jarg1, ResultsHashSwig jarg1_, long jarg2);
  public final static native int ResultsHashSwig_getUserAgents(long jarg1, ResultsHashSwig jarg1_);
  public final static native long new_CollectionConfigSwig();
  public final static native void CollectionConfigSwig_setCapacity(long jarg1, CollectionConfigSwig jarg1_, long jarg2);
  public final static native void CollectionConfigSwig_setConcurrency(long jarg1, CollectionConfigSwig jarg1_, int jarg2);
  public final static native void CollectionConfigSwig_setLoaded(long jarg1, CollectionConfigSwig jarg1_, long jarg2);
  public final static native long CollectionConfigSwig_getCapacity(long jarg1, CollectionConfigSwig jarg1_);
  public final static native int CollectionConfigSwig_getConcurrency(long jarg1, CollectionConfigSwig jarg1_);
  public final static native long CollectionConfigSwig_getLoaded(long jarg1, CollectionConfigSwig jarg1_);
  public final static native void delete_CollectionConfigSwig(long jarg1);
  public final static native long new_ConfigHashSwig();
  public final static native void ConfigHashSwig_setHighPerformance(long jarg1, ConfigHashSwig jarg1_);
  public final static native void ConfigHashSwig_setBalanced(long jarg1, ConfigHashSwig jarg1_);
  public final static native void ConfigHashSwig_setBalancedTemp(long jarg1, ConfigHashSwig jarg1_);
  public final static native void ConfigHashSwig_setLowMemory(long jarg1, ConfigHashSwig jarg1_);
  public final static native void ConfigHashSwig_setMaxPerformance(long jarg1, ConfigHashSwig jarg1_);
  public final static native void ConfigHashSwig_setDrift(long jarg1, ConfigHashSwig jarg1_, int jarg2);
  public final static native void ConfigHashSwig_setDifference(long jarg1, ConfigHashSwig jarg1_, int jarg2);
  public final static native void ConfigHashSwig_setConcurrency(long jarg1, ConfigHashSwig jarg1_, int jarg2);
  public final static native void ConfigHashSwig_setUsePerformanceGraph(long jarg1, ConfigHashSwig jarg1_, boolean jarg2);
  public final static native void ConfigHashSwig_setUsePredictiveGraph(long jarg1, ConfigHashSwig jarg1_, boolean jarg2);
  public final static native void ConfigHashSwig_setTraceRoute(long jarg1, ConfigHashSwig jarg1_, boolean jarg2);
  public final static native long ConfigHashSwig_getStrings(long jarg1, ConfigHashSwig jarg1_);
  public final static native long ConfigHashSwig_getProperties(long jarg1, ConfigHashSwig jarg1_);
  public final static native long ConfigHashSwig_getValues(long jarg1, ConfigHashSwig jarg1_);
  public final static native long ConfigHashSwig_getProfiles(long jarg1, ConfigHashSwig jarg1_);
  public final static native long ConfigHashSwig_getNodes(long jarg1, ConfigHashSwig jarg1_);
  public final static native long ConfigHashSwig_getProfileOffsets(long jarg1, ConfigHashSwig jarg1_);
  public final static native int ConfigHashSwig_getDrift(long jarg1, ConfigHashSwig jarg1_);
  public final static native int ConfigHashSwig_getDifference(long jarg1, ConfigHashSwig jarg1_);
  public final static native boolean ConfigHashSwig_getUsePerformanceGraph(long jarg1, ConfigHashSwig jarg1_);
  public final static native boolean ConfigHashSwig_getUsePredictiveGraph(long jarg1, ConfigHashSwig jarg1_);
  public final static native int ConfigHashSwig_getConcurrency(long jarg1, ConfigHashSwig jarg1_);
  public final static native boolean ConfigHashSwig_getTraceRoute(long jarg1, ConfigHashSwig jarg1_);
  public final static native void delete_ConfigHashSwig(long jarg1);
  public final static native long new_EngineHashSwig__SWIG_0(String jarg1, long jarg2, ConfigHashSwig jarg2_, long jarg3, RequiredPropertiesConfigSwig jarg3_);
  public final static native long new_EngineHashSwig__SWIG_1(byte[] jarg1, long jarg3, ConfigHashSwig jarg3_, long jarg4, RequiredPropertiesConfigSwig jarg4_);
  public final static native long EngineHashSwig_getPublishedTime(long jarg1, EngineHashSwig jarg1_);
  public final static native long EngineHashSwig_getUpdateAvailableTime(long jarg1, EngineHashSwig jarg1_);
  public final static native String EngineHashSwig_getDataFilePath(long jarg1, EngineHashSwig jarg1_);
  public final static native String EngineHashSwig_getDataFileTempPath(long jarg1, EngineHashSwig jarg1_);
  public final static native void EngineHashSwig_refreshData__SWIG_0(long jarg1, EngineHashSwig jarg1_);
  public final static native void EngineHashSwig_refreshData__SWIG_1(long jarg1, EngineHashSwig jarg1_, String jarg2);
  public final static native void EngineHashSwig_refreshData__SWIG_2(long jarg1, EngineHashSwig jarg1_, byte[] jarg2);
  public final static native long EngineHashSwig_process__SWIG_0(long jarg1, EngineHashSwig jarg1_, long jarg2, EvidenceDeviceDetectionSwig jarg2_);
  public final static native long EngineHashSwig_process__SWIG_1(long jarg1, EngineHashSwig jarg1_, String jarg2);
  public final static native long EngineHashSwig_processBase(long jarg1, EngineHashSwig jarg1_, long jarg2, EvidenceBaseSwig jarg2_);
  public final static native long EngineHashSwig_processDeviceDetection__SWIG_0(long jarg1, EngineHashSwig jarg1_, long jarg2, EvidenceDeviceDetectionSwig jarg2_);
  public final static native long EngineHashSwig_processDeviceDetection__SWIG_1(long jarg1, EngineHashSwig jarg1_, String jarg2);
  public final static native void delete_EngineHashSwig(long jarg1);

  static {
    try {
      LibLoader.load(DeviceDetectionHashEngine.class);
    } catch (Exception e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native long ConfigDeviceDetectionSwig_SWIGUpcast(long jarg1);
  public final static native long EvidenceBaseSwig_SWIGUpcast(long jarg1);
  public final static native long EvidenceDeviceDetectionSwig_SWIGUpcast(long jarg1);
  public final static native long EngineDeviceDetectionSwig_SWIGUpcast(long jarg1);
  public final static native long ResultsDeviceDetectionSwig_SWIGUpcast(long jarg1);
  public final static native long ResultsHashSwig_SWIGUpcast(long jarg1);
  public final static native long ConfigHashSwig_SWIGUpcast(long jarg1);
  public final static native long EngineHashSwig_SWIGUpcast(long jarg1);
}
