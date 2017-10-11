// AccountQuery.aidl
package com.youga.serviceapplication;
import com.youga.serviceapplication.BankAccount;
// Declare any non-default types here with import statements

interface AccountQuery {

    BankAccount query(in String name);
}
