package za.ac.cput.domain;

/*
 * Payment.java
 * Entity for the Payment
 * Author: Thina Mzosindiso Nontwabaza (219189153)
 * Date: 21 March 2024
 */
public class Payment {
    private String paymentID;
    private String reservationID;
    private double totalAmount;
    private String paymentType;
    private String date;

    private Payment(){

    }

    private Payment(Builder builder){
        this.paymentID = builder.paymentID;
        this.reservationID = builder.reservationID;
        this.totalAmount = builder.totalAmount;
        this.paymentType = builder.paymentType;
        this.date = builder.date;
    }
    //Getters
    public String getPaymentID() {
        return paymentID;
    }

    public String getReservationID() {
        return reservationID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID='" + paymentID + '\'' +
                ", reservationID='" + reservationID + '\'' +
                ", totalAmount=" + totalAmount +
                ", paymentType='" + paymentType + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static class Builder{
        private String paymentID;
        private String reservationID;
        private double totalAmount;
        private String paymentType;
        private String date;

        public Builder setPaymentID(String paymentID) {
            this.paymentID = paymentID;
            return this;
        }

        public Builder setReservationID(String reservationID) {
            this.reservationID = reservationID;
            return this;
        }

        public Builder setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder copy(Payment payment){
            this.paymentID = payment.paymentID;
            this.reservationID = payment.reservationID;
            this.totalAmount = payment.totalAmount;
            this.paymentType = payment.paymentType;
            this.date = payment.date;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}
