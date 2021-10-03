package com.keycain;

public class OfficeKeychainState implements KeychainState {
  
    private final Context context;
  
    public OfficeKeychainState(Context context) {
      this.context = context;
    }
  
    @Override
    public void work() {
      System.out.println("Office Keychain is working...");
    }
  
    @Override
    public void wash() {
      System.out.println("Wash the Office Keychain...");
    }
  }