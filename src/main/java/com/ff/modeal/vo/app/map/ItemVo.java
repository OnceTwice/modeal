package com.ff.modeal.vo.app.map;

/**
 * Created by BIT on 2017-01-16.
 */

public class ItemVo {

    private String mountain;
    private String mainAddress;
    private String point_wx;
    private String point_wy;
    private String isNewAddress;
    private String buildingAddress;
    private String title;
    private String placeName;
    private String zipcode;
    private String newAddress;
    private String localName_2;
    private String localName_3;
    private String localName_1;
    private String lat;
    private String point_x;
    private String lng;
    private String zone_no;
    private String subAddress;
    private String id;
    private String point_y;

    public ItemVo(String mountain, String mainAddress, String point_wx, String point_wy, String isNewAddress, String buildingAddress, String title,
                  String placeName, String zipcode, String newAddress, String localName_2, String localName_3, String localName_1, String lat,
                  String point_x, String lng, String zone_no, String subAddress, String id, String point_y) {
        this.mountain = mountain;
        this.mainAddress = mainAddress;
        this.point_wx = point_wx;
        this.point_wy = point_wy;
        this.isNewAddress = isNewAddress;
        this.buildingAddress = buildingAddress;
        this.title = title;
        this.placeName = placeName;
        this.zipcode = zipcode;
        this.newAddress = newAddress;
        this.localName_2 = localName_2;
        this.localName_3 = localName_3;
        this.localName_1 = localName_1;
        this.lat = lat;
        this.point_x = point_x;
        this.lng = lng;
        this.zone_no = zone_no;
        this.subAddress = subAddress;
        this.id = id;
        this.point_y = point_y;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getPoint_wx() {
        return point_wx;
    }

    public void setPoint_wx(String point_wx) {
        this.point_wx = point_wx;
    }

    public String getPoint_wy() {
        return point_wy;
    }

    public void setPoint_wy(String point_wy) {
        this.point_wy = point_wy;
    }

    public String getIsNewAddress() {
        return isNewAddress;
    }

    public void setIsNewAddress(String isNewAddress) {
        this.isNewAddress = isNewAddress;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getLocalName_2() {
        return localName_2;
    }

    public void setLocalName_2(String localName_2) {
        this.localName_2 = localName_2;
    }

    public String getLocalName_3() {
        return localName_3;
    }

    public void setLocalName_3(String localName_3) {
        this.localName_3 = localName_3;
    }

    public String getLocalName_1() {
        return localName_1;
    }

    public void setLocalName_1(String localName_1) {
        this.localName_1 = localName_1;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getPoint_x() {
        return point_x;
    }

    public void setPoint_x(String point_x) {
        this.point_x = point_x;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getZone_no() {
        return zone_no;
    }

    public void setZone_no(String zone_no) {
        this.zone_no = zone_no;
    }

    public String getSubAddress() {
        return subAddress;
    }

    public void setSubAddress(String subAddress) {
        this.subAddress = subAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPoint_y() {
        return point_y;
    }

    public void setPoint_y(String point_y) {
        this.point_y = point_y;
    }

    @Override
    public String toString() {
        return "ItemVo{" +
                "mountain='" + mountain + '\'' +
                ", mainAddress='" + mainAddress + '\'' +
                ", point_wx='" + point_wx + '\'' +
                ", point_wy='" + point_wy + '\'' +
                ", isNewAddress='" + isNewAddress + '\'' +
                ", buildingAddress='" + buildingAddress + '\'' +
                ", title='" + title + '\'' +
                ", placeName='" + placeName + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", newAddress='" + newAddress + '\'' +
                ", localName_2='" + localName_2 + '\'' +
                ", localName_3='" + localName_3 + '\'' +
                ", localName_1='" + localName_1 + '\'' +
                ", lat='" + lat + '\'' +
                ", point_x='" + point_x + '\'' +
                ", lng='" + lng + '\'' +
                ", zone_no='" + zone_no + '\'' +
                ", subAddress='" + subAddress + '\'' +
                ", id='" + id + '\'' +
                ", point_y='" + point_y + '\'' +
                '}';
    }
}
