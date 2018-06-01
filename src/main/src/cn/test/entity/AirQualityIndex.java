package cn.test.entity;

public class AirQualityIndex {
    private int id;
    private int districtId;
    private String monitorTime;
    private int pm10;
    private int pm25;
    private String monitoringStation;
    private String lastModifyTime;

    public AirQualityIndex() {
    }
    public AirQualityIndex(int id, int districtId, String monitorTime, int pm10, int pm25, String monitoringStation, String lastModifyTime) {
        this.id = id;
        this.districtId = districtId;
        this.monitorTime = monitorTime;
        this.pm10 = pm10;
        this.pm25 = pm25;
        this.monitoringStation = monitoringStation;
        this.lastModifyTime = lastModifyTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(String monitorTime) {
        this.monitorTime = monitorTime;
    }

    public int getPm10() {
        return pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public int getPm25() {
        return pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(String lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        AirQualityIndex that = (AirQualityIndex) o;

        if (id != that.id) return false;
        if (districtId != that.districtId) return false;
        if (pm10 != that.pm10) return false;
        if (pm25 != that.pm25) return false;
        if (monitorTime != null ? !monitorTime.equals (that.monitorTime) : that.monitorTime != null) return false;
        if (monitoringStation != null ? !monitoringStation.equals (that.monitoringStation) : that.monitoringStation != null)
            return false;
        if (lastModifyTime != null ? !lastModifyTime.equals (that.lastModifyTime) : that.lastModifyTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + districtId;
        result = 31 * result + (monitorTime != null ? monitorTime.hashCode () : 0);
        result = 31 * result + pm10;
        result = 31 * result + pm25;
        result = 31 * result + (monitoringStation != null ? monitoringStation.hashCode () : 0);
        result = 31 * result + (lastModifyTime != null ? lastModifyTime.hashCode () : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AirQualityIndex{" +
                "id=" + id +
                ", districtId=" + districtId +
                ", monitorTime='" + monitorTime + '\'' +
                ", pm10=" + pm10 +
                ", pm25=" + pm25 +
                ", monitoringStation='" + monitoringStation + '\'' +
                ", lastModifyTime='" + lastModifyTime + '\'' +
                '}';
    }
}
