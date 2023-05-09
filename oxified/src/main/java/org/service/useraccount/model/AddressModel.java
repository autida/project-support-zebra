package main.java.org.service.useraccount.model;


import java.util.Objects;

public class AddressModel {
    private String addressId;
    private String houseNumber;
    private String lotNumber;
    private String blockNumber;
    private String street;
    private String baranggay;
    private String city;
    private String province;
    private int zipCode;

    public AddressModel(Builder builder) {
        this.addressId = builder.addressId;
        this.houseNumber = builder.houseNumber;
        this.lotNumber = builder.lotNumber;
        this.blockNumber = builder.blockNumber;
        this.street = builder.street;
        this.baranggay = builder.baranggay;
        this.city = builder.city;
        this.province = builder.province;
        this.zipCode = builder.zipCode;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBaranggay() {
        return baranggay;
    }

    public void setBaranggay(String baranggay) {
        this.baranggay = baranggay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public static Builder builder() { return new Builder();}

    public static final class Builder {
        private String addressId;
        private String houseNumber;
        private String lotNumber;
        private String blockNumber;
        private String street;
        private String baranggay;
        private String city;
        private String province;
        private int zipCode;

        public Builder withAddressId(String addressIdToUse) {
            this.addressId = addressIdToUse;
            return this;
        }

        public Builder withhouseNumber(String houseNumberToUse) {
            this.houseNumber = houseNumberToUse;
            return this;
        }
        public Builder withLotNumber(String lotNumberToUse) {
            this.lotNumber = lotNumberToUse;
            return this;
        }

        public Builder withBlockNumber(String blockNumberToUse) {
            this.blockNumber = blockNumberToUse;
            return this;
        }

        public Builder withStreet(String streetToUse) {
            this.street = streetToUse;
            return this;
        }

        public Builder withBaranggay(String baranggayToUse) {
            this.baranggay = baranggayToUse;
            return this;
        }

        public Builder withCity(String cityToUse) {
            this.city = cityToUse;
            return this;
        }

        public Builder withProvince(String provinceToUse) {
            this.province = provinceToUse;
            return this;
        }
        public Builder withZipcode(int zipCodeToUse) {
            this.zipCode = zipCodeToUse;
            return this;
        }

        public AddressModel build() {return new AddressModel(this);}
    }


    @Override
    public String toString() {
        return "AddressModel{" +
                "addressId='" + addressId + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", lotNumber='" + lotNumber + '\'' +
                ", blockNumber='" + blockNumber + '\'' +
                ", street='" + street + '\'' +
                ", baranggay='" + baranggay + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressModel)) return false;
        AddressModel that = (AddressModel) o;
        return zipCode == that.zipCode && Objects.equals(addressId, that.addressId) && Objects.equals(houseNumber, that.houseNumber) && Objects.equals(lotNumber, that.lotNumber) && Objects.equals(blockNumber, that.blockNumber) && Objects.equals(street, that.street) && Objects.equals(baranggay, that.baranggay) && Objects.equals(city, that.city) && Objects.equals(province, that.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, houseNumber, lotNumber, blockNumber, street, baranggay, city, province, zipCode);
    }


}
