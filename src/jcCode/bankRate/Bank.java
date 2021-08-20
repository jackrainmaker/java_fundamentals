package jcCode.bankRate;

class Bank {
    float interestRate;
    void getRateOfInterest(){
        System.out.println("The rate of interest is "+interestRate);
    }
    public static void main(String[] args) {

        Bank SBI = new Bank();
        SBI.getRateOfInterest();

        Bank ICIC = new Bank();
        ICIC.getRateOfInterest();

        Bank AXIS = new Bank();
        AXIS.getRateOfInterest();

    }


}

class SBI extends Bank {
    float interestRate = 0.08f;


}
class ICICI extends Bank {
    float interestRate = 0.07f;

}

class AXIS extends Bank {
    float interestRate = 0.09f;
}


