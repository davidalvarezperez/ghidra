/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
package SWIG;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

public class SBProcess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBProcess(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBProcess obj) {
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
        lldbJNI.delete_SBProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBProcess() {
    this(lldbJNI.new_SBProcess__SWIG_0(), true);
  }

  public SBProcess(SBProcess rhs) {
    this(lldbJNI.new_SBProcess__SWIG_1(SBProcess.getCPtr(rhs), rhs), true);
  }

  public static String GetBroadcasterClassName() {
    return lldbJNI.SBProcess_GetBroadcasterClassName();
  }

  public String GetPluginName() {
    return lldbJNI.SBProcess_GetPluginName(swigCPtr, this);
  }

  public String GetShortPluginName() {
    return lldbJNI.SBProcess_GetShortPluginName(swigCPtr, this);
  }

  public void Clear() {
    lldbJNI.SBProcess_Clear(swigCPtr, this);
  }

  public boolean IsValid() {
    return lldbJNI.SBProcess_IsValid(swigCPtr, this);
  }

  public SBTarget GetTarget() {
    return new SBTarget(lldbJNI.SBProcess_GetTarget(swigCPtr, this), true);
  }

  public ByteOrder GetByteOrder() {
    return ByteOrder.swigToEnum(lldbJNI.SBProcess_GetByteOrder(swigCPtr, this));
  }

  public long PutSTDIN(String src, long src_len) {
    return lldbJNI.SBProcess_PutSTDIN(swigCPtr, this, src, src_len);
  }

  public long GetSTDOUT(String dst, long dst_len) {
    return lldbJNI.SBProcess_GetSTDOUT(swigCPtr, this, dst, dst_len);
  }

  public long GetSTDERR(String dst, long dst_len) {
    return lldbJNI.SBProcess_GetSTDERR(swigCPtr, this, dst, dst_len);
  }

  public long GetAsyncProfileData(String dst, long dst_len) {
    return lldbJNI.SBProcess_GetAsyncProfileData(swigCPtr, this, dst, dst_len);
  }

  public void ReportEventState(SBEvent event, SBFile out) {
    lldbJNI.SBProcess_ReportEventState__SWIG_0(swigCPtr, this, SBEvent.getCPtr(event), event, SBFile.getCPtr(out), out);
  }

  public void ReportEventState(SBEvent event, SWIGTYPE_p_std__shared_ptrT_lldb_private__File_t BORROWED) {
    lldbJNI.SBProcess_ReportEventState__SWIG_1(swigCPtr, this, SBEvent.getCPtr(event), event, SWIGTYPE_p_std__shared_ptrT_lldb_private__File_t.getCPtr(BORROWED));
  }

  public void AppendEventStateReport(SBEvent event, SBCommandReturnObject result) {
    lldbJNI.SBProcess_AppendEventStateReport(swigCPtr, this, SBEvent.getCPtr(event), event, SBCommandReturnObject.getCPtr(result), result);
  }

  public boolean RemoteAttachToProcessWithID(java.math.BigInteger pid, SBError error) {
    return lldbJNI.SBProcess_RemoteAttachToProcessWithID(swigCPtr, this, pid, SBError.getCPtr(error), error);
  }

  public boolean RemoteLaunch(String[] argv, String[] envp, String stdin_path, String stdout_path, String stderr_path, String working_directory, long launch_flags, boolean stop_at_entry, SBError error) {
    return lldbJNI.SBProcess_RemoteLaunch(swigCPtr, this, argv, envp, stdin_path, stdout_path, stderr_path, working_directory, launch_flags, stop_at_entry, SBError.getCPtr(error), error);
  }

  public long GetNumThreads() {
    return lldbJNI.SBProcess_GetNumThreads(swigCPtr, this);
  }

  public SBThread GetThreadAtIndex(long index) {
    return new SBThread(lldbJNI.SBProcess_GetThreadAtIndex(swigCPtr, this, index), true);
  }

  public SBThread GetThreadByID(java.math.BigInteger sb_thread_id) {
    return new SBThread(lldbJNI.SBProcess_GetThreadByID(swigCPtr, this, sb_thread_id), true);
  }

  public SBThread GetThreadByIndexID(long index_id) {
    return new SBThread(lldbJNI.SBProcess_GetThreadByIndexID(swigCPtr, this, index_id), true);
  }

  public SBThread GetSelectedThread() {
    return new SBThread(lldbJNI.SBProcess_GetSelectedThread(swigCPtr, this), true);
  }

  public SBThread CreateOSPluginThread(java.math.BigInteger tid, java.math.BigInteger context) {
    return new SBThread(lldbJNI.SBProcess_CreateOSPluginThread(swigCPtr, this, tid, context), true);
  }

  public boolean SetSelectedThread(SBThread thread) {
    return lldbJNI.SBProcess_SetSelectedThread(swigCPtr, this, SBThread.getCPtr(thread), thread);
  }

  public boolean SetSelectedThreadByID(java.math.BigInteger tid) {
    return lldbJNI.SBProcess_SetSelectedThreadByID(swigCPtr, this, tid);
  }

  public boolean SetSelectedThreadByIndexID(long index_id) {
    return lldbJNI.SBProcess_SetSelectedThreadByIndexID(swigCPtr, this, index_id);
  }

  public long GetNumQueues() {
    return lldbJNI.SBProcess_GetNumQueues(swigCPtr, this);
  }

  public SBQueue GetQueueAtIndex(long index) {
    return new SBQueue(lldbJNI.SBProcess_GetQueueAtIndex(swigCPtr, this, index), true);
  }

  public StateType GetState() {
    return StateType.swigToEnum(lldbJNI.SBProcess_GetState(swigCPtr, this));
  }

  public int GetExitStatus() {
    return lldbJNI.SBProcess_GetExitStatus(swigCPtr, this);
  }

  public String GetExitDescription() {
    return lldbJNI.SBProcess_GetExitDescription(swigCPtr, this);
  }

  public java.math.BigInteger GetProcessID() {
    return lldbJNI.SBProcess_GetProcessID(swigCPtr, this);
  }

  public long GetUniqueID() {
    return lldbJNI.SBProcess_GetUniqueID(swigCPtr, this);
  }

  public long GetAddressByteSize() {
    return lldbJNI.SBProcess_GetAddressByteSize(swigCPtr, this);
  }

  public SBError Destroy() {
    return new SBError(lldbJNI.SBProcess_Destroy(swigCPtr, this), true);
  }

  public SBError Continue() {
    return new SBError(lldbJNI.SBProcess_Continue(swigCPtr, this), true);
  }

  public SBError Stop() {
    return new SBError(lldbJNI.SBProcess_Stop(swigCPtr, this), true);
  }

  public SBError Kill() {
    return new SBError(lldbJNI.SBProcess_Kill(swigCPtr, this), true);
  }

  public SBError Detach() {
    return new SBError(lldbJNI.SBProcess_Detach(swigCPtr, this), true);
  }

  public SBError Signal(int signal) {
    return new SBError(lldbJNI.SBProcess_Signal(swigCPtr, this, signal), true);
  }

  public SBUnixSignals GetUnixSignals() {
    return new SBUnixSignals(lldbJNI.SBProcess_GetUnixSignals(swigCPtr, this), true);
  }

  public long GetStopID(boolean include_expression_stops) {
    return lldbJNI.SBProcess_GetStopID__SWIG_0(swigCPtr, this, include_expression_stops);
  }

  public long GetStopID() {
    return lldbJNI.SBProcess_GetStopID__SWIG_1(swigCPtr, this);
  }

  public void SendAsyncInterrupt() {
    lldbJNI.SBProcess_SendAsyncInterrupt(swigCPtr, this);
  }

  public long ReadMemory(java.math.BigInteger addr, SWIGTYPE_p_void buf, long size, SBError error) {
    return lldbJNI.SBProcess_ReadMemory(swigCPtr, this, addr, SWIGTYPE_p_void.getCPtr(buf), size, SBError.getCPtr(error), error);
  }

  public long WriteMemory(java.math.BigInteger addr, SWIGTYPE_p_void buf, long size, SBError error) {
    return lldbJNI.SBProcess_WriteMemory(swigCPtr, this, addr, SWIGTYPE_p_void.getCPtr(buf), size, SBError.getCPtr(error), error);
  }

  public long ReadCStringFromMemory(java.math.BigInteger addr, SWIGTYPE_p_void char_buf, long size, SBError error) {
    return lldbJNI.SBProcess_ReadCStringFromMemory(swigCPtr, this, addr, SWIGTYPE_p_void.getCPtr(char_buf), size, SBError.getCPtr(error), error);
  }

  public java.math.BigInteger ReadUnsignedFromMemory(java.math.BigInteger addr, long byte_size, SBError error) {
    return lldbJNI.SBProcess_ReadUnsignedFromMemory(swigCPtr, this, addr, byte_size, SBError.getCPtr(error), error);
  }

  public java.math.BigInteger ReadPointerFromMemory(java.math.BigInteger addr, SBError error) {
    return lldbJNI.SBProcess_ReadPointerFromMemory(swigCPtr, this, addr, SBError.getCPtr(error), error);
  }

  public static StateType GetStateFromEvent(SBEvent event) {
    return StateType.swigToEnum(lldbJNI.SBProcess_GetStateFromEvent(SBEvent.getCPtr(event), event));
  }

  public static boolean GetRestartedFromEvent(SBEvent event) {
    return lldbJNI.SBProcess_GetRestartedFromEvent(SBEvent.getCPtr(event), event);
  }

  public static long GetNumRestartedReasonsFromEvent(SBEvent event) {
    return lldbJNI.SBProcess_GetNumRestartedReasonsFromEvent(SBEvent.getCPtr(event), event);
  }

  public static String GetRestartedReasonAtIndexFromEvent(SBEvent event, long idx) {
    return lldbJNI.SBProcess_GetRestartedReasonAtIndexFromEvent(SBEvent.getCPtr(event), event, idx);
  }

  public static SBProcess GetProcessFromEvent(SBEvent event) {
    return new SBProcess(lldbJNI.SBProcess_GetProcessFromEvent(SBEvent.getCPtr(event), event), true);
  }

  public static boolean GetInterruptedFromEvent(SBEvent event) {
    return lldbJNI.SBProcess_GetInterruptedFromEvent(SBEvent.getCPtr(event), event);
  }

  public static SBStructuredData GetStructuredDataFromEvent(SBEvent event) {
    return new SBStructuredData(lldbJNI.SBProcess_GetStructuredDataFromEvent(SBEvent.getCPtr(event), event), true);
  }

  public static boolean EventIsProcessEvent(SBEvent event) {
    return lldbJNI.SBProcess_EventIsProcessEvent(SBEvent.getCPtr(event), event);
  }

  public static boolean EventIsStructuredDataEvent(SBEvent event) {
    return lldbJNI.SBProcess_EventIsStructuredDataEvent(SBEvent.getCPtr(event), event);
  }

  public SBBroadcaster GetBroadcaster() {
    return new SBBroadcaster(lldbJNI.SBProcess_GetBroadcaster(swigCPtr, this), true);
  }

  public boolean GetDescription(SBStream description) {
    return lldbJNI.SBProcess_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description);
  }

  public SBStructuredData GetExtendedCrashInformation() {
    return new SBStructuredData(lldbJNI.SBProcess_GetExtendedCrashInformation(swigCPtr, this), true);
  }

  public long GetNumSupportedHardwareWatchpoints(SBError error) {
    return lldbJNI.SBProcess_GetNumSupportedHardwareWatchpoints(swigCPtr, this, SBError.getCPtr(error), error);
  }

  public long LoadImage(SBFileSpec image_spec, SBError error) {
    return lldbJNI.SBProcess_LoadImage(swigCPtr, this, SBFileSpec.getCPtr(image_spec), image_spec, SBError.getCPtr(error), error);
  }

  public long LoadImageUsingPaths(SBFileSpec image_spec, SBStringList paths, SBFileSpec loaded_path, SBError error) {
    return lldbJNI.SBProcess_LoadImageUsingPaths(swigCPtr, this, SBFileSpec.getCPtr(image_spec), image_spec, SBStringList.getCPtr(paths), paths, SBFileSpec.getCPtr(loaded_path), loaded_path, SBError.getCPtr(error), error);
  }

  public SBError UnloadImage(long image_token) {
    return new SBError(lldbJNI.SBProcess_UnloadImage(swigCPtr, this, image_token), true);
  }

  public SBError SendEventData(String event_data) {
    return new SBError(lldbJNI.SBProcess_SendEventData(swigCPtr, this, event_data), true);
  }

  public long GetNumExtendedBacktraceTypes() {
    return lldbJNI.SBProcess_GetNumExtendedBacktraceTypes(swigCPtr, this);
  }

  public String GetExtendedBacktraceTypeAtIndex(long idx) {
    return lldbJNI.SBProcess_GetExtendedBacktraceTypeAtIndex(swigCPtr, this, idx);
  }

  public SBThreadCollection GetHistoryThreads(java.math.BigInteger addr) {
    return new SBThreadCollection(lldbJNI.SBProcess_GetHistoryThreads(swigCPtr, this, addr), true);
  }

  public boolean IsInstrumentationRuntimePresent(InstrumentationRuntimeType type) {
    return lldbJNI.SBProcess_IsInstrumentationRuntimePresent(swigCPtr, this, type.swigValue());
  }

  public SBError SaveCore(String file_name) {
    return new SBError(lldbJNI.SBProcess_SaveCore(swigCPtr, this, file_name), true);
  }

  public SBTrace StartTrace(SBTraceOptions options, SBError error) {
    return new SBTrace(lldbJNI.SBProcess_StartTrace(swigCPtr, this, SBTraceOptions.getCPtr(options), options, SBError.getCPtr(error), error), true);
  }

  public SBError GetMemoryRegionInfo(java.math.BigInteger load_addr, SBMemoryRegionInfo region_info) {
    return new SBError(lldbJNI.SBProcess_GetMemoryRegionInfo(swigCPtr, this, load_addr, SBMemoryRegionInfo.getCPtr(region_info), region_info), true);
  }

  public SBMemoryRegionInfoList GetMemoryRegions() {
    return new SBMemoryRegionInfoList(lldbJNI.SBProcess_GetMemoryRegions(swigCPtr, this), true);
  }

  public SBProcessInfo GetProcessInfo() {
    return new SBProcessInfo(lldbJNI.SBProcess_GetProcessInfo(swigCPtr, this), true);
  }

  public String __str__() {
    return lldbJNI.SBProcess___str__(swigCPtr, this);
  }

  public final static int eBroadcastBitStateChanged   = 1 << 0;
  public final static int eBroadcastBitInterrupt      = 1 << 1;
  public final static int eBroadcastBitSTDOUT         = 1 << 2;
  public final static int eBroadcastBitSTDERR         = 1 << 3;
  public final static int eBroadcastBitProfileData    = 1 << 4;
  public final static int eBroadcastBitStructuredData = 1 << 5;

}
