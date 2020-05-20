package com.lombok;

public class application
{
    public static void main(String[] args) {
        //without lombok
        bank bank = new bank();
        bank.setId(23478981L);
        bank.setBankName("Credit Sussie");
        bank.setBranchName("Riga");
        System.out.println("This is the id  " + bank.getId() + " of "
                + bank.getBankName() + " and branch is " + bank.getBranchName()) ;

        //Lazy getter
        lazyLoading loading = new lazyLoading();
        double value[] = loading.getCached();
        System.out.println("here i am showing the length of the cached data from consecutive operation and try : "
                + value.length);

        //with lombok
        customer customer = new customer();
        customer.setFirstName("Joy");

        //lazy loading
        customer.setCached(value);

        System.out.println("customer name with lombok :" + customer.getFirstName());
        System.out.println("Customer class is loading cached data : "
                +customer.getCached().length);
    }
}
