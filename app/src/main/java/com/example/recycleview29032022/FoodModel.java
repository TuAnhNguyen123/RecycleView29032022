package com.example.recycleview29032022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<Category> categoryList;
    private String discount;
    private float distance;
    private long openTime, closeTime;

    public FoodModel(int image, String name, String address, List<Category> categoryList, String discount, float distance, long openTime, long closeTime) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.categoryList = categoryList;
        this.discount = discount;
        this.distance = distance;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(long openTime) {
        this.openTime = openTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.img_cheesecake,"Uncle Lu's Cheesecake - S?? V???n H???nh","652 S?? V???n H???nh, P. 12, Qu???n 10, TP. HCM",Arrays.asList(Category.FAMILY,Category.GROUP),"Ca?? nga??y - 15%",10.1f,Utils.createTimeToMilliSeconds(8,30),Utils.createTimeToMilliSeconds(17,20)),
                new FoodModel(R.drawable.hinh_anhquan,"C??m T???m Minh Long - Nguy???n Th??? Th???p","607 Nguy???n Th??? Th???p, P. T??n H??ng, Qu???n 7, TP. HCM",Arrays.asList(Category.FAMILY,Category.SHOP_ONLINE),"Ca ngay - 30%",22f,Utils.createTimeToMilliSeconds(7,0),Utils.createTimeToMilliSeconds(18,0)),
                new FoodModel(R.drawable.hinh_bepbamuoi,"Pizza 4P???s - Pizza Ki???u Nh???t - L?? Th??nh T??n","8/15 L?? Th??nh T??n, P. B???n Ngh??,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Ca ngay 50%",10.5f,Utils.createTimeToMilliSeconds(10,0),Utils.createTimeToMilliSeconds(18,0)),
                new FoodModel(R.drawable.hinh_crabrestaurant,"San Fu Lou - ???m Th???c Qu???ng ????ng - L?? Lai","T???ng Tr???t, AB Tower, 76A L?? Lai, P. B???n Th??nh,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Buoi sang - 10%",15f,Utils.createTimeToMilliSeconds(7,0),Utils.createTimeToMilliSeconds(19,10)),
                new FoodModel(R.drawable.hinh_dona,"Qu??n ???t ???t - Barbecue & Beer - V?? V??n Ki???t","168 V?? V??n Ki???t, P. C???u ??ng L??nh,  Qu???n 1, TP. HCM",Arrays.asList(Category.BIRTHDAY,Category.FAMILY,Category.GROUP),"Buoi toi - 20%",18f,Utils.createTimeToMilliSeconds(11,0),Utils.createTimeToMilliSeconds(24,0)),
                new FoodModel(R.drawable.hinh_minhthu8,"Fuji Japanese Restaurant ?????? - Nikko Saigon Hotel","T???ng Tr???t Nikko Saigon Hotel, 235 Nguy???n V??n C???, P. Ph???m Ng?? L??o,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Kh??ng c?? ??u ????i",14.7f,Utils.createTimeToMilliSeconds(10,18),Utils.createTimeToMilliSeconds(19,11)),
                new FoodModel(R.drawable.hinh_phalaucomai,"Shabu Ya - SC VivoCity","T???ng 4 - SC VivoCity, 1058 Nguy???n V??n Linh, KP. 1, P. T??n Phong,  Qu???n 7, TP. HCM",Arrays.asList(Category.BUFFET,Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Ca ngay 15%",28.4f,Utils.createTimeToMilliSeconds(9,5),Utils.createTimeToMilliSeconds(22,1)),
                new FoodModel(R.drawable.hinh_popy,"Hana BBQ & Hot Pot Buffet - Nguy???n Qu?? ?????c","65 Nguy???n Qu?? ?????c, P. An Ph??,  Qu???n 2, TP. HCM",Arrays.asList(Category.BUFFET,Category.RESTAURANT,Category.FAMILY),"Buoi sang 10%",13.2f,Utils.createTimeToMilliSeconds(8,5),Utils.createTimeToMilliSeconds(22,5)),
                new FoodModel(R.drawable.hinh_tamki2,"Qu??n Chay KVegetarian - B??nh Th???nh","20/15 Phan ????ng L??u, P. 6,  Qu???n B??nh Th???nh, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Kh??ng c?? ??u ????i",7.3f,Utils.createTimeToMilliSeconds(9,3),Utils.createTimeToMilliSeconds(21,2))
       ));
    }
    public static List<FoodModel> getMoreData(){
        return new ArrayList<>(Arrays.asList(
        new FoodModel(R.drawable.img_cheesecake,"Uncle Lu's Cheesecake - S?? V???n H???nh","652 S?? V???n H???nh, P. 12, Qu???n 10, TP. HCM",Arrays.asList(Category.FAMILY,Category.GROUP),"Ca?? nga??y - 15%",10.1f,Utils.createTimeToMilliSeconds(8,30),Utils.createTimeToMilliSeconds(17,20)),
                new FoodModel(R.drawable.hinh_anhquan,"C??m T???m Minh Long - Nguy???n Th??? Th???p","607 Nguy???n Th??? Th???p, P. T??n H??ng, Qu???n 7, TP. HCM",Arrays.asList(Category.FAMILY,Category.SHOP_ONLINE),"Ca ngay - 30%",22f,Utils.createTimeToMilliSeconds(7,0),Utils.createTimeToMilliSeconds(18,0)),
                new FoodModel(R.drawable.hinh_bepbamuoi,"Pizza 4P???s - Pizza Ki???u Nh???t - L?? Th??nh T??n","8/15 L?? Th??nh T??n, P. B???n Ngh??,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Ca ngay 50%",10.5f,Utils.createTimeToMilliSeconds(10,0),Utils.createTimeToMilliSeconds(18,0)),
                new FoodModel(R.drawable.hinh_crabrestaurant,"San Fu Lou - ???m Th???c Qu???ng ????ng - L?? Lai","T???ng Tr???t, AB Tower, 76A L?? Lai, P. B???n Th??nh,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Buoi sang - 10%",15f,Utils.createTimeToMilliSeconds(7,0),Utils.createTimeToMilliSeconds(19,10)),
                new FoodModel(R.drawable.hinh_dona,"Qu??n ???t ???t - Barbecue & Beer - V?? V??n Ki???t","168 V?? V??n Ki???t, P. C???u ??ng L??nh,  Qu???n 1, TP. HCM",Arrays.asList(Category.BIRTHDAY,Category.FAMILY,Category.GROUP),"Buoi toi - 20%",18f,Utils.createTimeToMilliSeconds(11,0),Utils.createTimeToMilliSeconds(24,0)),
                new FoodModel(R.drawable.hinh_minhthu8,"Fuji Japanese Restaurant ?????? - Nikko Saigon Hotel","T???ng Tr???t Nikko Saigon Hotel, 235 Nguy???n V??n C???, P. Ph???m Ng?? L??o,  Qu???n 1, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Kh??ng c?? ??u ????i",14.7f,Utils.createTimeToMilliSeconds(10,18),Utils.createTimeToMilliSeconds(19,11)),
                new FoodModel(R.drawable.hinh_phalaucomai,"Shabu Ya - SC VivoCity","T???ng 4 - SC VivoCity, 1058 Nguy???n V??n Linh, KP. 1, P. T??n Phong,  Qu???n 7, TP. HCM",Arrays.asList(Category.BUFFET,Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Ca ngay 15%",28.4f,Utils.createTimeToMilliSeconds(9,5),Utils.createTimeToMilliSeconds(22,1)),
                new FoodModel(R.drawable.hinh_popy,"Hana BBQ & Hot Pot Buffet - Nguy???n Qu?? ?????c","65 Nguy???n Qu?? ?????c, P. An Ph??,  Qu???n 2, TP. HCM",Arrays.asList(Category.BUFFET,Category.RESTAURANT,Category.FAMILY),"Buoi sang 10%",13.2f,Utils.createTimeToMilliSeconds(8,5),Utils.createTimeToMilliSeconds(22,5)),
                new FoodModel(R.drawable.hinh_tamki2,"Qu??n Chay KVegetarian - B??nh Th???nh","20/15 Phan ????ng L??u, P. 6,  Qu???n B??nh Th???nh, TP. HCM",Arrays.asList(Category.RESTAURANT,Category.FAMILY,Category.GROUP),"Kh??ng c?? ??u ????i",7.3f,Utils.createTimeToMilliSeconds(9,3),Utils.createTimeToMilliSeconds(21,2))
        ));
    }

}
