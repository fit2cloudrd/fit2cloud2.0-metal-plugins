package com.fit2cloud.metal.sdk.model;

import java.util.List;

public class MachineEntity {
    private String ip;
    private String bmcIp;
    private String instanceUuid;
    //rackHD id
    private String nodeId;
    private String name;
    private int cpu;
    private String cpuType;
    private String cpuFre;
    private int core;
    private int thread;
    private long memory;
    private String memoryType;
    private long disk;
    private String osType;
    private String osDetail;
    private List<String> ipArray;
    private String brand;
    private String model;
    private String systemServiceTag;
    private String systemBiosVersion;
    private String procPwrPerf;
    private String memTest;
    private String nodeInterleave;
    //物理机序列号
    private String serialNo;
    private List<F2CPhysicalDisk> disks;
    private List<F2CCpu> cpus;
    private List<F2CMemory> memories;
    private List<F2CPmNetworkCard> pmNetworkCards;

    public MachineEntity() {
    }

    public List<F2CCpu> getCpus() {
        return cpus;
    }

    public void setCpus(List<F2CCpu> cpus) {
        this.cpus = cpus;
    }

    public List<F2CMemory> getMemories() {
        return memories;
    }

    public void setMemories(List<F2CMemory> memories) {
        this.memories = memories;
    }

    public List<F2CPmNetworkCard> getPmNetworkCards() {
        return pmNetworkCards;
    }

    public void setPmNetworkCards(List<F2CPmNetworkCard> pmNetworkCards) {
        this.pmNetworkCards = pmNetworkCards;
    }

    public String getSystemServiceTag() {
        return this.systemServiceTag;
    }

    public void setSystemServiceTag(String systemServiceTag) {
        this.systemServiceTag = systemServiceTag;
    }

    public String getSystemBiosVersion() {
        return this.systemBiosVersion;
    }

    public void setSystemBiosVersion(String systemBiosVersion) {
        this.systemBiosVersion = systemBiosVersion;
    }

    public String getProcPwrPerf() {
        return this.procPwrPerf;
    }

    public void setProcPwrPerf(String procPwrPerf) {
        this.procPwrPerf = procPwrPerf;
    }

    public String getMemTest() {
        return this.memTest;
    }

    public void setMemTest(String memTest) {
        this.memTest = memTest;
    }

    public String getNodeInterleave() {
        return this.nodeInterleave;
    }

    public void setNodeInterleave(String nodeInterleave) {
        this.nodeInterleave = nodeInterleave;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public void setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return this.cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public long getMemory() {
        return this.memory;
    }

    public void setMemory(long memory) {
        this.memory = memory;
    }

    public long getDisk() {
        return this.disk;
    }

    public void setDisk(long disk) {
        this.disk = disk;
    }

    public String getOsType() {
        return this.osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getOsDetail() {
        return this.osDetail;
    }

    public void setOsDetail(String osDetail) {
        this.osDetail = osDetail;
    }

    public List<String> getIpArray() {
        return this.ipArray;
    }

    public void setIpArray(List<String> ipArray) {
        this.ipArray = ipArray;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBmcIp() {
        return bmcIp;
    }

    public void setBmcIp(String bmcIp) {
        this.bmcIp = bmcIp;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getCpuFre() {
        return cpuFre;
    }

    public void setCpuFre(String cpuFre) {
        this.cpuFre = cpuFre;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getThread() {
        return thread;
    }

    public void setThread(int thread) {
        this.thread = thread;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public List<F2CPhysicalDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<F2CPhysicalDisk> disks) {
        this.disks = disks;
    }
}