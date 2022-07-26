package com.obss.jss.day4.generics.genericclass;

public class Main {

    public static void main(String[] args) {

        AccountsResponse accountsResponse = getCustomerAccounts();
        BaseResponse<AccountsResponse> responseAccounts = new BaseResponse<AccountsResponse>(accountsResponse);
        System.out.println(responseAccounts.toString());

        LoginResponse loginResponse = login();
        BaseResponse<LoginResponse> responseLogin = new BaseResponse<>(loginResponse);
        System.out.println(responseLogin);

        
        KeyValuePair<Integer, String> keyValue = new KeyValuePair<Integer, String>();
        keyValue.setKey(10);
        keyValue.setValue("value");
        //keyValue.setKey("abc"); //compile error
        System.out.println(keyValue.getKey());
        
        Triplet<String, String, Integer> triplet
        	= new Triplet<String, String, Integer>("a", 1, "b");
        System.out.println(triplet.getK());
        
    }

    private static AccountsResponse getCustomerAccounts() {
        // ex: connect to db and get accounts
        // ....

        // return accounts
        AccountsResponse accountsResponse
                = new AccountsResponse("11111", 1000);
        return accountsResponse;
    }

    private static LoginResponse login() {

        // check username and password etc.
        LoginResponse response = new LoginResponse(true, "Yasin", "Razlik");
        return response;
    }
}
