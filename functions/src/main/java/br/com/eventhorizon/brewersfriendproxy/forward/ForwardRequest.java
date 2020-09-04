package br.com.eventhorizon.brewersfriendproxy.forward;

public class ForwardRequest {

  private String id;

  private String brewSessionId;

  private String deviceId;

  private String deviceName;

  private String token;

  private String rssi;

  private Double temperature;

  private String temperatureUnit;

  private Double gravity;

  private String gravityUnit;

  private Double angle;

  private Double battery;

  private Double interval;

  private String comment;

  private String beer;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getBrewSessionId() {
    return brewSessionId;
  }

  public void setBrewSessionId(String brewSessionId) {
    this.brewSessionId = brewSessionId;
  }

  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public String getRssi() {
    return rssi;
  }

  public void setRssi(String rssi) {
    this.rssi = rssi;
  }

  public Double getTemperature() {
    return temperature;
  }

  public void setTemperature(Double temperature) {
    this.temperature = temperature;
  }

  public String getTemperatureUnit() {
    return temperatureUnit;
  }

  public void setTemperatureUnit(String temperatureUnit) {
    this.temperatureUnit = temperatureUnit;
  }

  public Double getGravity() {
    return gravity;
  }

  public void setGravity(Double gravity) {
    this.gravity = gravity;
  }

  public String getGravityUnit() {
    return gravityUnit;
  }

  public void setGravityUnit(String gravityUnit) {
    this.gravityUnit = gravityUnit;
  }

  public Double getAngle() {
    return angle;
  }

  public void setAngle(Double angle) {
    this.angle = angle;
  }

  public Double getBattery() {
    return battery;
  }

  public void setBattery(Double battery) {
    this.battery = battery;
  }

  public Double getInterval() {
    return interval;
  }

  public void setInterval(Double interval) {
    this.interval = interval;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getBeer() {
    return beer;
  }

  public void setBeer(String beer) {
    this.beer = beer;
  }

  @Override
  public String toString() {
    return "ForwardRequest{" +
        "id='" + id + '\'' +
        ", brewSessionId='" + brewSessionId + '\'' +
        ", deviceId='" + deviceId + '\'' +
        ", deviceName='" + deviceName + '\'' +
        ", token='" + token + '\'' +
        ", rssi='" + rssi + '\'' +
        ", temperature=" + temperature +
        ", temperatureUnit='" + temperatureUnit + '\'' +
        ", gravity=" + gravity +
        ", gravityUnit='" + gravityUnit + '\'' +
        ", angle=" + angle +
        ", battery=" + battery +
        ", interval=" + interval +
        ", comment='" + comment + '\'' +
        ", beer='" + beer + '\'' +
        '}';
  }
}
