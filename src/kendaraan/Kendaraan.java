package kendaraan;

public abstract class Kendaraan {
    private String tipeKendaraan, brand, name, licenseNum, type;
    private Integer topSpeed, gasCap, wheel;
    public abstract void output();
    public abstract void selling();
    public String getTipeKendaraan() {
        return tipeKendaraan;
    }
    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLicenseNum() {
        return licenseNum;
    }
    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Integer getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }
    public Integer getGasCap() {
        return gasCap;
    }
    public void setGasCap(Integer gasCap) {
        this.gasCap = gasCap;
    }
    public Integer getWheel() {
        return wheel;
    }
    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }
}
